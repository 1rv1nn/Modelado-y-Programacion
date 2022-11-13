package com.cheemsmart.strategy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Tienda mexicana que extiende la clase Tienda.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class TiendaMX extends Tienda{


	@Override
    public void saludar() {
		System.out.println("¡Bienvenido a tu tienda preferida, " + clienteActual.getNombre() + "!");
	}

	@Override
	public void despedirse() {
		System.out.println("¡Vuelva pronto!");
	}

	@Override
	public void opciones() {
		System.out.println("¿Que desea hacer?");
		System.out.println("1. Ver el catalogo. \n2. Comprar productos. \n3. Cerrar sesion. \n4. Salir del programa.");
	}

	@Override
	public String opcionIncorrecta() {
		return "Ha ingresado un valor inválido.";
	}

	@Override
	public void ticket(double precio) {
		if(precio == 0) {
			System.out.println("No ingreso ningún producto, por lo que no compro nada.");
			return;
		}
		System.out.println("--- Carrito de compra ---\n");
		carrito.forEach(System.out::println);
		System.out.println("\nPrecio total: $" + precio);
		System.out.println("\nDinero disponible en su cuenta después del cargo: $" + clienteActual.getDineroDisponible());
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
			System.out.println("\nLa fecha estimada para el envio es " + fechaConFormato + " y la direccion del envio es " + clienteActual.getDireccion());
			System.out.println("\nLe llamaremos al siguiente numero " + clienteActual.getFormatNumber() + "\n");
		} else if (getCarrito().size() < 7) {
			LocalDate fechaEntrega = fechaDeHoy.plus(1, ChronoUnit.WEEKS);
			String fechaConFormato = fechaEntrega.format(formatoFecha);
			System.out.println("\nLa fecha estimada para el envio es " + fechaConFormato + " y la direccion del envio es " + clienteActual.getDireccion());
			System.out.println("\nLe llamaremos al siguiente numero " + clienteActual.getFormatNumber() + "\n");
		} else {
			LocalDate fechaEntrega = fechaDeHoy.plus(3, ChronoUnit.WEEKS);
			String fechaConFormato = fechaEntrega.format(formatoFecha);
			System.out.println("\nLa fecha estimada para el envio es " + fechaConFormato + " y la direccion del envio es " + clienteActual.getDireccion());
			System.out.println("\nLe llamaremos al siguiente numero " + clienteActual.getFormatNumber() + "\n");
		}
	}

	@Override
	public void opcionesCarrito() {
		System.out.println("¿Que accion desea realizar? \n1. Agregar un producto al carrito. \n2. Terminar compra. \n3. Salir sin comprar y/o cancelar compra.");
	}

	@Override
	public void requestBarcode() {
		System.out.println("Selecciones el producto que desea agregar introduciendo el codigo de barras correspondiente.");
		
	}

	@Override
	public void requestAccount() {
		System.out.println("Por favor, ingrese su cuenta de banco.");
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
		return "No tiene el suficiente dinero para realizar la transaccion.";
	}
}
