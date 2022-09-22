import java.util.Iterator;

/**
 * Clase que implementa el menú general de McBurgir
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class MenuGeneral {
    private Hamburguesa menuGeneral[] = new Hamburguesa[3];

    /**
     * Método constructor
     */
    public MenuGeneral() {
        menuGeneral[0] = new HamburguesaHawaiana();
        menuGeneral[1] = new HamburguesaChoriqueso();
        menuGeneral[2] = new HamburguesaVegetariana();
    }

    /**
     * Método iterador que nos regresa el Iterador de un arreglo.
     * 
     * @return Iterador del arreglo de hamburguesas
     */
    public Iterator<Hamburguesa> getIterator(){
        return new ArrayIterador<Hamburguesa>(menuGeneral);
    }

    /**
     * Nos regresa el arreglo de hamburguesas.
     */
    public Hamburguesa[] getMenu() {
        return menuGeneral;
    }

    /**
     * Clase interna del iterador de un arreglo 
     * 
     * @param <E> Donde E son los elementos del arreglo
     */
    private class ArrayIterador<E> implements Iterator<E> {

        int index = 0;
        E array[];

        public ArrayIterador(E[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            if(index < menuGeneral.length){
                return true;
            }
            return false;
        }
        
        @Override
        public E next() {
            if(hasNext()){
                return array[index++];
            }
            return null;
        }
    }
}
