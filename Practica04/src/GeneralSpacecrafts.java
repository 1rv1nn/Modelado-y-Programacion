import java.util.Scanner;

/**
 * Clase principal de main.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class GeneralSpacecrafts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IngenierosGS naveIndividualCombate = new IngenierosGS()
                .setSistemaDePropulcion(new ViajeIntercontinental())
                .setBlindaje(new Reforzado())
                .setCabina(new UnPiloto())
                .setArmas(new MisilesPlasma());
        IngenierosGS naveMilitarTransporte = new IngenierosGS()
                .setSistemaDePropulcion(new ViajeIntergalactico())
                .setBlindaje(new Simple())
                .setCabina(new Ejercito())
                .setArmas(new LaserSimple());
        IngenierosGS baseEspacialGuerra = new IngenierosGS()
                .setSistemaDePropulcion(new ViajeInterplanetario())
                .setBlindaje(new Fortaleza())
                .setCabina(new Tripulacion())
                .setArmas(new LaserDestructorPlanetario());

        IngenierosGS naveGenerica = new IngenierosGS();
        NaveEspacial naveIndividual = new NaveEspacial(naveIndividualCombate);
        NaveEspacial naveTransporte = new NaveEspacial(naveMilitarTransporte);
        NaveEspacial baseEspacial = new NaveEspacial(baseEspacialGuerra);
        NaveEspacial naveVendida;

        int x = 0;
        int sistema = 0;
        int blin = 0;
        int cab = 0;
        int arms = 0;
        do {
            System.out.println("Bienvenido Imperio Galactico. Ingrese su presupuesto.");
            int presupuesto = 0;
            try {
                presupuesto = sc.nextInt();
            } catch (IllegalArgumentException iea) {
                System.err.println("Puso un carácter no númerico repita el proceso.");
            }
            do {
                System.out.println("Seleccione la categoría del componente" +
                        "\n1. SISTEMAS DE PROPULCIÓN" +
                        "\n2. BLINDAJE" +
                        "\n3. CABINA" +
                        "\n4. ARMAS");
                x = sc.nextInt();
                switch (x) {
                    case 1:
                        if (0 < sistema) {
                            System.err.println("Ya ha seleccionado un sistema de propulsión previamente.");
                            continue;
                        }
                        System.out.println("Seleccione el componente");
                        System.out.println("\n1." + naveIndividualCombate.sistemaDePropulacion.getDescripcion() + // viaje intercontinental
                                "\n2." + baseEspacialGuerra.sistemaDePropulacion.getDescripcion() + // viaje interplanetario
                                "\n3." + naveMilitarTransporte.sistemaDePropulacion.getDescripcion()); // viaje intergalactico
                        x = sc.nextInt();
                        switch (x) {
                            case 1:
                                naveGenerica.setSistemaDePropulcion(new ViajeInterplanetario());
                                break;
                            case 2:
                                naveGenerica.setSistemaDePropulcion(new ViajeIntercontinental());
                                break;
                            case 3:
                                naveGenerica.setSistemaDePropulcion(new ViajeIntergalactico());
                                break;
                            default:
                                System.err.println("Ingresaste un valor inválido.");
                                break;
                        }
                        sistema++;
                        break;
                    case 2:
                        if (0 < blin) {
                            System.err.println("Ya ha seleccionado un blindaje previamente.");
                            continue;
                        }
                        System.out.println("Seleccione el componente");
                        System.out.println("\n1." + naveMilitarTransporte.blindaje.getDescripcion() + // blindaje simple
                                "\n2." + naveIndividualCombate.blindaje.getDescripcion() + // blindaje reforzado
                                "\n3." + baseEspacialGuerra.blindaje.getDescripcion()); // blindaje fortaleza
                        x = sc.nextInt();
                        switch (x) {
                            case 1:
                                naveGenerica.setBlindaje(new Simple());
                                break;
                            case 2:
                                naveGenerica.setBlindaje(new Reforzado());
                                break;
                            case 3:
                                naveGenerica.setBlindaje(new Fortaleza());
                                break;
                            default:
                                System.err.println("Ingresaste un valor inválido.");
                                break;
                        }
                        blin++;
                        break;
                    case 3:
                        if (0 < cab) {
                            System.err.println("Ya ha seleccionado una cabina previamente.");
                            continue;
                        }
                        System.out.println("Seleccione el componente");
                        System.out.println("\n1." + naveIndividualCombate.cabina.getDescripcion() + // Cabina un piloto
                                "\n2." + baseEspacialGuerra.cabina.getDescripcion() + // Cabina tripulación
                                "\n3." + naveMilitarTransporte.cabina.getDescripcion()); // Cabina ejército
                        x = sc.nextInt();
                        switch (x) {
                            case 1:
                                naveGenerica.setCabina(new UnPiloto());
                                break;
                            case 2:
                                naveGenerica.setCabina(new Tripulacion());
                                break;
                            case 3:
                                naveGenerica.setCabina(new Ejercito());
                                break;
                            default:
                                System.err.println("Ingresaste un valor inválido.");
                                break;
                        }
                        cab++;
                        break;
                    case 4:
                        if (0 < arms) {
                            System.err.println("Ya ha seleccionado una cabina previamente.");
                            continue;
                        }
                        System.out.println("Seleccione el componente");
                        System.out.println("\n1." + naveMilitarTransporte.armas.getDescripcion() + // arma laser simple
                                "\n2." + naveIndividualCombate.armas.getDescripcion() + // armas misiles de plasma
                                "\n3." + baseEspacialGuerra.armas.getDescripcion()); // arma laser destructor de planetas
                        x = sc.nextInt();
                        switch (x) {
                            case 1:
                                naveGenerica.setArmas(new LaserSimple());
                                break;
                            case 2:
                                naveGenerica.setArmas(new MisilesPlasma());
                                break;
                            case 3:
                                naveGenerica.setArmas(new LaserDestructorPlanetario());
                                break;
                            default:
                                System.err.println("Ingresaste un valor inválido.");
                                break;
                        }
                        arms++;
                        break;
                    default:
                        System.err.println("Ingreso un valor inválido");
                        x=100;
                        continue;
                }
                System.out.println("¿Desea agregar otro componente?\n1. Si\t0. No");
                int continuar = sc.nextInt();
                if (continuar == 1) {
                    continue;
                }
                naveVendida = new NaveEspacial(naveGenerica);
                if (naveVendida.getPrecio() <= presupuesto) {
                    System.out.println(
                            "Felicidades por la adquisición de su nueva nave, aquí están las especificaciones:\n"
                                    + naveVendida);
                    System.out.println("¿Quiere volver a inicier el proceso? 1. Si 0. No");
                    continuar = sc.nextInt();
                    if (continuar == 0) {
                        sc.close();
                        System.exit(0);
                    }
                    sistema = 0;
                    blin = 0;
                    cab = 0;
                    arms = 0;
                    break;
                }
                System.out.println(
                        "No tiene los suficientes fondos para comprar esta nave, si lo desea puede ver nuestro catalogo de naves prediseñadas o salir.\n1. Ver catalogo\t 0. Salir.");
                continuar = sc.nextInt();
                if (continuar == 0) {
                    sc.close();
                    System.exit(0);
                }
                do {
                    System.out.println("\nIngrese el número de la nave de su preferencia" +
                            "\n1." + naveIndividual +
                            "\n2." + naveTransporte +
                            "\n3." + baseEspacial);
                    x = sc.nextInt();
                    switch (x) {
                        case 1:
                            if (naveIndividual.getPrecio() <= presupuesto) {
                                System.out.println(
                                        "Felicidades por la adquisición de su nueva nave, aquí están las especificaciones:\n"
                                                + naveIndividual);
                                continue;
                            }
                            System.out.println(
                                    "No tiene los suficientes fondos para comprar esta nave, si lo desea puede ver nuestro catalogo de naves prediseñadas o salir.\n1. Ver catalogo\t 0. Salir.");
                            continuar = sc.nextInt();
                            if (continuar == 0) {
                                sc.close();
                                System.exit(0);
                            }
                            break;
                        case 2:
                            if (naveIndividual.getPrecio() <= presupuesto) {
                                System.out.println(
                                        "Felicidades por la adquisición de su nueva nave, aquí están las especificaciones:\n"
                                                + naveIndividual);
                                continue;
                            }
                            System.out.println(
                                    "No tiene los suficientes fondos para comprar esta nave, si lo desea puede ver nuestro catalogo de naves prediseñadas o salir.\n1. Ver catalogo\t 0. Salir.");
                            continuar = sc.nextInt();
                            if (continuar == 0) {
                                sc.close();
                                System.exit(0);
                            }
                            break;
                        case 3:
                            if (baseEspacial.getPrecio() <= presupuesto) {
                                System.out.println(
                                        "Felicidades por la adquisición de su nueva nave, aquí están las especificaciones:\n"
                                                + baseEspacial);
                                continue;
                            }
                            System.out.println(
                                    "No tiene los suficientes fondos para comprar esta nave, si lo desea puede ver nuestro catalogo de naves prediseñadas o salir.\n1. Ver catalogo\t 0. Salir.");
                            continuar = sc.nextInt();
                            if (continuar == 0) {
                                sc.close();
                                System.exit(0);
                            }
                            break;
                        default:
                            System.err.println("ingreso un valor inválido.");
                            x = 100;
                            continue;
                    }
                } while (x != -1);
            } while (x != 0);
        } while (true);
    }
}