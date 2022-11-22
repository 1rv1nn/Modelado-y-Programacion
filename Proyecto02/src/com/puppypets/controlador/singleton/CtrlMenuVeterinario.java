package com.puppypets.controlador.singleton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;

import javax.swing.JOptionPane;

import com.puppypets.controlador.CtrlFrames;
import com.puppypets.modelo.Veterinario;
import com.puppypets.vista.MiniPanel;
import com.puppypets.vista.menu_vet.MenuVeterinario;

/**
 * Clase que implementa el controlador del menú de veterinarios.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
public class CtrlMenuVeterinario extends MouseAdapter implements CtrlFrames {

	private static CtrlMenuVeterinario controlador;
	private MenuVeterinario frmMenu;
	private Veterinario usuarioActual;

	/**
	 * Método constructor de la clase
	 */
	private CtrlMenuVeterinario() {
		frmMenu = new MenuVeterinario();
		frmMenu.getPanelOpciones().getOpciones().stream().forEach(p -> p.addMouseListener(this));
	}

	/**
	 * Método para obtener una instancia de la clase.
	 * 
	 * @return Controlador del menú.
	 */
	public static CtrlMenuVeterinario getInstancia() {
		if (controlador == null) {
			controlador = new CtrlMenuVeterinario();
		}
		return controlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object panelPulsado = e.getSource();
		if (panelPulsado.equals(frmMenu.getPanelOpciones().getCitasAgendadas())) {
			frmMenu.cambioATablaCita(frmMenu.getPanelOpciones().getCitasAgendadas());
			frmMenu.cambiaTitulo("Próximas citas");
			llenarTablaCita();
		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getMascotasAgendadas())) {
			frmMenu.cambioATablaMascota(frmMenu.getPanelOpciones().getMascotasAgendadas());
			frmMenu.cambiaTitulo("Mascotas atendidas");
			llenarTablaMascota();
		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getClientesPago())) {
			frmMenu.cambioATablaCita(frmMenu.getPanelOpciones().getClientesPago());
			frmMenu.cambiaTitulo("Citas pagadas");
			llenarTablaPagada();
		}
		if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelLogOut())) {
			CtrlLogIn.getInstancia().iniciaFrame();
			frmMenu.setVisible(false);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object panelPulsado = e.getSource();
		panelSinClick(panelPulsado).ifPresent(p -> p.iluminaOpcion(new Color(179, 220, 83)));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object panelPulsado = e.getSource();
		panelSinClick(panelPulsado).ifPresent(p -> p.restableceOpcion());
	}

	@Override
	public void iniciaFrame() {
		frmMenu.setVisible(true);
		frmMenu.cambiaDr(usuarioActual.getNombre());
		llenarTablaCita();
	}

	@Override
	public void ocultaFrame() {
		frmMenu.setVisible(false);
	}

	@Override
	public void limpiaCampos() {
		frmMenu.restablece();
		llenarTablaCita();
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
	 * Método setter para el veterinario actual.
	 * 
	 * @param usuarioActual Veterinario que inicio sesión.
	 */
	public void setUsuarioActual(Veterinario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}

	/**
	 * Método que llena la tabla para cuando se revisan las próximas citas.
	 */
	private void llenarTablaCita() {
		System.out.println(usuarioActual.getAgenda().stream()
				.filter(p -> p.getTiempo().isAfter(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault())))
				.toList());
		usuarioActual.getAgenda().stream()
				.filter(p -> p.getTiempo().isAfter(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault())))
				.forEach(p -> frmMenu.llenaCampoCita(p));
	}

	/**
	 * Método que llena la tabla con las mascotas atenidas.
	 */
	private void llenarTablaMascota() {
		usuarioActual.getAgenda().stream().forEach(p -> frmMenu.llenaCampoMascotas(p));
	}

	/**
	 * Método que llena la tabla con todas las citas que ya han sido pagadas.
	 */
	private void llenarTablaPagada() {
		usuarioActual.getAgenda().stream().filter(p -> p.estaPagada()).forEach(p -> frmMenu.llenaCampoCita(p));
	}

	/**
	 * Método que obtiene que paneles no han recibido un click
	 * 
	 * @param panelReceptor Panel que ha recibido un click
	 * @return Panel que no ha recibido click.
	 */
	private Optional<MiniPanel> panelSinClick(Object panelReceptor) {
		return frmMenu.getPanelOpciones().getOpciones().stream()
				.filter(p -> panelReceptor.equals(p) && p.getClicks() < 1).findAny();
	}
}
