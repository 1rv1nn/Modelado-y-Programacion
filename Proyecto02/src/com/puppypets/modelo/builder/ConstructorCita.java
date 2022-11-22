package com.puppypets.modelo.builder;

import java.time.LocalDateTime;

import com.puppypets.modelo.Mascota;

/**
 * Clase que implementa el constructor de una respectiva cita.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 * 
 */
public class ConstructorCita {
	protected Mascota mascota;
	protected LocalDateTime tiempo;
	protected boolean express;
	protected String motivo;

	/**
	 * Método para establecer la mascota en la cita.
	 * 
	 * @param mascota Mascota que será tratada en la cita.
	 * @return Constructor de la cita.
	 */
	public ConstructorCita setMascota(Mascota mascota) {
		this.mascota = mascota;
		return this;
	}

	/**
	 * Método para establecer la fecha y hora de la cita.
	 * 
	 * @param tiempo Fecha y hora de la cita.
	 * @return Constructor de la cita.
	 */
	public ConstructorCita setTiempo(LocalDateTime tiempo) {
		this.tiempo = tiempo;
		return this;
	}

	/**
	 * Método para establecer si una cita es express o no.
	 * 
	 * @param esExpress Expresar si una cita es express.
	 * @return Constructor de la cita.
	 */
	public ConstructorCita setExpress(boolean esExpress) {
		this.express = esExpress;
		return this;
	}

	/**
	 * Método para establecer el motivo de la cita.
	 * 
	 * @param motivo Motivo de la cita.
	 * @return Constructor de la cita.
	 */
	public ConstructorCita setMotivo(String motivo) {
		this.motivo = motivo;
		return this;
	}
}
