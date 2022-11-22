package com.puppypets.modelo.proxy;

/**
 * Clase que modela los pagos del el cliente.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando (FWgalde)
 * 
 * @version 1.0
 * @since  Oracle JDK 17.0 LTS
 */ 

public interface  ICliente {
	
	/**
	 * Método que realiza el pago de una compra
	 * @param cuentaBancaria cuenta bancaria del cliente
	 * @param precio precio de la compra
	 */
	void pagoServicios(String cuentaBancaria, double precio);
	
	/**
	 * Método que regresa la cuenta bancaria del cliente.
	 * @return número de la cuenta bancaria del cliente
	 */
	String getCuentaBancaria();
}
