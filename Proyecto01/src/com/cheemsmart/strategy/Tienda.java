package com.cheemsmart.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.cheemsmart.facade.Producto;
import com.cheemsmart.proxy.Cliente;

/**
 * Clase abstracta tienda que se encarga de implementar una tienda generica.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public abstract class Tienda {
	protected Cliente clienteActual;
	protected ArrayList<Producto> carrito;

	/**
	 * Método constructor.
	 */
	public Tienda() {
		this.carrito = new ArrayList<>();
	}

	/**
	 * Método que se utiliza para saludar al usuario.
	 */
	public abstract void saludar();

	/**
	 * Método que se utiliza para despedirse del usuario.
	 */
	public abstract void despedirse();

	/**
	 * Método que despliega las opciones que tiene el usuario al principio.
	 */
	public abstract void opciones();

	/**
	 * Método que despliega las opciones que tiene el usuario al comprar.
	 */
	public abstract void opcionesCarrito();

	/**
	 * Método que devuelva una cadena generica de error.
	 * 
	 * @return String que representa el mensaje de un error.
	 */
	public abstract String opcionIncorrecta();

	/**
	 * Método que le pide al usuario el código de barras.
	 */
	public abstract void requestBarcode();

	/**
	 * Método que le pide la cuenta de banco al usuario.
	 */
	public abstract void requestAccount();

	/**
	 * Método que cancela la compra.
	 */
	public abstract void cancel();

	/**
	 * Método que devuelve el mensaje de error cuando ingresan una cuenta de banco
	 * incorrecta.
	 * 
	 * @return String mensaje de error.
	 */
	public abstract String cuentaIncorrecta();

	/**
	 * Método que devuelve el mensaje de error cuando el usuario no tiene dinero
	 * suficiente para comprar su carrito de compra.
	 * 
	 * @return String mensaje de error.
	 */
	public abstract String dineroInsuficiente();

	/**
	 * Método que devuelve el ticket de compra.
	 * 
	 * @param precio Precio total del carrito de compra.
	 */
	public abstract void ticket(double precio);

	/**
	 * Método que devuelve las indicaciones de la entrega del producto.
	 */
	public abstract void entrega();

	/**
	 * Probabilidad de que te toque una oferta
	 * @return true si te toca, false en otro caso
	 */
	private boolean daOferta() {
		Random r = new Random();
		int proba = r.nextInt(1000 - 1) + 1;
		if (proba % 13 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Método para agreagar al carrito de compra
	 * @param p Producto que se agreaga al carrito
	 */
	public void agregarAlCarrito(Producto p) {
		carrito.add(p);
	}

	/**
	 * Método que evalua que productos tendrán un descuento y cuanto será el monto total del descuento.
	 * @return monto total del descuento.
	 */
	private double descuentoAplicado() {
		if (clienteActual.getPaisOrigen().equals("Mexico")) {
			List<Producto> alimentos = carrito.stream()
					.filter(p -> 3000 <= p.getCodigoBarras() && p.getCodigoBarras() < 4000)
					.collect(Collectors.toList());
			if (!alimentos.isEmpty()) {
				return alimentos.stream().map(p -> p.getPrecio() * .20).collect(Collectors.toList()).stream()
						.mapToDouble(Double::doubleValue).sum();
			}
		} else if (clienteActual.getPaisOrigen().equals("Spain")) {
			List<Producto> electronica = carrito.stream()
					.filter(p -> 5000 <= p.getCodigoBarras() && p.getCodigoBarras() < 6000)
					.collect(Collectors.toList());
			if (!electronica.isEmpty()) {
				return electronica.stream().map(p -> p.getPrecio() * .20).collect(Collectors.toList()).stream()
						.mapToDouble(Double::doubleValue).sum();
			}
		} else if (clienteActual.getPaisOrigen().equals("Spain")) {
			List<Producto> electrodomesticos = carrito.stream()
					.filter(p -> 7000 <= p.getCodigoBarras() && p.getCodigoBarras() < 8000)
					.collect(Collectors.toList());
			if (!electrodomesticos.isEmpty()) {
				return electrodomesticos.stream().map(p -> p.getPrecio() * .20).collect(Collectors.toList()).stream()
						.mapToDouble(Double::doubleValue).sum();
			}
		}
		return 0;
	}

	/**
	 * Método que devuleve el precio total (ya con descuento) del carrito.
	 * @return precio total de la compra.
	 */
	public double precio() {
		double suma = carrito.stream().map(p -> p.getPrecio()).collect(Collectors.toList()).stream()
				.mapToDouble(Double::doubleValue).sum();
		if (daOferta()) {
			double descuento = descuentoAplicado();
			System.out.println("\nDESCUENTO: $" + descuento + "\n");
			suma -= descuento;
		}
		return suma;
	}

	/**
	 * Método setter de cliente.
	 * @param clienteActual Cliente que esta actualmente en la tienda.
	 */
	public void setClienteActual(Cliente clienteActual) {
		this.clienteActual = clienteActual;
	}

	/**
	 * Método getter del carrito de compra.
	 * @return ArrayList<Producto> que representa el carrito de compra.
	 */
	public ArrayList<Producto> getCarrito() {
		return carrito;
	}

}
