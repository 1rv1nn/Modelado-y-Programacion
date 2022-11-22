package com.puppypets.modelo;

import java.util.HashSet;
import java.util.Set;

import com.puppypets.modelo.proxy.Cliente;

/**
 * Clase que implementa la base de datos de la tienda Puppy Pets.
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando (FWgalde)
 * @version Oracle JDK 17.0 LTS
 *
 */

public class BaseDeDatos {
	private static BaseDeDatos bdd;
	private Set<Cliente> clientes;
	private Set<Mascota> mascotas;
	private Set<Veterinario> veterinarios;
	
	/**
	 * Método constructor de la clase.
	 */
	private BaseDeDatos() {
		clientes = new HashSet<>();
		mascotas = new HashSet<>();
		veterinarios = new HashSet<>();
		
		Cliente c = new Cliente("pepe", "123", "Jose", "5531551221", "Del Valle", "551123");
		Mascota mimi = new Mascota(c, "mimi", "Hembra", "Perro", 12);
		c.getMascotas().add(mimi);
		c.setDineroDisponible(2000);
		Veterinario pablo = new Veterinario("pavlo", "123", "Dr. Pablo", "5513231");	
		clientes.add(c);
		mascotas.add(mimi);
		veterinarios.add(pablo);
	}
	
	/**
	 * Método para obtener una instancia de la base de datos.
	 * @return Intancia de la base de datos.
	 */
	public static BaseDeDatos getInstancia() {
		if(bdd == null) {
			bdd = new BaseDeDatos();
		} 
		return bdd;
	}
		
	/**
	 * Método getter de los clientes de la veterinaria.
	 * @return Lista de clientes.
	 */
	public Set<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * Método setter de los clientes de la veterinaria.
	 * @param clientes La lista de clientes.
	 */
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	/**
	 * Método getter de las mascotas de la veterinaria.
	 * @return Lista de las mascotas
	 */
	public Set<Mascota> getMascotas() {
		return mascotas;
	}

	/**
	 * Método setter de las mascotas de la veterinaria.
	 * @param mascotas Lista de las mascotas.
	 */
	public void setMascotas(Set<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	/**
	 * Método getter de los veterinarios.
	 * @return Lista de veterinarios.
	 */
	public Set<Veterinario> getVeterinarios() {
		return veterinarios;
	}

	/**
	 * Método setter de los veterinarios.
	 * @param veterinarios Lista de veterinarios.
	 */
	public void setVeterinarios(Set<Veterinario> veterinarios) {
		this.veterinarios = veterinarios;
	}
}
