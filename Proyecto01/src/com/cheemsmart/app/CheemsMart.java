package com.cheemsmart.app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.cheemsmart.facade.StoreFacade;

/**
 * Clase main que implementa la tienda CheemsMart.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class CheemsMart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StoreFacade cliente = new StoreFacade();
		int opcion = 0;
		while (true) {
			while (true) {
				System.out.println("User: ");
				String usuario = sc.nextLine();
				System.out.println("Password: ");
				String password = sc.nextLine();
				try {
					cliente.ingresar(usuario, password);
					break;
				} catch (Exception e) {
					System.err.println(e.getMessage());
					System.out.println();
				}
			}
			do {
				cliente.menuPrincipal();
				try {
					opcion = Integer.parseInt(sc.nextLine());
					switch (opcion) {
					case 1:
						cliente.mostrarMenu();
						break;
					case 2:
						int option = 0;
						while (option != 3) {
							cliente.opciones();
							try {
								option = sc.nextInt();
							} catch (InputMismatchException ime) {
								cliente.error();
								sc.nextLine();
								continue;
							}
							switch (option) {
							case 1:
								while (true) {
									cliente.request(option);
									try {
										int codigo = sc.nextInt();
										cliente.agregarProducto(codigo);
										break;
									} catch (InputMismatchException ime) {
										cliente.error();
										System.out.println();
										sc.nextLine();
										continue;
									} catch (NoSuchElementException nsee) {
										System.err.println(nsee.getMessage());
										System.out.println();
										sc.nextLine();
										continue;
									}
								}
								break;
							case 2:
								while (true) {
									cliente.request(option);
									try {
										int cuenta = sc.nextInt();
										cliente.terminarCompra(cuenta);
										option = 3;
										break;
									} catch (InputMismatchException ime) {
										cliente.cuentaIncorrecta();
									}
								}
								break;
							case 3:
								cliente.request(option);
								break;
							default:
								cliente.error();
								option = -1;
							}
							sc.nextLine();
						}
						break;
					case 3:
						cliente.cerrarSesion();
						opcion = 0;
						break;
					case 4:
						cliente.cerrarSesion();
						sc.close();
						System.exit(0);
					default:
						cliente.error();
						System.out.println();
						opcion = -1;
					}
				} catch (Exception e) {
					cliente.error();
					System.out.println();
					opcion = -1;
				}
			} while (opcion != 0);
		}
	}
}
