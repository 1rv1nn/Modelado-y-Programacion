import java.util.Iterator;

public class Menu {
    MenuGeneral menuGeneral;
    MenuMutable menuMutable;
    MenuEspecial menuEspecial;

    public Menu(MenuGeneral menuGeneral, MenuMutable menuMutable, MenuEspecial menuEspecial) {
        this.menuGeneral = menuGeneral;
        this.menuMutable = menuMutable;
        this.menuEspecial = menuEspecial;
    }

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

    private void imprimeMenu(Iterator<Hamburguesa> iterador){
        while(iterador.hasNext()){
            Hamburguesa burgir = iterador.next();
            System.out.println(burgir);
        }
    }
}
