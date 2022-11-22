package com.puppypets.controlador.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import com.puppypets.controlador.CtrlFrames;
import com.puppypets.modelo.Mascota;
import com.puppypets.modelo.Veterinario;
import com.puppypets.modelo.builder.Cita;
import com.puppypets.modelo.builder.ConstructorCita;
import com.puppypets.modelo.proxy.Cliente;
import com.puppypets.modelo.proxy.ClienteProxy;
import com.puppypets.vista.MiniPanel;
import com.puppypets.vista.menu_clientes.MenuCliente;
import com.puppypets.vista.menu_clientes.PanelPago;
import com.puppypets.vista.menu_clientes.strategy.OpcionActual;
import com.puppypets.vista.menu_clientes.strategy.PanelCirugia;
import com.puppypets.vista.menu_clientes.strategy.PanelCita;
import com.puppypets.vista.menu_clientes.strategy.PanelEstetica;
import com.puppypets.vista.menu_clientes.strategy.PanelEstudios;
import com.puppypets.vista.menu_clientes.strategy.PanelVacunacion;

public class CtrlMenuCliente extends MouseAdapter implements CtrlFrames {
	private static CtrlMenuCliente controlador;
	private MenuCliente frmMenu;
	private Cliente usuarioActual;
	private ConstructorCita builder;
	private ClienteProxy proxy;

	private CtrlMenuCliente() {
		frmMenu = new MenuCliente();
		frmMenu.getPanelOpciones().getMiniPaneles().stream().forEach(c -> c.addMouseListener(this));
		builder = new ConstructorCita();
	}

	public static CtrlMenuCliente getInstancia() {
		if (controlador == null)
			controlador = new CtrlMenuCliente();
		return controlador;
	}

	@Override
	public void iniciaFrame() {
		frmMenu.setVisible(true);
	}

	@Override
	public void ocultaFrame() {
		frmMenu.setVisible(false);
	}

	@Override
	public void eliminaFrame() {
		frmMenu.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object accion = e.getSource();
		if (esPago(accion)) {
			if (!(usuarioActual.getPrecioTotal() < 1))
				pagoCitas();
			else if (usuarioActual.getCitasAgendadas().size() == 0)
				mandaMensaje("No ha realizado ninguna cita", "Info");
			else
				mandaMensaje("Ya ha pagado todas sus citas", "Info");
			limpiaCampos();
		} else if (esGuardar(accion)) {
			accionCita();
		} else if (esCancelar(accion) || esPagoEnTienda(accion)) {
			limpiaCampos();
		}
	}

	private boolean esGuardar(Object accion) {
		return frmMenu.getPanelActual().getPanelCitaOp().map(p -> p.getBtnGuardar().equals(accion)).orElse(false);
	}

	private boolean esCancelar(Object accion) {
		return frmMenu.getPanelActual().getPanelCitaOp().map(p -> p.getBtnCancelar().equals(accion)).orElse(false);
	}

	private boolean esPago(Object accion) {
		return frmMenu.getPanelActual().getPanelPagoOp().map(p -> p.getBtnGuardar().equals(accion)).orElse(false);
	}

	private boolean esPagoEnTienda(Object accion) {
		return frmMenu.getPanelActual().getPanelPagoOp().map(p -> p.getBtnCancelar().equals(accion)).orElse(false);
	}

	private void pagoCitas() {
		proxy = new ClienteProxy(usuarioActual);
		String cuenta = JOptionPane.showInputDialog("Ingrese su cuenta bancaria");
		try {
			proxy.pagoServicios(cuenta, usuarioActual.getPrecioTotal());
			usuarioActual.getCitasAgendadas().stream().forEach(c -> c.setPago(true));
			mandaMensaje("Ha pagado sus citas", "Exito");
		} catch (IllegalArgumentException iae) {
			mandaError("Las cuentan no son iguales, se cerrara sesión");
			CtrlLogIn.getInstancia().iniciaFrame();
			ocultaFrame();
			frmMenu.getPanelOpciones().limpiar();
			frmMenu.restablece();
		} catch (NoSuchElementException nsee) {
			mandaError("No cuenta con el saldo suficiente");
			limpiaCampos();
		}
	}

	private void accionCita() {
		guardaCita();
		if (frmMenu.getPanelActual().getPanelCita() instanceof PanelCirugia) {
			frmMenu.cambioPanel(new PanelEstudios(), frmMenu.getPanelOpciones().getPanelEstudios());
			frmMenu.getPanelActual().getPanelCita().getBtnGuardar().addActionListener(this);
			frmMenu.getPanelActual().getPanelCita().getBtnCancelar().addActionListener(this);
		} else
			limpiaCampos();
	}

	private void verificaNombreMascota(String nombre) {
		if (nombre.equals(""))
			throw new IllegalArgumentException();
	}

