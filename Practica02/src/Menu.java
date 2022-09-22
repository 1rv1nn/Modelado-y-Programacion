import java.util.Iterator;

/**
 * Clase que implementa todos los menús.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class Menu {
    MenuGeneral menuGeneral;
    MenuMutable menuMutable;
    MenuEspecial menuEspecial;

    /**
     * Método contructor de la clase
     * @param menuGeneral Menú general de McBurgir
     * @param menuMutable Menú del día de McBurgir
     * @param menuEspecial Menú especial de McBurgir
     */
    public Menu(MenuGeneral menuGeneral, MenuMutable menuMutable, MenuEspecial menuEspecial) {
        this.menuGeneral = menuGeneral;
        this.menuMutable = menuMutable;
        this.menuEspecial = menuEspecial;
    }

    /*
     * Método que imprime todos los menús de McBurgir
     */
    public void imprimeMenu() {
        Iterator<Hamburguesa> iteradorGeneral = menuGeneral.getIterator();
        Iterator<Hamburguesa> iteradorMutable = menuMutable.getIterator();
        Iterator<Hamburguesa> iteradorEspecial = menuEspecial.getIterator();


        System.out.println("\n**** Menu General ****\n------\n");
        imprimeMenu(iteradorGeneral);

        System.out.println("\n**** Menu del Día ****\n------\n");
        imprimeMenu(iteradorMutable);

        System.out.println("\n**** Menu Especial ****\n------\n");
        imprimeMenu(iteradorEspecial);
    }

    /**
     * Método que imprime únicamente un menú de McBurigr
     * @param iterador El iterador de la estructura de datos con la cual almacenamos las hamburguesas
     */
    private void imprimeMenu(Iterator<Hamburguesa> iterador){
        while(iterador.hasNext()){
            Hamburguesa burgir = iterador.next();
            System.out.println(burgir);
        }
    }
}
