package com.puppypets.modelo;

import java.util.HashSet;
import java.util.Set;

import com.puppypets.modelo.builder.Cita;

/**
 * Clase que implementa a médicos veterinarios del local.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 * 
 */
public class Veterinario extends Usuario {
	private static int idd = 1;
	private int ID;
	private Set<Mascota> mascotas;
	private Set<Cita> agenda;

	/**
	 * Método constructor de la clase
	 * 
	 * @param usuario  Nombre de usuario del veterinario
	 * @param password Contraseña del veterinario
	 * @param telefono Teléfono del veterinario
	 */
	public Veterinario(String usuario, String password, String nombre, String telefono) {
		super(usuario, password, nombre, telefono);
		mascotas = new HashSet<>();
		agenda = new HashSet<>();
		ID = idd;
		idd++;
	}
	

	/**
	 * Método getter del ID
	 * @return int id del cliente.
	 */
	public int getId() {
		return ID;
	}

	/**
	 * Método getter de las mascotas.
	 * 
	 * @return Mascotas que se atiendieron.
	 */
	public Set<Mascota> getMascotas() {
		return mascotas;
	}

	/**
	 * Método getter de la agenda de citas.
	 * 
	 * @return Conjunto de citas.
	 */
	public Set<Cita> getAgenda() {
		return agenda;
	}

	/**
	 * Método que agrega una cita.
	 * 
	 * @param c Cita que se agregará.
	 */
	public void agregaCita(Cita c) {
		agenda.add(c);
		mascotas.add(c.getMascota());
	}

}
