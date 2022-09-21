import java.util.Iterator;

public class MenuGeneral {
    private Hamburguesa menuGeneral[] = new Hamburguesa[3];

    public MenuGeneral() {
        menuGeneral[0] = new HamburguesaHawaiana();
        menuGeneral[1] = new HamburguesaChoriqueso();
        menuGeneral[2] = new HamburguesaVegetariana();
    }

    public Iterator<Hamburguesa> getIterator(){
        return new ArrayIterador<Hamburguesa>();
    }

    private class ArrayIterador<T> implements Iterator<Hamburguesa> {

        int index = 0;

        @Override
        public boolean hasNext() {
            if(index < menuGeneral.length){
                return true;
            }
            return false;
        }
        
        @Override
        public Hamburguesa next() {
            if(hasNext()){
                return menuGeneral[index++];
            }
            return null;
        }
    }
}
