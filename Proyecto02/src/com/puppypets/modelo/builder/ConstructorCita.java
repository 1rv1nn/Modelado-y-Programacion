package com.puppypets.modelo.builder;

import java.time.LocalDateTime;

import com.puppypets.modelo.Mascota;

/**
 * Clase que implementa el constructor de una respectiva cita.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando (FWgalde)
 * 
 * @version 1.0
 * @since Oracle JDK 17.0 LTS
 * 
 */

public class ConstructorCita {
	Mascota mascota;
	LocalDateTime tiempo;
	boolean express;
	String motivo;
	
	
	/**
	 * Constructor de una cita
	 * @param mascota
	 * @return constructor cita
	 */
	public ConstructorCita setMascota(Mascota mascota) {
		this.mascota = mascota;
		return this;
	}
	
	/**
	 * Construcutor del tiempo estimado para la cita
	 * @param tiempo Tiempo estimado
	 * @return El tiempo estimado
	 */
	public ConstructorCita setTiempo(LocalDateTime tiempo) {
		this.tiempo = tiempo;
		return this;
	}
	
	
	/**
	 * Constructor de una cita expreess 
	 * @param esExpress 
	 * @return La cita express
	 */
	public ConstructorCita setExpress(boolean esExpress) {
		this.express = esExpress;
		return this;
	}
	
	/**
	 * Construcutor del motivo de una cita
	 * @param motivo Motivo de la cita
	 * @return El motivo
	 */
	public ConstructorCita setMotivo(String motivo) {
		this.motivo = motivo;
		return this;
	}
}
