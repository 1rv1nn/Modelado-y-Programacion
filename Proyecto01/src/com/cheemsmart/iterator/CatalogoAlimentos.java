package com.cheemsmart.iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;

import com.cheemsmart.facade.Producto;

/**
 * Clase que implementa el catalogo del dapartamento de alimentos de la tienda.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class CatalogoAlimentos {
	private Set<Producto> catalogo;
	
	/**
	 * Método constructor
	 */
	public CatalogoAlimentos() {
		catalogo = new HashSet<>();	
		catalogo.add(new Producto(randomNum(3000, 3999), "Pollo crudo", "Carnes frías", 120));
		catalogo.add(new Producto(randomNum(3000, 3999), "Paquete de Nuggets", "Carne procesada", 70));
		catalogo.add(new Producto(randomNum(3000, 3999), "Leche Santa Clara 1.2L", "Lacteos", 70));
		catalogo.add(new Producto(randomNum(3000, 3999), "Guayaba 1kg", "A. Frutas y Verduras", 40));
		catalogo.add(new Producto(randomNum(3000, 3999), "Pescado crudo", "Carnes frías", 120));
	}
	
	/**
	 * Método que da un número random dentro de un intervalo cerrado
	 * @param low valor mínimo del intervalo
	 * @param high valor máximo del intervalo
	 * @return int número random dentro del intervalo
	 */
	private static int randomNum(int low, int high) {
		Random r = new Random();
		return r.nextInt(high - low) + low;
	}
	
	/**
	 * Método que devuelve el iterador
	 * @return Iterator del catalogo
	 */
	public Iterator<Producto> getIterator(){
		return catalogo.iterator();
	}
}
