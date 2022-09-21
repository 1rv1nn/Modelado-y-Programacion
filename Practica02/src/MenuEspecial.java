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
        return new HashIterador<>();
    }

    /**
     * Clase interna que implementa el iterador del Hashtable.
     * @param <T> Utilizamos génericos.
     */
    private class HashIterador<T> implements Iterator<Hamburguesa> {

        Set<Integer> keys = menuEspacial.keySet();
        Iterator<Integer> it = keys.iterator(); 

        @Override
        public boolean hasNext() {
            if(it.hasNext()) {
                return true;
            } else{
                return false;
            }
        }

        @Override
        public Hamburguesa next() {
            if(hasNext()){
                return menuEspacial.get(it.next());
            }
            return null;
        }
    }
}
