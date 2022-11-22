package com.puppypets.vista.menu_vet.builder;

import com.puppypets.vista.MiniPanel;

/**
 * Clase que implementa el constructor de las opciones del menú del veterinario.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
public class ConstructorOpcionesDelVeterinario {
	protected MiniPanel citasAgendadas;
	protected MiniPanel mascotasAgendadas;
	protected MiniPanel clientesPago;
	protected MiniPanel panelLogOut;

	/**
	 * Método que establece la opción de las próximas citas.
	 * 
	 * @param citasAgendadas Minipanel con la opción de las próximas citas.
	 * @return Constructor de las opciones.
	 */
	public ConstructorOpcionesDelVeterinario setCitasAgendadas(MiniPanel citasAgendadas) {
		this.citasAgendadas = citasAgendadas;
		return this;
	}

	/**
	 * Método que establece la opción de las mascotas atendidas.
	 * 
	 * @param citasAgendadas Minipanel con la opción de las mascotas.
	 * @return Constructor de las opciones.
	 */
	public ConstructorOpcionesDelVeterinario setMascotasAgendadas(MiniPanel mascotasAgendadas) {
		this.mascotasAgendadas = mascotasAgendadas;
		return this;
	}

	/**
	 * Método que establece la opción de las citas pagadas.
	 * 
	 * @param citasAgendadas Minipanel con la opción de las citas pagadas.
	 * @return Constructor de las opciones.
	 */
	public ConstructorOpcionesDelVeterinario setClientesPago(MiniPanel clientesPago) {
		this.clientesPago = clientesPago;
		return this;
	}

	/**
	 * Método que establece la opción de cerrar sesión.
	 * 
	 * @param citasAgendadas Minipanel con la opción de cerrar sesión.
	 * @return Constructor de las opciones.
	 */
	public ConstructorOpcionesDelVeterinario setPanelLogOut(MiniPanel panelLogOut) {
		this.panelLogOut = panelLogOut;
		return this;
	}
}