package com.puppypets.modelo.builder;

import java.time.LocalDateTime;

import com.puppypets.modelo.Mascota;

public class ConstructorCita {
	Mascota mascota;
	LocalDateTime tiempo;
	boolean express;
	String motivo;
	
	
	public ConstructorCita setMascota(Mascota mascota) {
		this.mascota = mascota;
		return this;
	}
	
	public ConstructorCita setTiempo(LocalDateTime tiempo) {
		this.tiempo = tiempo;
		return this;
	}
	
	
	public ConstructorCita setExpress(boolean esExpress) {
		this.express = esExpress;
		return this;
	}
	
	public ConstructorCita setMotivo(String motivo) {
		this.motivo = motivo;
		return this;
	}
}
