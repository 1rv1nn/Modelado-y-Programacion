package com.puppypets.modelo;

/**
 * Clase que implementa a un usuario.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando (FWgalde)
 * 
 * @version 1.0
 * @since  Oracle JDK 17.0 LTS
 */ 

public class Usuario {
	protected String usuario;
	protected String password;
	protected String nombre;
	protected String telefono;
	protected static int id = 0;
	
	/**
	 * Método constructor de la clase
	 * @param usuario nombre del usuario
	 * @param password contraseña de l usuario
	 * @param nombre   nombre del usuario
	 * @param telefono telefono del usuario
	 */
	public Usuario(String usuario, String password, String nombre, String telefono) {
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.telefono = telefono;
		id++;
	}
	
	/**
	 * Método getter del ID
	 * @return ID del veterinario
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Método getter del usuario
	 * @return Nombre de usuario del veterinario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Método setter del usuario
	 * @param usuario Nombre de usuario del veterinario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Método getter de la contraseña
	 * @return Contraseña del veterinario
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Método setter de la contraseña
	 * @param password Contraseña del veterinario
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Método getter del nombre
	 * @return Nombre del veterinario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método setter del nombre
	 * @param nombre Nombre del veterinario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método getter del telefono
	 * @return Telefono del veterinario
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Método setter del telefono
	 * @param telefono Telefono del veterinario
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", nombre=" + nombre + "]";
	}
	
}
