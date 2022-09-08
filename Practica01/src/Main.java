
public class Main {
	
	public static void main(String [] args) {
		CampoDeBatalla liderCheems = new CampoDeBatalla();

		Espectador a101 = new Espectador("a101", "Fulanos", "a");
		Espectador b202 = new Espectador("b202", "Menganos", "a");
		Espectador c303 = new Espectador("c303", "Zutanos", "a");
		Espectador d404 = new Espectador("d404", "Policarpios", "a");
		
		liderCheems.setMensaje("Hola");
		
		liderCheems.registrar(a101);
		liderCheems.registrar(b202);
		liderCheems.registrar(c303);
		liderCheems.registrar(d404);
		
		liderCheems.notificar();
	}
	
	

}
