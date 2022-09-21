import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MenuEspecial {
    private Hashtable<Integer, Hamburguesa> menuEspacial;

    public MenuEspecial() {
        Hamburguesa n = new HamburguesaEspecial();
        Hamburguesa m = new HamburguesaAsadera();
        Hamburguesa v = new HamburguesaVegana();
        menuEspacial.put(n.id, n);
        menuEspacial.put(m.id, m);
        menuEspacial.put(v.id, v);
    }

    public Iterator<Hamburguesa> getIterator() {
        return new HashIterador<>();
    }

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
