package com.puppypets.modelo.builder;

import java.time.LocalDateTime;

import com.puppypets.modelo.Mascota;

public class Cita {

	private Mascota mascota;
	private LocalDateTime tiempo;
	private boolean express;
	private boolean pago;
	private String motivo;
	
	public Cita(ConstructorCita builder) {
		this.mascota = builder.mascota;
		this.tiempo = builder.tiempo;
		this.express = builder.express;
		this.motivo = builder.motivo;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public LocalDateTime getTiempo() {
		return tiempo;
	}

	public boolean esExpress() {
		return express;
	}

	public boolean estaPagada() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public String getMotivo() {
		return motivo;
	}
	
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
