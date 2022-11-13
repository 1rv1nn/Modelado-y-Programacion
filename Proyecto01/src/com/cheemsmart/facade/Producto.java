package com.cheemsmart.facade;

/**
 * Clase que implementa a un producto de la tienda.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class Producto {
	private final int codigoBarras;
	private String nombre;
	private String departamento;
	private double precio;
	
	/**
	 * Método constructor del producto
	 * @param codigoBarras codigo de barras del producto
	 * @param nombre nombre del producto
	 * @param departamento deparatamento al que pertenece el producto
	 * @param precio precio que tiene el producto
	 */
	public Producto(int codigoBarras, String nombre, String departamento, double precio) {
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.departamento = departamento;
		this.precio = precio;
	}

	/**
	 * Método getter del código de barras
	 * @return int código de barras del producto
	 */
	public int getCodigoBarras() {
		return codigoBarras;
	}

	/**
	 * Método getter del nombre
	 * @return String nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método getter del departamento 
	 * @return String departamento del producto
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * Método getter del precio
	 * @return int precio del producto
	 */
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("Nombre: ");
		info.append(getNombre());
		info.append("\nDeparamento: ");
		info.append(getDepartamento());
		info.append("\nCodigo de Barras: ");
		info.append(getCodigoBarras());
		info.append("\nPrecio: ");
		info.append(getPrecio());
		return info.toString();
	}
}
