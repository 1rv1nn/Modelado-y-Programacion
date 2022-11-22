package com.puppypets.modelo.builder;

import java.time.LocalDateTime;

import com.puppypets.modelo.Mascota;


/**
 * Clase que implementa el comportamiento de la cita para una mascota .
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando (FWgalde)
 * 
 * @version 1.0
 * @since  Oracle JDK 17.0 LTS
 * 
 */
public class Cita {

	private Mascota mascota;
	private LocalDateTime tiempo;
	private boolean express;
	private boolean pago;
	private String motivo;
	
	/*Método constructor de la clase  */
	public Cita(ConstructorCita builder) {
		this.mascota = builder.mascota;
		this.tiempo = builder.tiempo;
		this.express = builder.express;
		this.motivo = builder.motivo;
	}

	/**
	 * Método getter de la mascota
	 * @return Una mascota
	 */
	public Mascota getMascota() {
		return mascota;
	}

	/**
	 * Método getter del tiempo
	 * @return El tiempo
	 */
	public LocalDateTime getTiempo() {
		return tiempo;
	}

	/**
	 * Método esExpress 
	 * @return Sí la cita es express o no
	 */
	public boolean esExpress() {
		return express;
	}

	/**
	 * Método estaPagada
	 * @return Sí la cita esta pagado o no
	 */
	public boolean estaPagada() {
		return pago;
	}

	/**
	 * Método setter Pago de un cita.
	 * @param pago pago de la cita.
	 */
	public void setPago(boolean pago) {
		this.pago = pago;
	}

	/**
	 * Método getter del Motivo de la cita.
	 * @return motivo de la cita.
	 */
	public String getMotivo() {
		return motivo;
	}
	
	/**
	 * Método getter del costo de cada servicio.
	 */
	public int getCosto() {
		if(pago)
			return 0;
		if(motivo.contains("Médica"))
			return 200;
		else if(motivo.contains("Cirugia"))
			return 1850;
		else if(motivo.contains("Corte"))
			return 300;
		else if(motivo.contains("Estudio") && express)
			return 1000;
		else if(motivo.contains("Estudio"))
			return 800;
		else if(motivo.contains("Vacuna"))
			return 250;
		throw new NullPointerException("No se especifico el motivo de la cita");
	}

	@Override
	public String toString() {
		return "Cita [tiempo=" + tiempo.toString() + "]";
	}
	
	
}
