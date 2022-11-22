package com.puppypets.vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase que implementa un Mini Panel, estos representan las opciones que
 * despliegan en el Menú y que puede escoger el usuario.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
@SuppressWarnings("serial")
public class MiniPanel extends JPanel {
	private Color defaultColour;
	private JLabel lblTitulo;
	private int clicks;

	/**
	 * Método constructor de la clase
	 * 
	 * @param titulo     Nombre la opción del mini panel.
	 * @param icono      Icono que acompaña el nombre de la opción.
	 * @param y          Posición y del minipanel con respecto al JFrame que lo
	 *                   contenga.
	 * @param porDefecto Color por defecto que tiene el minipanel.
	 */
	public MiniPanel(String titulo, ImageIcon icono, int y, Color porDefecto) {
		this.defaultColour = porDefecto;
		setBackground(porDefecto);
		setBounds(0, y, 266, 60);
		setLayout(null);
		titulo(titulo, icono);
	}

	/**
	 * Método getter del color por defecto.
	 * 
	 * @return El color por defecto del minipanel.
	 */
	public Color getDefaultColour() {
		return defaultColour;
	}

	/**
	 * Método getter de los clicks.
	 * 
	 * @return La cantidad de clicks que se la han hecho al minipanel.
	 */
	public int getClicks() {
		return clicks;
	}

	/**
	 * Método setter de los clicks.
	 * 
	 * @param clicks La cantidad de clicks que se le pondrán al minipanel.
	 */
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	
	/**
	 * Método que cambia el tamaño de la fuente del título del minipanel.
	 * 
	 * @param size Tamaño nuevo de la fuente.
	 */
	public void changeSizeFont(int size) {
		lblTitulo.setFont(new Font("Cantarell", Font.BOLD, size));
	}

	/**
	 * Método que aclara la iluminación del minipanel.
	 */
	public void iluminaOpcion(Color c) {
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setBackground(c);
	}

	/**
	 * Método que restablece el color original del minipanel.
	 */
	public void restableceOpcion() {
		setBackground(getDefaultColour());
	}
	
	/**
	 * Método que genera el nombre la opción del minipanel.
	 * 
	 * @param titulo Nombre de la opción del minipanel.
	 * @param icono  Icono que acompaña el título de la opción.
	 */
	private void titulo(String titulo, ImageIcon icono) {
		StringBuilder cadena = new StringBuilder();
		cadena.append("   ");
		cadena.append(titulo);
		lblTitulo = new JLabel(cadena.toString());
		lblTitulo.setIcon(icono);
		lblTitulo.setFont(new Font("Cantarell", Font.BOLD, 14));
		lblTitulo.setBounds(20, 11, 225, 38);
		add(lblTitulo);
		clicks = 0;
	}
}