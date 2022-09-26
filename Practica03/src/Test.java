import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Alimento baguete = new BaguetteBlanco();

        Pizza pizza = new PizzaHawaina();

        baguete = new Jamon(baguete);
        baguete = new Jamon(baguete);

        AdaptadorPizza pizza2 = new AdaptadorPizza(pizza);

        System.out.println(baguete.getDescripcion() + "\nSu precio total es: \t\t$" + baguete.precio());
        System.out.println(pizza2.getDescripcion() + "\nSu precio total es: \t\t$" + pizza2.precio());

        int tipoAlimento = 0;
        
        int tipoPizza = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\t\t*** Bienvenido a WaySub ***" +
                    "\nEliga alguno de nuestro siguientes productos:" +
                    "\n1. Baguette." +
                    "\n2. Pizza." +
                    "\n0. Salir.");
            try {
                tipoAlimento = sc.nextInt();
            } catch (IllegalArgumentException iea) {
                System.err.println("Ingreso un valor no númerico, intente de nuevo.");
            }

            switch (tipoAlimento) {
                case 1:

            }

        }
    }

    public static void menuBaguettes(Scanner sc) {
        int tipoPan = 0;
        System.out.println("Escoja el tipo de pan que prefiera. \n1. Pan blanco. \n2. Pan integral." +
                "\nPan de avena y miel");
        try {
            tipoPan = sc.nextInt();
        } catch (IllegalArgumentException iea) {
            System.err.println("Ingreso un valor no número, intente de nuevo.");
        }
        switch (tipoPan) {
            case 1:
            System.out.println("");
        }
    }

    public static void agregaIngredientes(Scanner sc, Alimento baguete){
        int ingrediente = 0;
        int polloTriple = 0;
        int pepperoniTriple = 0;
        int jamonTriple = 0;
        int lechugaTriple = 0;
        int jitomateTriple = 0;
        int cebollaTriple = 0;
        int mostazaTriple = 0;
        int catsupTriple = 0;
        int mayonesaTriple = 0;

        while(true){
            System.out.println("Seleccione el ingrediente que desea añadir:" +
                                "\n1. Pollo" +
                                "\n2. Pepperoni" +
                                "\n3. Jamón" +
                                "\n4. Lechuga" +
                                "\n5. Jitomate" +
                                "\n6. Cebolla" +
                                "\n7. Mostaza" +
                                "\n8. Catsup" +
                                "\n9. Mayonesa" +
                                "\n0. Terminar");
            switch(ingrediente){
                case 1:
                if(3 < polloTriple){
                    polloTriple++;
                    baguete = new Jamon(baguete);
                }

            }
        }
    }
}
