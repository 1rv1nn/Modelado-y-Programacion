package com.puppypets.vista.menu_clientes.builder;

import javax.swing.JPanel;

import com.puppypets.vista.MiniPanel;

public class ConstructorOpcionesDelCliente {
	protected MiniPanel panelCita;
	protected MiniPanel panelCirugia;
	protected MiniPanel panelEstetica;
	protected MiniPanel panelVacunacion;
	protected MiniPanel panelEstudios;
	protected MiniPanel panelPago;
	protected MiniPanel panelLogOut;
	protected JPanel panelCambio;
	
	public ConstructorOpcionesDelCliente setPanelCita(MiniPanel panelCita) {
		this.panelCita = panelCita;
		return this;
	}
	public ConstructorOpcionesDelCliente setPanelCambio(JPanel panelCambio) {
		this.panelCambio = panelCambio;
		return this;
	}
	public ConstructorOpcionesDelCliente setPanelCirugia(MiniPanel panelCirugia) {
		this.panelCirugia = panelCirugia;
		return this;
	}
	public ConstructorOpcionesDelCliente setPanelEstetica(MiniPanel panelEstetica) {
		this.panelEstetica = panelEstetica;
		return this;
	}
	public ConstructorOpcionesDelCliente setPanelVacunacion(MiniPanel panelVacunacion) {
		this.panelVacunacion = panelVacunacion;
		return this;
	}
	public ConstructorOpcionesDelCliente setPanelEstudios(MiniPanel panelEstudios) {
		this.panelEstudios = panelEstudios;
		return this;
	}
	public ConstructorOpcionesDelCliente setPanelPago(MiniPanel panelPago) {
		this.panelPago = panelPago;
		return this;
	}
	public ConstructorOpcionesDelCliente setPanelLogOut(MiniPanel panelLogOut) {
		this.panelLogOut = panelLogOut;
		return this;
	}
	
}
