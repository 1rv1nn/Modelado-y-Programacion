package com.puppypets.controlador.singleton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
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

/**
 * Clase que implementa el controlador de menu del cliente.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
public class CtrlMenuCliente extends MouseAdapter implements CtrlFrames {
	private static CtrlMenuCliente controlador;
	private MenuCliente frmMenu;
	private Cliente usuarioActual;
	private ConstructorCita builder;
	private ClienteProxy proxy;

	/**
	 * Método constructor de la clase.
	 */
	private CtrlMenuCliente() {
		frmMenu = new MenuCliente();
		frmMenu.getPanelOpciones().getMiniPaneles().stream().forEach(c -> c.addMouseListener(this));
		builder = new ConstructorCita();
	}

	/**
	 * Método para obtener una instancia de la clase.
	 * 
	 * @return Controlador del menu
	 */
	public static CtrlMenuCliente getInstancia() {
		if (controlador == null)
			controlador = new CtrlMenuCliente();
		return controlador;
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
		} else if (esGuardar(accion))
			accionCita();
		else if (esCancelar(accion) || esPagoEnTienda(accion))
			limpiaCampos();
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
			limpiaCampos();
		}
		frmMenu.getPanelActual().getPanelCitaOp().ifPresent(this::hazFuncionarBotones);
		frmMenu.getPanelActual().getPanelPagoOp().ifPresent(this::hazFuncionarBotones);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object panelPulsado = e.getSource();
		panelSinClick(panelPulsado).ifPresent(p -> p.iluminaOpcion(new Color(66, 219, 140)));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object panelPulsado = e.getSource();
		panelSinClick(panelPulsado).ifPresent(p -> p.restableceOpcion());
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
	public void limpiaCampos() {
		frmMenu.getPanelOpciones().limpiar();
		frmMenu.restablece();
	}

	@Override
	public void eliminaFrame() {
		frmMenu.dispose();
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

	/**
	 * Método setter
	 * 
	 * @param usuarioActual Establece quien es el usuario actual.
	 */
	public void setUsuarioActual(Cliente usuarioActual) {
		this.usuarioActual = usuarioActual;
	}

	/**
	 * Método que hace que respondan los botones al interactuar con ellos.
	 * 
	 * @param p Panel de la cita actual.
	 */
	private void hazFuncionarBotones(OpcionActual p) {
		p.getBtnGuardar().addActionListener(this);
		p.getBtnCancelar().addActionListener(this);
	}

	/**
	 * Método que hace que respondan los botones al interactuar con ellos.
	 * 
	 * @param p Panel de pago.
	 */
	private void hazFuncionarBotones(PanelPago p) {
		p.getBtnGuardar().addActionListener(this);
		p.getBtnCancelar().addActionListener(this);
	}

	/**
	 * Método que verifica si se presionó el botón guardar en un panel de cita.
	 * 
	 * @param accion Botón presionado.
	 * @return true si sí es el botón guardar, false en otro caso.
	 */
	private boolean esGuardar(Object accion) {
		return frmMenu.getPanelActual().getPanelCitaOp().map(p -> p.getBtnGuardar().equals(accion)).orElse(false);
	}

	/**
	 * Método que verifica si se presionó el botón cancelar en un panel de cita.
	 * 
	 * @param accion Botón presionado.
	 * @return true si sí es el botón cancelar, false en otro caso.
	 */
	private boolean esCancelar(Object accion) {
		return frmMenu.getPanelActual().getPanelCitaOp().map(p -> p.getBtnCancelar().equals(accion)).orElse(false);
	}

	/**
	 * Método que verifica si se presionó el botón cancelar en el panel de pago.
	 * 
	 * @param accion Botón presionado.
	 * @return true si sí es el botón cancelar, false en otro caso.
	 */
	private boolean esPago(Object accion) {
		return frmMenu.getPanelActual().getPanelPagoOp().map(p -> p.getBtnGuardar().equals(accion)).orElse(false);
	}

	/**
	 * Método que verifica si se presionó el botón cancelar en el panel de pago.
	 * 
	 * @param accion Botón presionado.
	 * @return true si sí es el botón cancelar, false en otro caso.
	 */
	private boolean esPagoEnTienda(Object accion) {
		return frmMenu.getPanelActual().getPanelPagoOp().map(p -> p.getBtnCancelar().equals(accion)).orElse(false);
	}

	/**
	 * Método para pagar las citas que se han seleccionado.
	 */
	private void pagoCitas() {
		proxy = new ClienteProxy(usuarioActual);
		String cuenta = JOptionPane.showInputDialog("Ingrese su cuenta bancaria");
		try {
			proxy.pagoServicios(cuenta, usuarioActual.getPrecioTotal());
			usuarioActual.getCitasAgendadas().stream().forEach(c -> c.setPago(true));
			mandaMensaje("Ha pagado sus citas", "Exito");
		} catch (IllegalArgumentException iae) {
			mandaError("Las cuentan no son iguales, se cerrara sesion");
			CtrlLogIn.getInstancia().iniciaFrame();
			ocultaFrame();
			frmMenu.getPanelOpciones().limpiar();
			frmMenu.restablece();
		} catch (NoSuchElementException nsee) {
			mandaError("No cuenta con el saldo suficiente");
			limpiaCampos();
		}
	}

	/**
	 * Método para guardar una cita y el caso especial donde se realiza una cirugía
	 * que implica dos citas.
	 */
	private void accionCita() {
		guardaCita();
		if (frmMenu.getPanelActual().getPanelCita() instanceof PanelCirugia) {
			frmMenu.cambioPanel(new PanelEstudios(), frmMenu.getPanelOpciones().getPanelEstudios());
			frmMenu.getPanelActual().getPanelCita().getBtnGuardar().addActionListener(this);
			frmMenu.getPanelActual().getPanelCita().getBtnCancelar().addActionListener(this);
		} else
			limpiaCampos();
	}

	/**
	 * Método que verifica que el nombre de la mascota a tratar haya sido ingresado.
	 * 
	 * @param nombre
	 */
	private void verificaNombreMascota(String nombre) {
		if (nombre.equals(""))
			throw new NoSuchElementException();
	}

	/**
	 * Método para guardar la cita.
	 */
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
			mandaError("No puede agendar una cita en el pasado");
			limpiaCampos();
		} catch (NoSuchElementException nee) {
			mandaError("No coloco el nombre de su mascota");
			limpiaCampos();
		}
	}

	/**
	 * Método para llenar la tabla de las citas que ha pedido el cliente.
	 */
	private void llenarTabla() {
		usuarioActual.getCitasAgendadas().stream().forEach(p -> frmMenu.getPanelActual().getPanelPago().llenaCampo(p));
	}

	/**
	 * Método para obtener la información de los ComboBox de los paneles de las
	 * citas.
	 * 
	 * @param cmb ComboBox del cual queremos la información
	 * @return Texto que contiene el ComboBox.
	 */
	@SuppressWarnings("rawtypes")
	private String obtenerTxtDeCmb(JComboBox cmb) {
		return cmb.getSelectedItem().toString();
	}

	/**
	 * Método para agregar una mascota nueva a la cuenta del cliente.
	 * 
	 * @param mascota
	 */
	private void agregaNuevaMascota(Mascota mascota) {
		usuarioActual.agregaMascota(mascota);
		creaCita(mascota);
	}

	/**
	 * Método que crea la cita y verifica si hay un veterinario disponible.
	 * 
	 * @param mascota
	 */
	private void creaCita(Mascota mascota) {
		if(getPanelCambios().getHora().isBefore(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault())))
			throw new IllegalArgumentException();
		builder.setMascota(mascota);
		builder.setExpress(getPanelCambios().getMotivacion().contains("[E]"));
		builder.setMotivo(getPanelCambios().getMotivacion());
		CtrlVeterinarios.getInstancia().vetDisponible(getPanelCambios().getHora())
				.ifPresentOrElse(this::especificaFecha, () -> lanzaErrorNoHayVeterinarios());
	}
	

	/**
	 * Mensaje de error cuando no hay veterinarios disponibles.
	 */
	private void lanzaErrorNoHayVeterinarios() {
		mandaError("No hay veterinario que pueda atender su cita en esa hora.");
		limpiaCampos();
	}

	/**
	 * Método para especificar la hora y fecha donde se llevará acabo una cita
	 * 
	 * @param disponible
	 */
	private void especificaFecha(Veterinario disponible) {
		builder.setTiempo(getPanelCambios().getHora());
		Cita nuevaCita = new Cita(builder);
		usuarioActual.agregarCita(nuevaCita);
		disponible.agregaCita(nuevaCita);
		mandaMensaje("Se ha confirmado su cita", "Exito");
	}

	/**
	 * Método para obetener el panel de citas.
	 * 
	 * @return Panel de cita actual
	 */
	private OpcionActual getPanelCambios() {
		return frmMenu.getPanelActual().getPanelCita();
	}

	/**
	 * Método que obtiene que paneles no han recibido un click
	 * 
	 * @param panelReceptor Panel que ha recibido un click
	 * @return Panel que no ha recibido click.
	 */
	private Optional<MiniPanel> panelSinClick(Object panelReceptor) {
		return frmMenu.getPanelOpciones().getMiniPaneles().stream()
				.filter(p -> panelReceptor.equals(p) && p.getClicks() < 1).findAny();
	}
}
