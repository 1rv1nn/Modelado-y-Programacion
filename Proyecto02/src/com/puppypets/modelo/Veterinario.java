package com.puppypets.modelo;

import java.util.HashSet;
import java.util.Set;

import com.puppypets.modelo.builder.Cita;

/**
 * Clase que implementa a médicos veterinarios del local.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando (FWgalde)
 * 
 * @version 1.0
 * @since  Oracle JDK 17.0 LTS
 * 
 */
public class Veterinario extends Usuario{
	private Set<Mascota> mascotas;
	private Set<Cita> agenda;
	
	/**
	 * Método constructor de la clase
	 * @param usuario Nombre de usuario del veterinario
	 * @param password Contraseña del veterinario
	 * @param telefono Teléfono del veterinario
	 */
	public Veterinario(String usuario, String password, String nombre,  String telefono) {
		super(usuario, password, nombre, telefono);
		mascotas = new HashSet<>();
		agenda = new HashSet<>();
	}

	/**
	 * Método getMascotas
	 * @return mascotas
	 */
	public Set<Mascota> getMascotas() {
		return mascotas;
	}

	/**
	 * getAgenda
	 * @return La agenda de las citas.
	 */
	public Set<Cita> getAgenda() {
		return agenda;
	}
	
	/**
	 * agregaCita
	 * @param c Cita a agregar
	 */
	public void agregaCita(Cita c) {
		agenda.add(c);
		mascotas.add(c.getMascota());
	}
	
}
