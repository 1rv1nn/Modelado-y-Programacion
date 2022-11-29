package com.puppypets.controlador.singleton;

import java.awt.event.ActionEvent;
import java.util.Optional;

import javax.swing.JOptionPane;

import com.puppypets.controlador.CtrlFrames;
import com.puppypets.modelo.Usuario;
import com.puppypets.modelo.Veterinario;
import com.puppypets.modelo.proxy.Cliente;
import com.puppypets.vista.InicioSesion;

/**
 * Clase que implementa el controlador del inicio de sesión.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
public class CtrlLogIn implements CtrlFrames {
	private static CtrlLogIn controlador;
	private CtrlClientes cc;
	private CtrlVeterinarios cv;
	private InicioSesion frmInicio;

	/**
	 * Método constructor de la clase.
	 */
	private CtrlLogIn() {
		frmInicio = new InicioSesion();
		this.cc = CtrlClientes.getInstancia();
		this.cv = CtrlVeterinarios.getInstancia();
		frmInicio.getBtnLogIn().addActionListener(this);
		frmInicio.getBtnRegister().addActionListener(this);
	}

	/**
	 * Método para obtener una instancia de la clase.
	 * 
	 * @return
	 */
	public static CtrlLogIn getInstancia() {
		if (controlador == null) {
			controlador = new CtrlLogIn();
		}
		return controlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object accion = e.getSource();
		if (accion.equals(frmInicio.getBtnLogIn())) {
			iniciaSesion().ifPresent(u -> escogePanel(u));
			limpiaCampos();
		} else if (accion.equals(frmInicio.getBtnRegister())) {
			ocultaFrame();
			CtrlRegistro.getInstancia().iniciaFrame();
		}
	}

	@Override
	public void iniciaFrame() {
		frmInicio.setVisible(true);
	}

	@Override
	public void ocultaFrame() {
		frmInicio.setVisible(false);
	}

	@Override
	public void limpiaCampos() {
		frmInicio.getTxtUsername().setText("");
		frmInicio.getPasswordField().setText("");
	}

	@Override
	public void eliminaFrame() {
		frmInicio.dispose();
	}

	@Override
	public void mandaError(String error) {
		JOptionPane.showMessageDialog(null, error, "ERROR | Al iniciar sesion", JOptionPane.ERROR_MESSAGE);
		limpiaCampos();
	}

	@Override
	public void mandaMensaje(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Método que regresa el usuario que iniciará sesión.
	 * 
	 * @return Optional del usuario, pues puede que no exista.
	 */
	private Optional<Usuario> iniciaSesion() {
		String usuario = frmInicio.getTxtUsername().getText();
		StringBuilder password = new StringBuilder();
		password.append(frmInicio.getPasswordField().getPassword());
		if (cc.obtenerCliente(usuario).isEmpty() && cv.obtenerVeterinario(usuario).isEmpty()) {
			mandaError("No existe la cuenta que ingreso, registrese.");
			return Optional.empty();
		} else if (cc.obtenerCliente(usuario).map(c -> verificaPassword(c, password.toString())).orElse(false))
			return Optional.of(cc.obtenerCliente(usuario).get());
		else if (cv.obtenerVeterinario(usuario).map(v -> verificaPassword(v, password.toString())).orElse(false))
			return Optional.of(cv.obtenerVeterinario(usuario).get());
		return Optional.empty();
	}

	/**
	 * Método que verifica la contraseña de un usuario
	 * 
	 * @param u        Usuario del cual analizaremos su contraseña.
	 * @param password Contraseña ingresada que queremos comparar.
	 * @return true si es la misma, false en otro caso.
	 */
	private boolean verificaPassword(Usuario u, String password) {
		if (u.getPassword().equals(password))
			return true;
		mandaError("La password no es correcta");
		return false;
	}

	/**
	 * Método para escoger el panel al que se accederá al iniciar sesión dependiendo
	 * el tipo de usuario.
	 * 
	 * @param u usuario que inicio sesión.
	 */
	private void escogePanel(Usuario u) {
		if (u instanceof Cliente) {
			CtrlMenuCliente.getInstancia().setUsuarioActual((Cliente) u);
			CtrlMenuCliente.getInstancia().iniciaFrame();
		} else if (u instanceof Veterinario) {
			CtrlMenuVeterinario.getInstancia().setUsuarioActual((Veterinario) u);
			CtrlMenuVeterinario.getInstancia().iniciaFrame();
		}
		ocultaFrame();
	}
}
