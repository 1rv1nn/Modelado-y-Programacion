import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * Clase que implementa el Menu especial de Hamburguesas de McBurgir 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class MenuEspecial {
    private Hashtable<Integer, Hamburguesa> menuEspacial;

    /**
     * Método constructor de la clase.
     */
    public MenuEspecial() {
        this.menuEspacial = new Hashtable<>();
        Hamburguesa n = new HamburguesaEspecial();
        Hamburguesa m = new HamburguesaAsadera();
        Hamburguesa v = new HamburguesaVegana();
        menuEspacial.put(n.id, n);
        menuEspacial.put(m.id, m);
        menuEspacial.put(v.id, v);
    }

    /**
     * Iterador de la Hashtable
     * @return IteradorHash, el iterador de la HashTable
     */
    public Iterator<Hamburguesa> getIterator() {
        return new HashIterador<>(menuEspacial);
    }

    public Hashtable<Integer, Hamburguesa> getMenu(){
        return menuEspacial;
    }

    /**
     * Clase interna que implementa el iterador del Hashtable.
     * @param <T,V> T para el tipo de valor de las keys, E para los elementos almacenados.
     */
    private class HashIterador<T,E> implements Iterator<E> {

        private Hashtable<T,E> hash;
        private Set<T> keys;
        private Iterator<T> it; 

        public HashIterador(Hashtable<T,E> hash) {
            this.hash = hash;
            keys = this.hash.keySet();
            it = keys.iterator();
        }

        @Override
        public boolean hasNext() {
            if(it.hasNext()) {
                return true;
            } else{
                return false;
            }
        }

        @Override
        public E next() {
            if(hasNext()){
                return hash.get(it.next());
            }
            return null;
        }
    }
}
