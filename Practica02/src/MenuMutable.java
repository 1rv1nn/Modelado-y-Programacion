import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que implementa el menú del día de McBurgir
 */
public class MenuMutable {

    private ArrayList<Hamburguesa> menuMutable; 
    
    /**
     * Método constructor
     */
    public MenuMutable() {
        menuMutable = new ArrayList<>();
        menuMutable.add(new HamburguesaRanchera());
        menuMutable.add(new HamburguesaTocineta());
        menuMutable.add(new HamburguesaChampiqueso());
    }

    /**
     * Método que regresa el iterador de ArrayList.
     * 
     * @return Iterador de arraylist de la haburguesas.
     */
    public Iterator<Hamburguesa> getIterator() {
        return menuMutable.iterator();
    }

    /**
     * Método que devuelve el Arraylist del menú.
     * 
     * @return ArrayList de las hamburguesas
     */
    public ArrayList<Hamburguesa> getMenu(){
        return menuMutable;
    }
}
