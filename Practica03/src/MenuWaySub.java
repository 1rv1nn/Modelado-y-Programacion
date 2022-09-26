import java.util.Scanner;

public class MenuWaySub {

    public static void imprimeMenuPrincipal(){
        int tipoAlimento = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t\t*** Bienvenido a WaySub ***" +
                    "\nEliga alguno de nuestro siguientes productos:" +
                    "\n1. Baguette." +
                    "\n2. Pizza." +
                    "\n0. Salir.");
            try {
                tipoAlimento = sc.nextInt();
            } catch (IllegalArgumentException iea) {
                System.err.println("Ingreso un valor no númerico. Intente de nuevo.");
            }
            switch (tipoAlimento) {
                case 1:
                    agregaIngredientes(sc, menuBaguettes(sc));    
                    break;
                case 2:
                    menuPizaa(sc);
                    break;
                case 0:
                    System.out.println("Gracias por comprar. ¡Vuelva pronto!");
                    System.exit(0);
                default:
                    System.err.println("Ha ingresado un dígito distinto a los establecidos. Intente de nuevo.");
            }
        }
    }

    public static Alimento menuBaguettes(Scanner sc) {
        int tipoPan = 0;
        while(true){
            System.out.println("\nEscoja el tipo de pan que prefiera. \n1. Pan blanco. \n2. Pan integral." +
                    "\n3. Pan de avena y miel.");
            try {
                tipoPan = sc.nextInt();
            } catch (IllegalArgumentException iea) {
                System.err.println("Ingreso un valor no númerico. Intente de nuevo.");
            }
            switch (tipoPan) {
                case 1:
                    return new BaguetteBlanco();
                case 2:
                    return new BaguetteAvenaMiel();
                case 3:
                    return new BaguetteAvenaMiel();
                default:
                    System.err.println("Ha ingresado un dígito distinto a los establecidos. Intente de nuevo.");
                    break;
            }
        }
    }

    public static void menuPizaa(Scanner sc){
        int tipoPizza = 0;
        AdaptadorPizza pizzaWaySub;

        do {
            System.out.println("\nSelecciona la pizza de su preferencia. \n1. Pizza hawaiana. \n2. Pizza de Pepperoni" + 
                                "\n3. Pizza mexicana" +
                                "\n4. Pizza vegetariana" +
                                "\n5. Pizza Honolulu");
            try {
                tipoPizza = sc.nextInt();
            } catch (IllegalArgumentException iae) {
                System.err.println("Ingreso un valor no númerico. Intente de nuevo.");
            }

            switch(tipoPizza){
                case 1:
                    Pizza hawaiana = new PizzaHawaina();
                    pizzaWaySub = new AdaptadorPizza(hawaiana);
                    System.out.println("\n" + pizzaWaySub.getDescripcion() + "\n--------------------------------------" + 
                                        "\nSu precio total es: \t\t$" + pizzaWaySub.precio());
                    break;
                case 2:
                    Pizza pepperoni = new PizzaHawaina();
                    pizzaWaySub = new AdaptadorPizza(pepperoni);
                    System.out.println("\n" + pizzaWaySub.getDescripcion() + "\n--------------------------------------" + 
                                        "\nSu precio total es: \t\t$" + pizzaWaySub.precio());
                    break;
                case 3:
                    Pizza mexicana = new PizzaHawaina();
                    pizzaWaySub = new AdaptadorPizza(mexicana);
                    System.out.println("\n" + pizzaWaySub.getDescripcion() + "\n--------------------------------------" + 
                                        "\nSu precio total es: \t\t$" + pizzaWaySub.precio());
                    break;
                case 4:
                    Pizza vegetariana = new PizzaHawaina();
                    pizzaWaySub = new AdaptadorPizza(vegetariana);
                    System.out.println("\n" + pizzaWaySub.getDescripcion() + "\n--------------------------------------" +
                                        "\nSu precio total es: \t\t$" + pizzaWaySub.precio());
                    break;
                case 5:
                    Pizza honolulu = new PizzaHawaina();
                    pizzaWaySub = new AdaptadorPizza(honolulu);
                    System.out.println("\n" + pizzaWaySub.getDescripcion() + "\n--------------------------------------" + 
                                        "\nSu precio total es: \t\t$" + pizzaWaySub.precio());
                    break;
                default:
                    System.err.println("Ha ingresado un dígito distinto a los establecidos. Intente de nuevo.");
                    break;
            }
        } while (tipoPizza < 0 || 6 < tipoPizza);
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

        do{
            System.out.println("\nSeleccione el ingrediente que desea añadir:" +
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
            try {
                ingrediente = sc.nextInt();
            } catch (Exception e) {
                System.err.println("Ingreso un valor no númerico. Intente de nuevo.");
            }
            switch(ingrediente){
                case 1:
                    if(polloTriple < 3){
                        polloTriple++;
                        baguete = new Pollo(baguete);
                    } else{
                        System.out.println("\nYa ha agregado 3 veces el mismo ingrediente, ya no lo puedo volver a seleccionar.");
                        continue;
                    }
                    break;
                case 2:
                    if(pepperoniTriple < 3){
                        pepperoniTriple++;
                        baguete = new Pollo(baguete);
                    } else{
                        System.out.println("\nYa ha agregado 3 veces el mismo ingrediente, ya no lo puedo volver a seleccionar.");
                        continue;
                    }
                    break;
                case 3:
                    if(jamonTriple < 3){
                        jamonTriple++;
                        baguete = new Jamon(baguete);
                    } else{
                        System.out.println("\nYa ha agregado 3 veces el mismo ingrediente, ya no lo puedo volver a seleccionar.");
                        continue;
                    }
                    break;
                case 4:
                    if(lechugaTriple < 3){
                        lechugaTriple++;
                        baguete = new Lechuga(baguete);
                    } else{
                        System.out.println("\nYa ha agregado 3 veces el mismo ingrediente, ya no lo puedo volver a seleccionar.");
                        continue;
                    }
                    break;
                case 5:
                    if(jitomateTriple < 3){
                        jitomateTriple++;
                        baguete = new Pollo(baguete);
                    } else{
                        System.out.println("\nYa ha agregado 3 veces el mismo ingrediente, ya no lo puedo volver a seleccionar.");
                        continue;
                    }
                    break;
                case 6:
                    if(cebollaTriple < 3){
                        cebollaTriple++;
                        baguete = new Cebolla(baguete);
                    } else{
                        System.out.println("\nYa ha agregado 3 veces el mismo ingrediente, ya no lo puedo volver a seleccionar.");
                        continue;
                    }
                    break;
                case 7:
                    if(mostazaTriple < 3){
                        mostazaTriple++;
                        baguete = new Mostaza(baguete);
                    } else{
                        System.out.println("\nYa ha agregado 3 veces el mismo ingrediente, ya no lo puedo volver a seleccionar.");
                        continue;
                    }
                    break;
                case 8:
                    if(catsupTriple < 3){
                        catsupTriple++;
                        baguete = new Catsup(baguete);
                    } else{
                        System.out.println("\nYa ha agregado 3 veces el mismo ingrediente, ya no lo puedo volver a seleccionar.");
                        continue;
                    }
                    break;
                case 9:
                    if(mayonesaTriple < 3){
                        mayonesaTriple++;
                        baguete = new Pollo(baguete);
                    } else{
                        System.out.println("\nYa ha agregado 3 veces el mismo ingrediente, ya no lo puedo volver a seleccionar.");
                        continue;
                    }
                    break;
                case 0:
                System.out.println("\n" + baguete.getDescripcion() + "\n--------------------------------------" + 
                                    "\nSu precio total es: \t\t$" + baguete.precio());
                    break;
                default:
                    System.err.println("Ha ingresado un dígito distinto a los establecidos. Intente de nuevo.");
            }
        }while(ingrediente != 0);
    }
}
