package com.cheemsmart.strategy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Tienda US que extiende la clase Tienda.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class TiendaUS extends Tienda {


	@Override
	public void saludar() {
		System.out.println("Welcome, " + clienteActual.getNombre() + "!");
	}

	@Override
	public void despedirse() {
		System.out.println("Goodbye!");
	}

	@Override
	public void opciones() {
		System.out.println("What operation would you like to perform?");
		System.out.println("1. See the catalogue. \n2. Buy. \n3. Log out. \n4. Exit.");
	}

	@Override
	public String opcionIncorrecta() {
		return "You have entered an invalid value.";
	}

	@Override
	public void ticket(double precio) {
		if(precio == 0) {
			System.out.println("You didn't purchase any product.");
			return;
		}
		System.out.println("--- Shopping cart ---\n");
		carrito.forEach(System.out::println);
		System.out.println("\nOrder total: $" + precio);
		System.out.println("\nUpdated account balance: $" + clienteActual.getDineroDisponible());
	}

	@Override
	public void entrega() {
		if(getCarrito().size() < 1) {
			return;
		}
		LocalDate fechaDeHoy = LocalDate.now();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		if (getCarrito().size() < 3) {
			LocalDate fechaEntrega = fechaDeHoy.plus(3, ChronoUnit.DAYS);
			String fechaConFormato = fechaEntrega.format(formatoFecha);
			System.out.println("\nThe estimated delivery date is " + fechaConFormato + " and the address to which the product will be shipped is " + clienteActual.getDireccion());
			System.out.println("\nWe will call you at the following number " + clienteActual.getFormatNumber() + "\n");
		} else if (getCarrito().size() < 7) {
			LocalDate fechaEntrega = fechaDeHoy.plus(1, ChronoUnit.WEEKS);
			String fechaConFormato = fechaEntrega.format(formatoFecha);
			System.out.println("\nThe estimated delivery date is " + fechaConFormato + " and the address to which the product will be shipped is " + clienteActual.getDireccion());
			System.out.println("\nWe will call you at the following number " + clienteActual.getFormatNumber() + "\n");
		} else {
			LocalDate fechaEntrega = fechaDeHoy.plus(3, ChronoUnit.WEEKS);
			String fechaConFormato = fechaEntrega.format(formatoFecha);
			System.out.println("\nThe estimated delivery date is " + fechaConFormato + " and the address to which the product will be shipped is " + clienteActual.getDireccion());
			System.out.println("\nWe will call you at the following number " + clienteActual.getFormatNumber() + "\n");
		}
	}

	@Override
	public void opcionesCarrito() {
		System.out.println("Which operation do you wish to perform? \n1. Add a product to the cart. \n2. Checkout. \n3. Check out without purchasing and/or cancel purchase.");
	}

	@Override
	public void requestBarcode() {
		System.out.println("Select the product you wish to add to the cart by entering its barcode.");
		
	}

	@Override
	public void requestAccount() {
		System.out.println("Please enter your bank account.");
	}

	@Override
	public void cancel() {
		System.out.println("Your order has been cancelled.");
	}

	@Override
	public String cuentaIncorrecta() {
		return "You've entered an account that does not correspond to the customer. The entire application will be closed.";
	}

	@Override
	public String dineroInsuficiente() {
		return "You don't have enough money to make such a transaction.";
	}
}
