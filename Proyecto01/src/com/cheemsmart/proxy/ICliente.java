package com.cheemsmart.proxy;

/**
 * Interface cliente 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public interface ICliente {
	
	/**
	 * Método que realiza el pago de una compra
	 * @param cuentaBancaria cuenta bancaria del cliente
	 * @param precio precio de la compra
	 */
	void pagarProducto(int cuentaBancaria, double precio);
	
	/**
	 * Método que regresa la cuenta bancaria del cliente.
	 * @return int número de la cuenta bancaria del cliente
	 */
	int getCuentaBancaria();
}