	private void guardaCita() {
		try {
			String nombre = getPanelCambios().getTxtNombreMascota().getText();
			verificaNombreMascota(nombre);
			String sexo = obtenerTxtDeCmb(getPanelCambios().getCmbSexo());
			String especie = obtenerTxtDeCmb(getPanelCambios().getCmbEspecie());
			int edad = Integer.parseInt(obtenerTxtDeCmb(getPanelCambios().getCmbEdad()));
			Mascota mascota = new Mascota(usuarioActual, nombre, sexo, especie, edad);
			CtrlClientes.getInstancia().encuentraMascota(usuarioActual, mascota).ifPresentOrElse(this::creaCita,
					() -> agregaNuevaMascota(mascota));
		} catch (IllegalArgumentException iae) {
			mandaError("No colocó el nombre de su mascota");
			limpiaCampos();
		}
	}

	private void llenarTabla() {
		usuarioActual.getCitasAgendadas().stream().forEach(p -> frmMenu.getPanelActual().getPanelPago().llenaCampo(p));
	}

	@SuppressWarnings("rawtypes")
	private String obtenerTxtDeCmb(JComboBox cmb) {
		return cmb.getSelectedItem().toString();
	}

	private void agregaNuevaMascota(Mascota mascota) {
		usuarioActual.agregaMascota(mascota);
		creaCita(mascota);
	}

	private void creaCita(Mascota mascota) {
		builder.setMascota(mascota);
		builder.setExpress(getPanelCambios().getMotivacion().contains("[E]"));
		builder.setMotivo(getPanelCambios().getMotivacion());
		CtrlVeterinarios.getInstancia().vetDisponible(getPanelCambios().getHora())
				.ifPresentOrElse(this::especificaFecha, () -> noHayVeterinarios());
	}

	private void noHayVeterinarios() {
		mandaError("No hay veterinario que pueda atender su cita en esa hora.");
		limpiaCampos();
	}

	private void especificaFecha(Veterinario disponible) {
		builder.setTiempo(getPanelCambios().getHora());
		Cita nuevaCita = new Cita(builder);
		usuarioActual.agregarCita(nuevaCita);
		disponible.agregaCita(nuevaCita);
		mandaMensaje("Se ha confirmado su cita", "Éxito");
	}

	private OpcionActual getPanelCambios() {
		return frmMenu.getPanelActual().getPanelCita();
	}

	@Override
	public void limpiaCampos() {
		frmMenu.getPanelOpciones().limpiar();
		frmMenu.restablece();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object panelPulsado = e.getSource();
		if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelCita())) {
			frmMenu.cambioPanel(new PanelCita(), frmMenu.getPanelOpciones().getPanelCita());
		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelCirugia())) {
			frmMenu.cambioPanel(new PanelCirugia(), frmMenu.getPanelOpciones().getPanelCirugia());
		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelEstetica())) {
			frmMenu.cambioPanel(new PanelEstetica(), frmMenu.getPanelOpciones().getPanelEstetica());
		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelVacunacion())) {
			frmMenu.cambioPanel(new PanelVacunacion(), frmMenu.getPanelOpciones().getPanelVacunacion());
		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelEstudios())) {
			frmMenu.cambioPanel(new PanelEstudios(), frmMenu.getPanelOpciones().getPanelEstudios());
		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelPago())) {
			frmMenu.cambioPanel(new PanelPago(), frmMenu.getPanelOpciones().getPanelPago());
			llenarTabla();
		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelLogOut())) {
			CtrlLogIn.getInstancia().iniciaFrame();
			ocultaFrame();
			frmMenu.getPanelOpciones().limpiar();
			frmMenu.restablece();
		}
		if (frmMenu.getPanelActual().getPanelCita() != null
				&& frmMenu.getPanelActual().getPanelCita().getBtnGuardar() != null
				&& frmMenu.getPanelActual().getPanelCita().getBtnCancelar() != null) {
			frmMenu.getPanelActual().getPanelCita().getBtnGuardar().addActionListener(this);
			frmMenu.getPanelActual().getPanelCita().getBtnCancelar().addActionListener(this);
		}
		if (frmMenu.getPanelActual().getPanelPago() != null
				&& frmMenu.getPanelActual().getPanelPago().getBtnGuardar() != null
				&& frmMenu.getPanelActual().getPanelPago().getBtnCancelar() != null) {
			frmMenu.getPanelActual().getPanelPago().getBtnGuardar().addActionListener(this);
			frmMenu.getPanelActual().getPanelPago().getBtnCancelar().addActionListener(this);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object panelPulsado = e.getSource();
		panelSinClick(panelPulsado).ifPresent(p -> p.iluminaOpcion());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object panelPulsado = e.getSource();
		panelSinClick(panelPulsado).ifPresent(p -> p.restableceOpcion());
	}

	@Override
	public void mandaError(String error) {
		JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.ERROR_MESSAGE);
		limpiaCampos();
	}

	@Override
	public void mandaMensaje(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public void setUsuarioActual(Cliente usuarioActual) {
		this.usuarioActual = usuarioActual;
	}

	private Optional<MiniPanel> panelSinClick(Object panelPulsado) {
		return frmMenu.getPanelOpciones().getMiniPaneles().stream()
				.filter(p -> panelPulsado.equals(p) && p.getClicks() < 1).findAny();
	}

}
