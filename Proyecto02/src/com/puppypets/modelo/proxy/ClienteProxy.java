package com.puppypets.modelo.proxy;

/**
 * Clase que implementa el patrón proxy para realizar compras seguras.
 * @author 106956120
 * @version Oracle 17.0 LTS
 */
public class ClienteProxy implements ICliente {
	private ICliente cliente;
	private String cuentaBancaria;

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
	public void pagoServicios(String cuentaBancaria, double precio) {
		if(this.cuentaBancaria.equals(cuentaBancaria)) 
			cliente.pagoServicios(cuentaBancaria, precio);
		else 
			throw new IllegalArgumentException();
	}

	@Override
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}
	

}
