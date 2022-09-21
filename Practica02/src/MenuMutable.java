import java.util.ArrayList;
import java.util.Iterator;

public class MenuMutable {

    private ArrayList<Hamburguesa> menuMutable; 
    
    public MenuMutable() {
        menuMutable = new ArrayList<>();
        menuMutable.add(new HamburguesaRanchera());
        menuMutable.add(new HamburguesaTocineta());
        menuMutable.add(new HamburguesaChampiqueso());
    }

    public Iterator<Hamburguesa> getIterator() {
        return menuMutable.iterator();
    }
}
