package com.cheemsmart.iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;

import com.cheemsmart.facade.Producto;

/**
 * Clase que implementa el catalogo del dapartamento de electrodomésticos de la tienda.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class CatalogoElectrodomesticos {
	private Set<Producto> catalogo;
	
	/**
	 * Método constructor
	 */
	public CatalogoElectrodomesticos() {
		catalogo = new HashSet<>();	
		
		catalogo.add(new Producto(randomNum(7000, 7999), "Refrigerador Samsung", "Electrodomesticos", 10000));
		catalogo.add(new Producto(randomNum(7000, 7999), "Lavadora Mabe", "Electrodomesticos", 15000));
		catalogo.add(new Producto(randomNum(7000, 7999), "Aspiradora", "Electrodomesticos", 1500));
		catalogo.add(new Producto(randomNum(7000, 7999), "Licuadora", "Electrodomesticos", 500));
		catalogo.add(new Producto(randomNum(7000, 7999), "Extractor de jugos", "Electrodomesticos", 1200));
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
