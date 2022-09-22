import java.util.Scanner;

public class Prueba{
	public static void main(String[] args){
		Robot pb = new Robot();

		Scanner sc = new Scanner(System.in);
		int opcion;
		int id = 0;
		MenuEspecial menuEspecial = new MenuEspecial();
		MenuGeneral menuGeneral = new MenuGeneral();
		MenuMutable menuMutable = new MenuMutable();
		Menu menu = new Menu(menuGeneral, menuMutable, menuEspecial);

		System.out.println("***BIENVENIDO A LA CONSOLA DE WALLE.***"
						+ "\nPor favor elige la opcion que deseas ejecutar.");

		do{
			System.out.println(
				"1.- Activar.\n" +
				"2.- Caminar.\n" + 
				"3.- Tomar una Orden.\n" + 
				"4.- Cocinar.\n" +
				"5.- Suspender.\n" +
				"0.- Terminar simulacion.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige la opcion VALIDA "
							+ "que deseas ejecutar.\n" + 
							"1.- Activar.\n" +
							"2.- Caminar.\n" + 
							"3.- Tomar una orden.\n" + 
							"4.- Cocinar.\n" +
							"5.- Suspender.\n" +
							"0.- Terminar simulacion.\n");
					}
				}

				switch(opcion){
					case 1:
						pb.activar();
						break;

					case 2:
						pb.caminar();
						break;

					case 3:
						pb.tomarOrden();
						menu.imprimeMenu();
						System.out.println("Ingrese el ID de la hamburguesa que desea ordenar.");
						try {
							id = Integer.parseInt(sc.nextLine());
						} catch (Exception e) {
							System.err.println("Ingreso un valor no númerico, intente de nuevo.");	
						}
						break;

					case 4:
						pb.cocinar();
						if(0 < id && id < 4){
							for (Hamburguesa hamburguesa : menuGeneral.getMenu()) {
								if(hamburguesa.id == id){
									hamburguesa.prepararAnvorguesa();
									break;
								}
							}
						} else if(3 < id && id < 7){
							for (Hamburguesa hamburguesa : menuMutable.getMenu()) {
								if(hamburguesa.id == id){
									hamburguesa.prepararAnvorguesa();
									break;
								}
							}
						} else if(6 < id && id < 10){
							while(menuEspecial.getIterator().hasNext()){
								Hamburguesa nueva = menuEspecial.getIterator().next();
								if(nueva.id == id){
									nueva.prepararAnvorguesa();
									break;
								}
							}
						}
						break;
					case 5:
						pb.suspender();
						break;

					case 0:
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);

	}
}