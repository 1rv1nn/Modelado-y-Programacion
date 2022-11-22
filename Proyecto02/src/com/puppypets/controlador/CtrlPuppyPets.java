//package com.puppypets.controlador;
//
//import java.awt.Color;
//import java.awt.Cursor;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//import javax.swing.JOptionPane;
//
//import com.puppypets.modelo.Cliente;
//import com.puppypets.modelo.ClienteProxy;
//import com.puppypets.modelo.Usuario;
//import com.puppypets.vista.InicioSesion;
//import com.puppypets.vista.MiniPanel;
//import com.puppypets.vista.Registro;
//import com.puppypets.vista.menu_clientes.OpcionActual;
//import com.puppypets.vista.menu_clientes.PanelCirugia;
//import com.puppypets.vista.menu_clientes.PanelEstetica;
//import com.puppypets.vista.menu_clientes.PanelEstudios;
//import com.puppypets.vista.menu_clientes.PanelCita;
//import com.puppypets.vista.menu_clientes.PanelVacunacion;
//import com.puppypets.vista.menu_clientes.MenuCliente;
//
//public class CtrlPuppyPets extends MouseAdapter implements ActionListener {
//	private InicioSesion is;
//	private Registro r;
//	private MenuCliente mc;
//	private ClienteProxy cp;
//	private CtrlClientes cc;
//	private CtrlVeterinarios cv;
//
//	public CtrlPuppyPets(InicioSesion is, Registro r, MenuCliente mc) {
//		this.is = is;
//		this.r = r;
//		this.mc = mc;
//		this.cc = CtrlClientes.getInstancia();
//		this.cv = CtrlVeterinarios.getInstancia();
//		agregarEventos();
//	}
//	
//	public void cambiaInicioSesion() {
//		is.setVisible(true);
//	}
//
//	private void agregarEventos() {
//		is.getBtnLogIn().addActionListener(this);
//		is.getBtnRegister().addActionListener(this);
//		r.getBtnGuardar().addActionListener(this);
//		r.getBtnCancelar().addActionListener(this);
//
//		mc.getPanelOpciones().getPanelCita().addMouseListener(this);
//		mc.getPanelOpciones().getPanelCirugia().addMouseListener(this);
//		mc.getPanelOpciones().getPanelEstetica().addMouseListener(this);
//		mc.getPanelOpciones().getPanelVacunacion().addMouseListener(this);
//		mc.getPanelOpciones().getPanelEstudios().addMouseListener(this);
//		mc.getPanelOpciones().getPanelPago().addMouseListener(this);
//		mc.getPanelOpciones().getPanelLogOut().addMouseListener(this);
//	}
//
//	public void inicia() {
//		is.setVisible(true);
//	}
//
//	private void inicioDeSesion() {
//		String nombre = is.getTxtUsername().getText();
//		StringBuilder password = new StringBuilder();
//		password.append(is.getPasswordField().getPassword());
//		compruebaUsuario(nombre, password.toString());
//	}
//	
//	private void compruebaUsuario(String nombre, String password) {
//		cc.obtenerCliente(nombre).ifPresentOrElse(c -> inicio(c, password), () -> {
//			cv.obtenerVeterinario(nombre).ifPresentOrElse(v -> inicio(v, password), () -> {
//				mandaError("No existe la cuenta que indico, registrese.");
//				limpiarCamposInicio();
//			});
//		});
//	}
//
//	private void inicio(Usuario u, String s) {
//		if (u.getPassword().equals(s)) {
//			is.setVisible(false);
//			mc.setVisible(true);
//			limpiarCamposInicio();
//			//cp = new ClienteProxy(cc.obtenerCliente(u.getUsuario()).get());
//		} else {
//			mandaError("La contraseña es incorrecta intente de nuevo.");
//			limpiarCamposInicio();
//		}
//	}
//
//	private void limpiarCamposInicio() {
//		is.getTxtUsername().setText("");
//		is.getPasswordField().setText("");
//	}
//
//	private void registro() {
//		String nombre = r.getTxtNombre().getText();
//		String usuario = r.getTxtUsuario().getText();
//		String telefono = r.getTxtTelefono().getText();
//		String cuenta = r.getTxtCuenta().getText();
//		String direccion = r.getTxtDireccion().getText();
//		StringBuilder password = new StringBuilder();
//		password.append(r.getPasswordField().getPassword());
//		StringBuilder passwordConfirm = new StringBuilder();
//		passwordConfirm.append(r.getPasswordConfirmacion().getPassword());
//
//		Cliente clienteNuevo = new Cliente(usuario, password.toString(), nombre, telefono, direccion, cuenta);
//		String validacion = cc.validaDatosCliente(clienteNuevo);
//
//		if (validacion.contains("TEL")) {
//			mandaError("Ingreso un télefono invalido.");
//			limpiarCamposRegistro();
//			return;
//		} else if (validacion.contains("NUM")) {
//			mandaError("Ingreso un número de cuenta invalido.");
//			limpiarCamposRegistro();
//			return;
//		} else if (validacion.contains("USUARIO")) {
//			mandaError("El usuario ya existe, intente con otro.");
//			limpiarCamposRegistro();
//			return;
//		} else if (!r.getChckbxTerminos().isSelected()) {
//			mandaError("No ha aceptado los terminos de condición");
//			limpiarCamposRegistro();
//			return;
//		} else if (nombre.equals("") || direccion.equals("") || usuario.equals("")) {
//			mandaError("No ha contestado toda la informacion");
//			limpiarCamposRegistro();
//			return;
//		} else if (!password.toString().equals(passwordConfirm.toString())) {
//			mandaError("Las contraseñas no coinciden");
//			limpiarCamposRegistro();
//			return;
//		}
//		cc.agregaCliente(clienteNuevo);
//		mandaMensaje("Se ha registrado el usuario correctamente.", "Registro completado");
//		limpiarCamposRegistro();
//		r.setVisible(false);
//		is.setVisible(true);
//	}
//
//	private static void mandaError(String error) {
//		JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.ERROR_MESSAGE);
//	}
//
//	private static void mandaMensaje(String mensaje, String titulo) {
//		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
//	}
//
//	private void limpiarCamposRegistro() {
//		r.getTxtNombre().setText("");
//		r.getTxtTelefono().setText("");
//		r.getTxtDireccion().setText("");
//		r.getTxtCuenta().setText("");
//		r.getTxtUsuario().setText("");
//		r.getPasswordConfirmacion().setText("");
//		r.getPasswordField().setText("");
//		r.getChckbxTerminos().setSelected(false);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Object accion = e.getSource();
//		if (accion.equals(is.getBtnLogIn())) {
//			inicioDeSesion();
//		} else if (accion.equals(is.getBtnRegister())) {
//			is.setVisible(false);
//			r.setVisible(true);
//		} else if (accion.equals(r.getBtnGuardar())) {
//			registro();
//		} else if (accion.equals(r.getBtnCancelar())) {
//			r.setVisible(false);
//			is.setVisible(true);
//		} else if (accion.equals(mc.getPanelOpciones().getPanelActual().getBtnGuardar())) {
//			System.out.println("hola");
//		} else if (accion.equals(mc.getPanelOpciones().getPanelActual().getBtnCancelar())) {
//			mc.getPanelOpciones().limpiar();
//			mc.restablece();
//		}
//	}
//
//	public void cambioPaneles(int i, OpcionActual ca, MiniPanel mp) {
//		mc.getPanelOpciones().limpiar();
////		mc.getPanelOpciones().aumentaIndice(i);
//		mc.getPanelOpciones().getPanelCambio().removeAll();
//		mc.getPanelOpciones().getPanelCambio().repaint();
//		mc.getPanelOpciones().getPanelCambio().revalidate();
//		mc.getPanelOpciones().setPanelActual(ca);
//		mc.getPanelOpciones().getPanelCambio().add(mc.getPanelOpciones().getPanelActual());
//		mp.setBackground(new Color(66, 219, 140));
//		mc.getPanelOpciones().getPanelCambio().revalidate();
//	}
//
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		Object panelPulsado = e.getSource();
//		if (panelPulsado.equals(mc.getPanelOpciones().getPanelCita())) {
//			cambioPaneles(0, new PanelCita(), mc.getPanelOpciones().getPanelCita());
//		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelCirugia())) {
//			cambioPaneles(1, new PanelCirugia(), mc.getPanelOpciones().getPanelCirugia());
//		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelEstetica())) {
//			cambioPaneles(2, new PanelEstetica(), mc.getPanelOpciones().getPanelEstetica());
//		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelVacunacion())) {
//			cambioPaneles(3, new PanelVacunacion(), mc.getPanelOpciones().getPanelVacunacion());
//		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelEstudios())) {
//			cambioPaneles(4, new PanelEstudios(), mc.getPanelOpciones().getPanelEstudios());
//		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelPago())) {
//			cambioPaneles(5, new PanelEstudios(), mc.getPanelOpciones().getPanelPago());
//		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelLogOut())) {
//			is.setVisible(true);
//			mc.setVisible(false);
//			mc.getPanelOpciones().limpiar();
//			mc.restablece();
//		}
//		if (mc.getPanelOpciones().getPanelActual() != null && mc.getPanelOpciones().getPanelActual().getBtnGuardar() != null
//				&& mc.getPanelOpciones().getPanelActual().getBtnCancelar() != null) {
//			mc.getPanelOpciones().getPanelActual().getBtnGuardar().addActionListener(this);
//			mc.getPanelOpciones().getPanelActual().getBtnCancelar().addActionListener(this);
//		}
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		Object panelPulsado = e.getSource();
////		if (panelPulsado.equals(mc.getPanelOpciones().getPanelCita()) && mc.getPanelOpciones().getEventos()[0] < 1) {
////			mc.getPanelOpciones().getPanelCita().setCursor(new Cursor(Cursor.HAND_CURSOR));
////			mc.getPanelOpciones().getPanelCita().setBackground(new Color(66, 219, 140));
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelCirugia()) && mc.getPanelOpciones().getEventos()[1] < 1) {
////			mc.getPanelOpciones().getPanelCirugia().setCursor(new Cursor(Cursor.HAND_CURSOR));
////			mc.getPanelOpciones().getPanelCirugia().setBackground(new Color(66, 219, 140));
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelEstetica()) && mc.getPanelOpciones().getEventos()[2] < 1) {
////			mc.getPanelOpciones().getPanelEstetica().setCursor(new Cursor(Cursor.HAND_CURSOR));
////			mc.getPanelOpciones().getPanelEstetica().setBackground(new Color(66, 219, 140));
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelVacunacion()) && mc.getPanelOpciones().getEventos()[3] < 1) {
////			mc.getPanelOpciones().getPanelVacunacion().setCursor(new Cursor(Cursor.HAND_CURSOR));
////			mc.getPanelOpciones().getPanelVacunacion().setBackground(new Color(66, 219, 140));
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelEstudios()) && mc.getPanelOpciones().getEventos()[4] < 1) {
////			mc.getPanelOpciones().getPanelEstudios().setCursor(new Cursor(Cursor.HAND_CURSOR));
////			mc.getPanelOpciones().getPanelEstudios().setBackground(new Color(66, 219, 140));
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelPago()) && mc.getPanelOpciones().getEventos()[5] < 1) {
////			mc.getPanelOpciones().getPanelPago().setCursor(new Cursor(Cursor.HAND_CURSOR));
////			mc.getPanelOpciones().getPanelPago().setBackground(new Color(66, 219, 140));
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelLogOut()) && mc.getPanelOpciones().getEventos()[6] < 1) {
////			mc.getPanelOpciones().getPanelLogOut().setCursor(new Cursor(Cursor.HAND_CURSOR));
////			mc.getPanelOpciones().getPanelLogOut().setBackground(new Color(66, 219, 140));
////		}
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		Object panelPulsado = e.getSource();
////		if (panelPulsado.equals(mc.getPanelOpciones().getPanelCita()) && mc.getPanelOpciones().getEventos()[0] < 1) {
////			mc.getPanelOpciones().getPanelCita().setBackground(mc.getPanelOpciones().VERDE);
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelCirugia()) && mc.getPanelOpciones().getEventos()[1] < 1) {
////			mc.getPanelOpciones().getPanelCirugia().setBackground(mc.getPanelOpciones().VERDE);
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelEstetica()) && mc.getPanelOpciones().getEventos()[2] < 1) {
////			mc.getPanelOpciones().getPanelEstetica().setBackground(mc.getPanelOpciones().VERDE);
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelVacunacion()) && mc.getPanelOpciones().getEventos()[3] < 1) {
////			mc.getPanelOpciones().getPanelVacunacion().setBackground(mc.getPanelOpciones().VERDE);
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelEstudios()) && mc.getPanelOpciones().getEventos()[4] < 1) {
////			mc.getPanelOpciones().getPanelEstudios().setBackground(mc.getPanelOpciones().VERDE);
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelPago()) && mc.getPanelOpciones().getEventos()[5] < 1) {
////			mc.getPanelOpciones().getPanelPago().setBackground(mc.getPanelOpciones().VERDE_OSCURO);
////		} else if (panelPulsado.equals(mc.getPanelOpciones().getPanelLogOut()) && mc.getPanelOpciones().getEventos()[6] < 1) {
////			mc.getPanelOpciones().getPanelLogOut().setBackground(mc.getPanelOpciones().VERDE_OSCURO);
////		}
//	}
//}
