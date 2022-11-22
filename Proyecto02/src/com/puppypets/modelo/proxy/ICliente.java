package com.puppypets.modelo.proxy;

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
