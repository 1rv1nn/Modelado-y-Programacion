import java.util.Scanner;

public class Prueba{
	public static void main(String[] args){
		Robot pb = new Robot();

		Scanner sc = new Scanner(System.in);
		int opcion;

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
						break;

					case 4:
						pb.cocinar();
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