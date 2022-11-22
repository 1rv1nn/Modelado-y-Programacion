package com.puppypets.modelo.proxy;

import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

import com.puppypets.modelo.Mascota;
import com.puppypets.modelo.Usuario;
import com.puppypets.modelo.builder.Cita;

/**
 * Clase que modela el papel de un cliente.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando (FWgalde)
 * 
 * @version 1.0
 * @since  Oracle JDK 17.0 LTS
 */ 
public class Cliente extends Usuario implements ICliente{
	
	private String direccion;
	private String cuentaBancaria;
	private double dineroDisponible;
	private Set<Mascota> mascotas;
	private Set<Cita> citasAgendadas;
	
	/**
	 * Método constructor del cliente
	 * @param usuario Nombre de usuario del cliente
	 * @param password Contraseña del cliente
	 * @param nombre Nombre del cliente
	 * @param telefono Teléfono del cliente
	 * @param direccion Dirección del cliente
	 * @param cuentaBancaria Cuenta bancaria del cliente
	 */
	public Cliente(String usuario, String password, String nombre, String telefono, String direccion, String cuentaBancaria) {
		super(usuario, password, nombre, telefono);
		this.direccion = direccion;
		this.cuentaBancaria = cuentaBancaria;
		mascotas = new HashSet<>();
		citasAgendadas = new HashSet<>();
	}
	
	/**
	 * Método para agregar una mascota
	 * @param m Mascota
	 */
	public void agregaMascota(Mascota m) {
		mascotas.add(m);
	}
	
	/**
	 * Método getter de la dirección
	 * @return Dirección del cliente
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Método setter de la dirección
	 * @param direccion Dirección del cliente
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	/**
	 * Método getter de la cuentaBancaria
	 * @return Cuenta Bancaria del cliente
	 */
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	/**
	 * Método setter de la cuenta bancaria
	 * @param cuentaBancaria Cuenta bancaria del cliente.
	 */
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	/**
	 * Método getter de mascotas
	 * @return Regresa la lista de mascotas del cliente.
	 */
	public Set<Mascota> getMascotas() {
		return mascotas;
	}

	/**
	 * Método getter del dinero disponible
	 * @return Dinero disponible del cliente
	 */
	public double getDineroDisponible() {
		return dineroDisponible;
	}

	/**
	 * Método setter del dinero disponible
	 * @param dineroDisponible Nueva cantidad de dinero disponible del cliente
	 */
	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	@Override
	public void pagoServicios(String cuentaBancaria, double pago) {
		System.out.println(dineroDisponible-pago);
		if(pago <= dineroDisponible)
			dineroDisponible -= pago;
		else 
			throw new NoSuchElementException("No tiene el suficiente dinero.");
	}
	
	/**
	 * Método que agregar una cita 
	 * @param c cita 
	 */
	public void agregarCita(Cita c) {
		citasAgendadas.add(c);
	}

	public Set<Cita> getCitasAgendadas() {
		return citasAgendadas;
	}

	/**
	 * Método para las citas agendadas
	 * @param citasAgendadas
	 */
	public void setCitasAgendadas(Set<Cita> citasAgendadas) {
		this.citasAgendadas = citasAgendadas;
	}	
	
	/**
	 * Método getPrecioTotal.
	 * @return El precio total
	 */
	public int getPrecioTotal() {
		List<Integer> costos = citasAgendadas.stream().map(c -> c.getCosto()).toList();
		return costos.stream().collect(Collectors.summingInt(Integer::intValue));
	}
}