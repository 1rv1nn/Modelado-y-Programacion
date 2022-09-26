public class Test {
    public static void main(String[] args) {
        
        Alimento baguete = new BaguetteBlanco();

        baguete = new Jamon(baguete);
        baguete = new Jamon(baguete);

        System.out.println(baguete.getDescripcion() + "\nSu precio total es: $" + baguete.precio());
    }
}
