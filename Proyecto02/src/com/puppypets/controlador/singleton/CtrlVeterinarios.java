package com.puppypets.controlador.singleton;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

import com.puppypets.modelo.BaseDeDatos;
import com.puppypets.modelo.Veterinario;

public class CtrlVeterinarios {
	private static CtrlVeterinarios cv;
	private Set<Veterinario> veterinarios;

	private CtrlVeterinarios() {
		veterinarios = BaseDeDatos.getInstancia().getVeterinarios();
	}

	public static CtrlVeterinarios getInstancia() {
		if(cv == null) {
			cv = new CtrlVeterinarios();
		}
		return cv;
	}
	
	public boolean contieneVeterinario(String usuario) {
		return veterinarios.stream().anyMatch(v -> v.getUsuario().equals(usuario));
	}
	
	public Optional<Veterinario> obtenerVeterinario(String usuario) {
		return veterinarios.stream().filter(v -> v.getUsuario().equals(usuario)).findAny();
	}
	
	public Optional<Veterinario> vetDisponible(LocalDateTime hora) {
		return veterinarios.stream().filter(v -> estaDisponible(v, hora)).findAny();
	}
	
	private boolean estaDisponible(Veterinario v, LocalDateTime hora) {
		return !v.getAgenda().stream().anyMatch(c -> c.getTiempo().isEqual(hora));
	}
}
