package com.puppypets.controlador.singleton;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

import com.puppypets.modelo.Veterinario;
import com.puppypets.modelo.singleton.BaseDeDatos;

/**
 * Clase que implementa el controlador de los veterinarios.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
public class CtrlVeterinarios {
	private static CtrlVeterinarios cv;
	private Set<Veterinario> veterinarios;

	/**
	 * Método constructor de la clase.
	 */
	private CtrlVeterinarios() {
		veterinarios = BaseDeDatos.getInstancia().getVeterinarios();
	}

	/**
	 * Método para obtener una instancia de la clase.
	 * 
	 * @return Controlador de los veterinarios.
	 */
	public static CtrlVeterinarios getInstancia() {
		if (cv == null) {
			cv = new CtrlVeterinarios();
		}
		return cv;
	}

	/**
	 * Método para obtener al un veterinario en específico de acuerdo a su nombre de
	 * usuario.
	 * 
	 * @param usuario Nombre de usuario del veterinario.
	 * @return Optional del veterinario que se busca.
	 */
	public Optional<Veterinario> obtenerVeterinario(String usuario) {
		return veterinarios.stream().filter(v -> v.getUsuario().equals(usuario)).findAny();
	}

	/**
	 * Método que devuelve el veterinario que está disponible a cierta hora.
	 * 
	 * @param hora Hora y fecha cuando se solicita al veterinario.
	 * @return Optional del veterinario que cumpla con la disponibilidad.
	 */
	public Optional<Veterinario> vetDisponible(LocalDateTime hora) {
		return veterinarios.stream().filter(v -> estaDisponible(v, hora)).findAny();
	}

	/**
	 * Método que devuelve si un veterinario está disponible a cierta hora.
	 * 
	 * @param v    Veterinario del que se quiere saber si está disponible.S
	 * @param hora Hora y fecha cuando se solicita al veterinario.
	 * @return true si está disponible, false en otro caso.
	 */
	private boolean estaDisponible(Veterinario v, LocalDateTime hora) {
		return !v.getAgenda().stream().anyMatch(c -> c.getTiempo().isEqual(hora));
	}
}
