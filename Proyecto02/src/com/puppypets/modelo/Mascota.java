package com.puppypets.modelo;

import com.puppypets.modelo.proxy.Cliente;

/**
 * Clase que implementa las mascotas del local.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * @since  Oracle JDK 17.0 LTS
 * 
 */ 
public class Mascota {
	
	private static int id;
	private Cliente owner;
	private String nombre;
	private String sexo;
	private String especie;
	private int edad;

	/**
	 * Método constructor de la mascota
	 * @param owner Dueño de la mascota
	 * @param nombre Nombre de la mascota
	 * @param especie Especie de la mascota
	 * @param edad Edad de la mascota
	 */
	public Mascota(Cliente owner, String nombre, String sexo, String especie, int edad) {
		this.owner = owner;
		this.nombre = nombre;
		this.especie = especie;
		this.sexo = sexo;
		this.edad = edad;
		id++;
	}
	
	/**
	 * Método getter del ID
	 * @return ID de la mascota
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método getter del dueño
	 * @return Dueño de la mascota
	 */
	public Cliente getOwner() {
		return owner;
	}

	/**
	 * Método setter del dueño
	 * @param owner Dueño de la mascota
	 */
	public void setOwner(Cliente owner) {
		this.owner = owner;
	}

	/**
	 * Método getter del nombre
	 * @return Nombre de la mascota
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método setter del nombre
	 * @param nombre Nombre de la mascota
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método getter de la especie
	 * @return Especie de la mascota
	 */
	public String getEspecie() {
		return especie;
	}

	/**
	 * Método setter de la especie
	 * @param especie Especie de la mascota
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	/**
	 * Método getter de la edad
	 * @return Edad de la mascota
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método setter de la edad
	 * @param edad Edad de la mascota
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Método getter del sexo
	 * @return sexo de la mascota
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Método setter del sexo de la mascota.
	 * @param sexo Sexo de la mascota.
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + "]";
	}
	
	
	
}
