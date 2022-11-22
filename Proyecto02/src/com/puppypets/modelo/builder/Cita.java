package com.puppypets.modelo.builder;

import java.time.LocalDateTime;

import com.puppypets.modelo.Mascota;

/**
 * Clase que implementa el comportamiento de la cita para una mascota .
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 * 
 */
public class Cita {

	private Mascota mascota;
	private LocalDateTime tiempo;
	private boolean express;
	private boolean pago;
	private String motivo;

	/**
	 * Método constructor de la clase.
	 */
	public Cita(ConstructorCita builder) {
		this.mascota = builder.mascota;
		this.tiempo = builder.tiempo;
		this.express = builder.express;
		this.motivo = builder.motivo;
	}

	/**
	 * Método getter de la mascota.
	 * 
	 * @return Mascota la cual tiene cita.
	 */
	public Mascota getMascota() {
		return mascota;
	}

	/**
	 * Método getter de la fecha y tiempo
	 * 
	 * @return La hora y fecha en que se realizará la cita.
	 */
	public LocalDateTime getTiempo() {
		return tiempo;
	}

	/**
	 * Método getter de express
	 * 
	 * @return true si es express, false en otro caso.
	 */
	public boolean esExpress() {
		return express;
	}

	/**
	 * Método getter pago
	 * 
	 * @return true si la cita ha sido pagada, false en otro caso.
	 */
	public boolean estaPagada() {
		return pago;
	}

	/**
	 * Método setter pago.
	 * 
	 * @param pago Si se ha pagado la cita o no.
	 */
	public void setPago(boolean pago) {
		this.pago = pago;
	}

	/**
	 * Método getter del motivo de la cita.
	 * 
	 * @return Motivo por el cual la mascota acude a la cita.
	 */
	public String getMotivo() {
		return motivo;
	}

	/**
	 * Método getter del costo de cada servicio.
	 * 
	 * @return costo de la cita dependiendo el tipo de servicio.
	 */
	public int getCosto() {
		if (pago)
			return 0;
		if (motivo.contains("Médica"))
			return 200;
		else if (motivo.contains("Cirugia"))
			return 1850;
		else if (motivo.contains("Corte"))
			return 300;
		else if (motivo.contains("Estudio") && express)
			return 1000;
		else if (motivo.contains("Estudio"))
			return 800;
		else if (motivo.contains("Vacuna"))
			return 250;
		throw new NullPointerException("No se especifico el motivo de la cita");
	}

	@Override
	public String toString() {
		return "Cita [tiempo=" + tiempo.toString() + "]";
	}
}
