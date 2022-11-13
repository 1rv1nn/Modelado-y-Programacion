package com.cheemsmart.strategy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Tienda española que extiende la clase Tienda.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class TiendaES extends Tienda {

	@Override
	public void saludar() {
		System.out.println("¡Bienvenido a vuestra tienda preferida, " + clienteActual.getNombre() + "!");
	}

	@Override
	public void despedirse() {
		System.out.println("¡Hasta luego!");
	}

	@Override
	public void opciones() {
		System.out.println("¿Que desea hacer?");
		System.out.println("1. Mirar el catalogo. \n2. Comprar productos. \n3. Cerrar sesion. \n4. Salir del programa.");
	}

	@Override
	public String opcionIncorrecta() {
		return "Introdujo un valor inválido.";
	}

	@Override
	public void ticket(double precio) {
		System.out.println("--- Cesta ---");
		carrito.forEach(System.out::println);
		System.out.println("Precio total: €" + precio);
		System.out.println("Vuestro saldo de cuenta actulizado: €" + clienteActual.getDineroDisponible());
	}

	@Override
	public void entrega() {
		if(getCarrito().size() < 1) {
			return;
		}
        LocalDate fechaDeHoy = LocalDate.now();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		if (getCarrito().size() < 3) {
			LocalDate fechaEntrega = fechaDeHoy.plus(3, ChronoUnit.DAYS);
			String fechaConFormato = fechaEntrega.format(formatoFecha);
			System.out.println("\nLa fecha estimada para el envio es " + fechaConFormato + " y vuestra direccion para el envio es " + clienteActual.getDireccion());
			System.out.println("\nLe llamaremos al siguiente numero " + clienteActual.getFormatNumber() + "\n");
		} else if (getCarrito().size() < 7) {
			LocalDate fechaEntrega = fechaDeHoy.plus(1, ChronoUnit.WEEKS);
			String fechaConFormato = fechaEntrega.format(formatoFecha);
			System.out.println("\nLa fecha estimada para el envio es " + fechaConFormato + " y vuestra direccion para el envio es " + clienteActual.getDireccion());
			System.out.println("\nLe llamaremos al siguiente numero " + clienteActual.getFormatNumber() + "\n");
		} else {
			LocalDate fechaEntrega = fechaDeHoy.plus(3, ChronoUnit.WEEKS);
			String fechaConFormato = fechaEntrega.format(formatoFecha);
			System.out.println("\nLa fecha estimada para el envio es " + fechaConFormato + " y vuestra direccion para el envio es " + clienteActual.getDireccion());
			System.out.println("\nLe llamaremos al siguiente numero " + clienteActual.getFormatNumber() + "\n");
		}
	}

	@Override
	public void opcionesCarrito() {
		System.out.println("¿Que desea hacer? \n1. Coger algún producto. \n2. Terminar compra. \n3. Salir sin comprar y/o cancelando compra.");
	}

	@Override
	public void requestBarcode() {
		System.out.println("Coja el producto que desea agregar introduciendo el codigo de barras correspondiente.");		
	}

	@Override
	public void requestAccount() {
		System.out.println("Por favor, introduzca su cuenta de banco.");
	}

	@Override
	public void cancel() {
		System.out.println("Su orden ha sido cancelada.");		
	}

	@Override
	public String cuentaIncorrecta() {
		return "Ha ingresado una cuenta que no corresponde al usuario. Toda la aplicacion sera cerrada.";
	}

	@Override
	public String dineroInsuficiente() {
		return "No tiene el monto suficiente para realizar la transaccion.";
	}
}
