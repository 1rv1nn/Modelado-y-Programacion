package com.puppypets.vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MiniPanel extends JPanel {
	private Color defaultColour;
	private JLabel lblTitulo;
	private int clicks;
	
	public MiniPanel(String s, ImageIcon i, int y, Color porDefecto) {
		this.defaultColour = porDefecto;
		setBackground(porDefecto);
		setBounds(0, y, 266, 60);
		setLayout(null);
		titulo(s, i);
	}
	
	private void titulo(String s, ImageIcon i) {
		StringBuilder cadena = new StringBuilder();
		cadena.append("   ");
		cadena.append(s);
		lblTitulo = new JLabel(cadena.toString());
		lblTitulo.setIcon(i);
		lblTitulo.setFont(new Font("Cantarell", Font.BOLD, 14));
		lblTitulo.setBounds(20, 11, 225, 38);
		add(lblTitulo);
		clicks = 0;
	}
	
	public void changeSizeFont(int size) {
		lblTitulo.setFont(new Font("Cantarell", Font.BOLD, size));
	}

	public Color getDefaultColour() {
		return defaultColour;
	}

	public void setDefaultColour(Color porDefecto) {
		this.defaultColour = porDefecto;
	}

	public int getClicks() {
		return clicks;
	}

	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	
	public void iluminaOpcion() {
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		setBackground(new Color(66, 219, 140));
	}
	
	public void restableceOpcion() {
		setBackground(getDefaultColour());
	}
}
