package com.cheemsmart.proxy;

/**
 * Clase que implementa el proxy e implementa la interface ICliente.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class ClienteProxy implements ICliente {

	private ICliente cliente;
	private int cuentaBancaria;
	
	/**
	 * Método constructor de la clase.
	 * @param cliente Cliente del cual se quiere extrae la cuenta bancaria.
	 */
	public ClienteProxy(ICliente cliente) {
		this.cliente = cliente;
		cuentaBancaria = cliente.getCuentaBancaria();
	}

	/**
	 * Método que verifica que la cuenta bancaria sea correcta.
	 */
	@Override
	public void pagarProducto(int cuentaBancaria, double precio) {
		if(this.cuentaBancaria == cuentaBancaria) {
			cliente.pagarProducto(cuentaBancaria, precio);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public int getCuentaBancaria() {
		return cuentaBancaria;
	}

}
