package com.cheemsmart.iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;

import com.cheemsmart.facade.Producto;


/**
 * Clase que implementa el catalogo del dapartamento de electrónica de la tienda.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class CatalogoElectronica {
	private Set<Producto> catalogo;
	
	/**
	 * Método constructor
	 */
	public CatalogoElectronica() {
		catalogo = new HashSet<>();	
		
		catalogo.add(new Producto(randomNum(5000, 5999), "Samguns S21 Plus", "Telefonia", 20000));
		catalogo.add(new Producto(randomNum(5000, 5999), "IPad Pro", "Tecnologia", 50000));
		catalogo.add(new Producto(randomNum(5000, 5999), "Play Station 5", "Videojuegos", 15000));
		catalogo.add(new Producto(randomNum(5000, 5999), "MacBook Air 15'", "Computacion", 15000));
		catalogo.add(new Producto(randomNum(5000, 5999), "Nikon 9200D", "Fotografia", 40000));
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
