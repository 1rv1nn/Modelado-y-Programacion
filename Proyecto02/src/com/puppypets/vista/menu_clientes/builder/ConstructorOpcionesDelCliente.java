package com.puppypets.vista.menu_clientes.builder;

import com.puppypets.vista.MiniPanel;

/**
 * Clase que implementa el constructor del panel de opciones del cliente.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
public class ConstructorOpcionesDelCliente {
	protected MiniPanel panelCita;
	protected MiniPanel panelCirugia;
	protected MiniPanel panelEstetica;
	protected MiniPanel panelVacunacion;
	protected MiniPanel panelEstudios;
	protected MiniPanel panelPago;
	protected MiniPanel panelLogOut;

	/**
	 * Método para establecer la opción de cita.
	 * 
	 * @param panelCita Minipanel con la opción de cita.
	 * @return Constructor de opciones.
	 */
	public ConstructorOpcionesDelCliente setPanelCita(MiniPanel panelCita) {
		this.panelCita = panelCita;
		return this;
	}

	/**
	 * Método para establecer la opción de cirugía.
	 * 
	 * @param panelCirugia MiniPanel con la opción de cirugía.
	 * @return Constructor de opciones.
	 */
	public ConstructorOpcionesDelCliente setPanelCirugia(MiniPanel panelCirugia) {
		this.panelCirugia = panelCirugia;
		return this;
	}

	/**
	 * Método para establecer la opción de estética.
	 * 
	 * @param panelEstetica Minipanel con la opción de estética.
	 * @return Constructor de opciones.
	 */
	public ConstructorOpcionesDelCliente setPanelEstetica(MiniPanel panelEstetica) {
		this.panelEstetica = panelEstetica;
		return this;
	}

	/**
	 * Método para establecer la opción de vacunación.
	 * 
	 * @param panelVacunacion Minipanel con la opción de vacunación.
	 * @return Constructor de opciones.
	 */
	public ConstructorOpcionesDelCliente setPanelVacunacion(MiniPanel panelVacunacion) {
		this.panelVacunacion = panelVacunacion;
		return this;
	}

	/**
	 * Método para establecer la opción de estudios.
	 * 
	 * @param panelEstudios Minipanel con la opción de estudios.
	 * @return Constructor de opciones.
	 */
	public ConstructorOpcionesDelCliente setPanelEstudios(MiniPanel panelEstudios) {
		this.panelEstudios = panelEstudios;
		return this;
	}

	/**
	 * Método para establecer la opción de pago.
	 * 
	 * @param panelPago Minipanel con la opción de pago.
	 * @return Constructor de opciones.
	 */
	public ConstructorOpcionesDelCliente setPanelPago(MiniPanel panelPago) {
		this.panelPago = panelPago;
		return this;
	}

	/**
	 * Método para establecer la opción de cerrar sesión.
	 * 
	 * @param panelLogOut Minipanel con la opción de cerrar sesión.
	 * @return Constructor de opciones.
	 */
	public ConstructorOpcionesDelCliente setPanelLogOut(MiniPanel panelLogOut) {
		this.panelLogOut = panelLogOut;
		return this;
	}
}