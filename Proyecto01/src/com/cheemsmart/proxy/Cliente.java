package com.cheemsmart.proxy;

import java.util.NoSuchElementException;

/**
 * Clase cliente que implementa la interface ICliente y que simula un cliente.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class Cliente implements ICliente {
	private static int id = 0;
	String nombreUsuario;
	String password;
	String nombre;
	long telefono;
	String direccion;
	int cuentaBancaria;
	String paisOrigen;
	double dineroDisponible;
	
	/**
	 * Método constructor de la clase.
	 * @param nombreUsuario String usuario del cliente.
	 * @param password String contraseña del cliente.
	 * @param nombre String nombre del cliente.
	 * @param telefono long numero telefonico del cliente.
	 * @param direccion String domicilio del cliente.
	 * @param cuentaBancaria int cuenta bancaria del cliente.
	 * @param paisOrigen String pais de origen del cliente.
	 * @param dineroDisponible double Dinero disponible en la cuenta del cliente.
	 */
	public Cliente(String nombreUsuario, String password, String nombre, long telefono, String direccion, int cuentaBancaria, String paisOrigen, double dineroDisponible){
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.cuentaBancaria = cuentaBancaria;
		this.paisOrigen = paisOrigen;
		this.dineroDisponible = dineroDisponible;
		id = creaID();
	}
	
	/**
	 * Genera un ID nuevo para cada cliente.
	 * @return int id del cliente.
	 */
	private static int creaID() {
		id++;
		return id;
	}

	/**
	 * Método getter del ID
	 * @return int id del cliente.
	 */
	public static int getId() {
		return id;
	}
	
	/**
	 * Método getter del nombre
	 * @return String nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método getter del nombre de usuario
	 * @return String nombre de usuario del cliente.
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Método getter de la dirección
	 * @return String domicilio del cliente.
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Método getter de cuenta bancaria.
	 * @return int numero de cuenta bancaria del cliente
	 */
	public int getCuentaBancaria() {
		return cuentaBancaria;
	}

	/**
	 * Método getter del país de origen
	 * @return String país de origen del cliente.
	 */
	public String getPaisOrigen() {
		return paisOrigen;
	}

	
	/**
	 * Método getter del dinero disponible
	 * @return int dinero en la cuenta bancaria del cliente
	 */
	public double getDineroDisponible() {
		return dineroDisponible;
	}
	
	
	/**
	 * Método getter de la constraseña
	 * @return String contraseña del cliente.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Método getter del telefono
	 * @return long numero telefonico del cliente
	 */
	public long getTelefono() {
		return telefono;
	}
	
	/**
	 * Método que da formato a los números de los clientes
	 * @return String numero telefonico del cliente con formato
	 */
	public String getFormatNumber() {
		if(getPaisOrigen().equalsIgnoreCase("Mexico")) {
			return formatNumberMX(getTelefono());
		} else if(getPaisOrigen().equalsIgnoreCase("Spain")) {
			return formatNumberES(getTelefono());
		} else if(getPaisOrigen().equalsIgnoreCase("Estados Unidos")) {
			return formatNumberUS(getTelefono());
		}
		return null;
	}

	@Override
	public void pagarProducto(int cuentaBancaria, double precio) {
		if(precio <= dineroDisponible) {
			dineroDisponible-=precio;
		} else {
			throw new NoSuchElementException();
		}
	}	
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Usuario: ");
		s.append(getNombreUsuario());
		s.append("\nNumero telefonico: ");
		if(getPaisOrigen().equalsIgnoreCase("Mexico")) {
			s.append(formatNumberMX(getTelefono()));
		} else if(getPaisOrigen().equalsIgnoreCase("Spain")) {
			s.append(formatNumberES(getTelefono()));
		} else if(getPaisOrigen().equalsIgnoreCase("Estados Unidos")) {
			s.append(formatNumberUS(getTelefono()));
		}
		s.append("\nDireccion: ");
		s.append(getDireccion());
		s.append("\nPais de origen: ");
		s.append(getPaisOrigen());
		
		return s.toString();
	}
	
	/**
	 * Método estatico que da formato a los números mexicanos.
	 * @param number long numero del cliente
	 * @return String numero del cliente con formato
	 */
	private static String formatNumberMX(long number) {
		StringBuilder formato = new StringBuilder();
		formato.append(Long.toString(number));
		for(int i = 0; i < 8; i++) {
			if(i == 2 || i == 7) {
				formato.insert(i, ' ');
			}
		}
		formato.insert(0, "+52 ");
		
		return formato.toString();
	}
	
	/**
	 * Método estatico que da formato a los números estadounidenses.
	 * @param number long numero del cliente
	 * @return String numero del cliente con formato
	 */
	private static String formatNumberUS(long number) {
		StringBuilder formato = new StringBuilder();
		formato.append(Long.toString(number));
		for(int i = 0; i < formato.length(); i++) {
			if(i == 0) {
				formato.insert(i, '(');
			}
			if(i == 4) {
				formato.insert(i, ") ");
			}
			if(i == 9) {
				formato.insert(i, '-');
				break;
			}
		}
		formato.insert(0, "+1 ");
		
		return formato.toString();
	}
	
	/**
	 * Método estatico que da formato a los números españoles.
	 * @param number long numero del cliente
	 * @return String numero del cliente con formato
	 */
	private static String formatNumberES(long number) {
		StringBuilder formato = new StringBuilder();
		formato.append(Long.toString(number));
		for(int i = 0; i < formato.length(); i++) {
			if(i == 3 || i == 6) {
				formato.insert(i, ' ');
			}
			if(i == 9) {
				formato.insert(i, ' ');
				break;
			}
		}
		formato.insert(0, "+34 ");
		
		return formato.toString();
	}
}
