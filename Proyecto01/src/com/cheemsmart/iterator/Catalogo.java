package com.cheemsmart.iterator;

import java.util.Iterator;
import java.util.function.BiPredicate;

import com.cheemsmart.facade.Producto;

/**
 * Clase que implementa el catalogo completo de la tienda.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class Catalogo {
	private CatalogoAlimentos alimentos;
	private CatalogoElectrodomesticos electrodomesticos;
	private CatalogoElectronica electronica;

	/**
	 * Método constructor por defecto
	 */
	public Catalogo() {
		alimentos = new CatalogoAlimentos();
		electrodomesticos = new CatalogoElectrodomesticos();
		electronica = new CatalogoElectronica();
	}
	
	/**
	 * Método constructor donde le pasamos los menus 
	 * @param alimentos Catálogo del departamento de alimentos
	 * @param electrodomesticos Catálogo del departamento de electrodomesticos
	 * @param electronica Catálogo del departamento de electrónica 
	 */
	public Catalogo(CatalogoAlimentos alimentos, CatalogoElectrodomesticos electrodomesticos, CatalogoElectronica electronica) {
		this.alimentos = alimentos;
		this.electrodomesticos = electrodomesticos;
		this.electronica = electronica;
	}
	
	/**
	 * Método que imprime el catálogo completo.
	 */
	public void imprimeCatalogo() {
		Iterator<Producto> iteradorAlimentos = alimentos.getIterator();
		Iterator<Producto> iteradorElectrodomesticos = electrodomesticos.getIterator();
		Iterator<Producto> iteradorElectronica = electronica.getIterator();
		
		System.out.println("\n--- Catalogo ---\n");
		imprimeCatalogo(iteradorAlimentos);
		System.out.println();
		imprimeCatalogo(iteradorElectrodomesticos);
		System.out.println();
		imprimeCatalogo(iteradorElectronica);
	}
	
	/**
	 * Método auxiliar que imprime un catálogo a través de un iterador
	 * @param iterador Iterator de un catálogo
	 */
    private void imprimeCatalogo(Iterator<Producto> iterador){
        while(iterador.hasNext()){
        	Producto p = iterador.next();
            System.out.println(p + "\n");
        }
    }
    static BiPredicate<Integer, Integer> highInterval = (number, limit) -> number <= limit;
	static BiPredicate<Integer, Integer> lowInterval = (number, limit) -> limit <= number;
    static BiPredicate<Integer, Integer> interval = highInterval.and(highInterval);

	/**
     * Método que obtiene el producto que se va a entregar
     * @param codigo int Codigo de barras del producto
     * @return Producto que se busca o null en otro caso
     */
    public Producto entrega(int codigo) {

    	if(3000 <= codigo && codigo < 4000) {
    		Iterator<Producto> iteradorAlimentos = alimentos.getIterator();
    		return buscaProducto(iteradorAlimentos, codigo);
    	} else if(5000 <= codigo && codigo < 6000) {
    		Iterator<Producto> iteradorElectronica = electronica.getIterator();
    		return buscaProducto(iteradorElectronica, codigo);
    	} else if(7000 < codigo && codigo < 8000) {
    		Iterator<Producto> iteradorElectrodomesticos = electrodomesticos.getIterator();
    		return buscaProducto(iteradorElectrodomesticos, codigo);
    	}
    	return null;
    }

	 

    /**
     * Método auxiliar para buscar un producto.
     * @param iterador Iterador del catalogo donde se va a buscar.
     * @param codigo codigo de barras del producto
     * @return producto que se va a entregar o null en otro caso
     */
    private Producto buscaProducto(Iterator<Producto> iterador, int codigo) {
    	while(iterador.hasNext()) {
    		Producto p = iterador.next();
    		if(p.getCodigoBarras() == codigo) {
    			return p;
    		}
    	}
    	return null;
    }
}

