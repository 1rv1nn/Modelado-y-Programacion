package com.puppypets.controlador;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Optional;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.puppypets.modelo.Veterinario;
import com.puppypets.vista.MiniPanel;
import com.puppypets.vista.menu_vet.MenuVeterinario;

public class CtrlMenuVeterinario extends MouseAdapter implements CtrlFrames {
	
	private static CtrlMenuVeterinario controlador;
	private MenuVeterinario frmMenu;
	private DefaultTableModel modelo;
	private Veterinario usuarioActual;
	
	
	private CtrlMenuVeterinario() {
		frmMenu = new MenuVeterinario();
		frmMenu.getPanelOpciones().getOpciones().stream().forEach(p -> p.addMouseListener(this));
	}
	
	public static CtrlMenuVeterinario getInstancia() {
		if(controlador == null) {
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
//		if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelCita())) {
//			cambioPaneles(0, new CitaMedica(), frmMenu.getPanelOpciones().getPanelCita());
//		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelCirugia())) {
//			cambioPaneles(1, new CitaCirugia(), frmMenu.getPanelOpciones().getPanelCirugia());
//		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelEstetica())) {
//			cambioPaneles(2, new CitaEstetica(), frmMenu.getPanelOpciones().getPanelEstetica());
//		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelVacunacion())) {
//			cambioPaneles(3, new CitaVacunacion(), frmMenu.getPanelOpciones().getPanelVacunacion());
//		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelEstudios())) {
//			cambioPaneles(4, new CitaEstudios(), frmMenu.getPanelOpciones().getPanelEstudios());
//		} else if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelPago())) {
//			cambioPaneles(5, new CitaEstudios(), frmMenu.getPanelOpciones().getPanelPago());
		if (panelPulsado.equals(frmMenu.getPanelOpciones().getPanelLogOut())) {
			CtrlLogIn.getInstancia().iniciaFrame();
			frmMenu.setVisible(false);
			frmMenu.getTablaClientes().setVisible(false);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object panelPulsado = e.getSource();
		panelSinClick(panelPulsado).ifPresent(this::iluminaOpcion);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object panelPulsado = e.getSource();
		panelSinClick(panelPulsado).ifPresent(this::restableceOpcion);
	}

	@Override
	public void iniciaFrame() {
		frmMenu.setVisible(true);
		frmMenu.cambiaDr(usuarioActual.getNombre());
	}

	@Override
	public void ocultaFrame() {
		frmMenu.setVisible(false);
	}

	@Override
	public void limpiaCampos() {
		
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

	public Veterinario getUsuarioActual() {
		return usuarioActual;
	}

	public void setUsuarioActual(Veterinario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}
	
	private void modelaTabla() {
		modelo = new DefaultTableModel();
		frmMenu.getTablaClientes().setModel(modelo);
	}
	
	
	private void consultaCitas() {
		modelo.addColumn("Hora");
		modelo.addColumn("Problema a tratar");
		modelo.addColumn("Mascota");
	}
	
	
	
	private Optional<MiniPanel> panelSinClick(Object panelPulsado) {
		return frmMenu.getPanelOpciones().getOpciones().stream()
				.filter(p -> panelPulsado.equals(p) && p.getClicks() < 1)
				.findAny();
	}
	
	private void iluminaOpcion(MiniPanel mp) {
		mp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		mp.setBackground(new Color(179, 220, 83));
	}
	
	private void restableceOpcion(MiniPanel mp) {
		mp.setBackground(mp.getDefaultColour());
	}
}
