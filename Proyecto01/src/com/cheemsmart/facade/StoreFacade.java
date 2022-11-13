package com.cheemsmart.facade;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

import com.cheemsmart.iterator.Catalogo;
import com.cheemsmart.proxy.Cliente;
import com.cheemsmart.proxy.ClienteProxy;
import com.cheemsmart.strategy.*;

/**
 * Clase fachada que opera todo el subsistema creado.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class StoreFacade {
	private ArrayList<Cliente> clientes;
	private Tienda tienda;
	private Catalogo catalogo;
	private ClienteProxy cliente;

	/**
	 * Método constructor por defecto
	 */
	public StoreFacade() {
		Cliente clienteMX = new Cliente("perrito12", "perrito12", "Francisco Javier Lopez", randomPhoneMX(),
				"Balderas 123, CDMX", 89403580, "Mexico", 200);
		Cliente clienteUS = new Cliente("powerDestroyer", "1234", "Bill Clinton", randomPhoneUS(),
				"Hollywood #123, Los Angeles", 57723187, "Estados Unidos", 9000000);
		Cliente clienteES = new Cliente("manolito14", "ManuelGomez29", "Manuel Gomez", randomPhoneES(),
				"Av. Nacional #213, Madrid", 49302922, "Spain", 5000000);
		clientes = new ArrayList<>();
		clientes.add(clienteMX);
		clientes.add(clienteES);
		clientes.add(clienteUS);
		catalogo = new Catalogo();
	}

	/**
	 * Método estático que devuleve números de la cdmx
	 * @return long número de teléfono de CDMX, México
	 */
	private static long randomPhoneMX() {
		Random r = new Random();
		return r.nextInt(199999999) + 5500000000L;
	}

	/**
	 * Método estático que devuelve números de San Francisco
	 * @return long numero de telefono de San Francisco, California, US.
	 */
	private static long randomPhoneUS() {
		Random r = new Random();
		return r.nextInt(9999999) + 4150000000L;
	}

	/**
	 * Método estático que devuelve números de España
	 * @return long número de teléfono de España.
	 */
	private static long randomPhoneES() {
		Random r = new Random();
		return r.nextInt(999999999) + 6000000000L;
	}

	/**
	 * Método que le permite al usuario ingresar a la aplicación
	 * @param usuario nombre de usuario
	 * @param password contraseña del usuario
	 */
	public void ingresar(String usuario, String password) {
		boolean existe = clientes.stream().anyMatch(p -> p.getNombreUsuario().equalsIgnoreCase(usuario));
		if (existe) {
			Cliente actual = clientes.stream().filter(p -> p.getNombreUsuario().equalsIgnoreCase(usuario)).findFirst()
					.get();
			if (actual.getPassword().equals(password)) {
				if (actual.getPaisOrigen().equalsIgnoreCase("Spain")) {
					tienda = new TiendaES();
				} else if (actual.getPaisOrigen().equalsIgnoreCase("Mexico")) {
					tienda = new TiendaMX();
				} else if (actual.getPaisOrigen().equalsIgnoreCase("Estados Unidos")) {
					tienda = new TiendaUS();
				}
				cliente = new ClienteProxy(actual);
				tienda.setClienteActual(actual);
				tienda.saludar();
			} else {
				throw new IllegalArgumentException("The password that you've entered is incorrect.");
			}
		} else {
			throw new NoSuchElementException("The username you entered isn't connected to an account.");
		}
	}

	/**
	 * Método que muestra el catalogo de la tienda
	 */
	public void mostrarMenu() {
		catalogo.imprimeCatalogo();
	}
	
	/**
	 * Método que devuleve las opciones principales del cliente
	 */
	public void menuPrincipal() {
		tienda.opciones();
	}
	
	/**
	 * Método que devuelve las opciones que tiene el cliente cuando quiere realizar una compra
	 */
	public void opciones() {
		catalogo.imprimeCatalogo();
		tienda.opcionesCarrito();
	}
	
	/**
	 * Método para agreagar un producto cuando se realiza una compra
	 * @param codigo codigo de barras del producto que se desea agreagar
	 */
	public void agregarProducto(int codigo) {
		Producto p = catalogo.entrega(codigo);

		if(p == null) {
			throw new NoSuchElementException(tienda.opcionIncorrecta());
		}
		tienda.agregarAlCarrito(p);
	}
	
	/**
	 * Método que termina la compra cuando se está realizando una compra.
	 * @param cuenta cuenta bancaria con la que se va a pagar el precio total
	 */
	public void terminarCompra(int cuenta) {
		double precioTotal = tienda.precio();			
		try {
			cliente.pagarProducto(cuenta, precioTotal);						
			tienda.ticket(precioTotal);
			tienda.entrega();
		} catch (IllegalArgumentException iae) {
			cuentaIncorrecta();
		} catch(NoSuchElementException nsee) {
			System.err.println(tienda.dineroInsuficiente());
		}
	}
	
	/**
	 * Método que cierra el programa después de haber introducido una cuenta bancaria incorrecta.
	 */
	public void cuentaIncorrecta() {
		System.err.println(tienda.cuentaIncorrecta());
		System.exit(0);
	}
	
	/**
	 * Método que le pide al usuario información para realizar acciones
	 * @param opcion Información que se necesita del usuario
	 */
	public void request(int opcion) {
		if(opcion == 1) {
			tienda.requestBarcode();
		} else if(opcion == 2) {
			tienda.requestAccount();
		} else if(opcion == 3) {
			tienda.cancel();
		}
	}

	/**
	 * Método para cerrar sesión 
	 */
	public void cerrarSesion() {
		tienda.despedirse();
		tienda = null;
	}

	/**
	 * Método para regresar un error.
	 */
	public void error() {
		System.err.println(tienda.opcionIncorrecta());
	}
}
