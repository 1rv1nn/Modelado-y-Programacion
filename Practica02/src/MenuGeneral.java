import java.util.Iterator;

public class MenuGeneral {
    private Hamburguesa menuGeneral[] = new Hamburguesa[3];

    public MenuGeneral() {
        menuGeneral[0] = new HamburguesaHawaiana();
        menuGeneral[1] = new HamburguesaChoriqueso();
        menuGeneral[2] = new HamburguesaVegetariana();
    }

    public Iterator<Hamburguesa> getIterator(){
        return new ArrayIterador<Hamburguesa>(menuGeneral);
    }

    public Hamburguesa[] getMenu() {
        return menuGeneral;
    }

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
