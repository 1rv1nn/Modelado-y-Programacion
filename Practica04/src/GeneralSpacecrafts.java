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
        System.out.println("Bienvenido Imperio Galactico. Ingrese su presupuesto.");
        int presupuesto = 0;
        try {
            presupuesto = sc.nextInt();
        } catch (IllegalArgumentException iea) {
            System.err.println("Puso un carácter no númerico repita el proceso.");
        }
        int x = 0;
        int sistema = 0;
        int blin = 0;
        int cab = 0;
        int arms = 0;
        do {

            System.out.println("Seleccione el componente que desea agregar prefiera" +
                    "\n\t\t\t*** SISTEMAS DE PROPULCIÓN ***" +
                    "\n2." + naveIndividualCombate.sistemaDePropulacion.getDescripcion() + // viaje intercontinental
                    "\n3." + baseEspacialGuerra.sistemaDePropulacion.getDescripcion() + // viaje interplanetario
                    "\n1." + naveMilitarTransporte.sistemaDePropulacion.getDescripcion() + // viaje intergalactico
                    "\n\t\t\t*** BLINDAJE ***" +
                    "\n4." + naveMilitarTransporte.blindaje.getDescripcion() + // blindaje simple
                    "\n5." + naveIndividualCombate.blindaje.getDescripcion() + // blindaje reforzado
                    "\n6." + baseEspacialGuerra.blindaje.getDescripcion() + // blindaje fortaleza
                    "\n\t\t\t*** CABINA ***" +
                    "\n7." + naveIndividualCombate.cabina.getDescripcion() + // cabina 1 piloto
                    "\n8." + baseEspacialGuerra.cabina.getDescripcion() + // cabina para tripulación
                    "\n9." + naveMilitarTransporte.cabina.getDescripcion() + // cabina para ejército
                    "\n\t\t\t*** ARMAS ***" +
                    "\n10." + naveMilitarTransporte.armas.getDescripcion() + // arma laser simple
                    "\n11." + naveIndividualCombate.armas.getDescripcion() + // armas misiles de plasma
                    "\n12." + baseEspacialGuerra.armas.getDescripcion() // arma lase destructor de planetas
            );
            x = sc.nextInt();
            switch (x) {
                case 1:
                    if (0 < sistema) {
                        System.err.println("Ya ha seleccionado un sistema de propulsión previamente.");
                        continue;
                    }
                    naveGenerica.setSistemaDePropulcion(new ViajeIntercontinental());
                    sistema++;
                    break;
                case 2:
                    if (0 < sistema) {
                        System.err.println("Ya ha seleccionado un sistema de propulsión previamente.");
                        continue;
                    }
                    naveGenerica.setSistemaDePropulcion(new ViajeInterplanetario());
                    sistema++;
                    break;
                case 3:
                    if (0 < sistema) {
                        System.err.println("Ya ha seleccionado un sistema de propulsión previamente.");
                        continue;
                    }
                    naveGenerica.setSistemaDePropulcion(new ViajeIntergalactico());
                    sistema++;
                    break;
                case 4:
                    if (0 < blin) {
                        System.err.println("Ya ha seleccionado un blindaje previamente.");
                        continue;
                    }
                    naveGenerica.setBlindaje(new Simple());
                    blin++;
                    break;
                case 5:
                    if (0 < blin) {
                        System.err.println("Ya ha seleccionado un blindaje previamente.");
                        continue;
                    }
                    naveGenerica.setBlindaje(new Reforzado());
                    blin++;
                    break;
                case 6:
                    if (0 < blin) {
                        System.err.println("Ya ha seleccionado un blindaje previamente.");
                        continue;
                    }
                    naveGenerica.setBlindaje(new Fortaleza());
                    blin++;
                    break;
                case 7:
                    if (0 < cab) {
                        System.err.println("Ya ha seleccionado una cabina previamente.");
                        continue;
                    }
                    naveGenerica.setCabina(new UnPiloto());
                    cab++;
                    break;
                case 8:
                    if (0 < cab) {
                        System.err.println("Ya ha seleccionado una cabina previamente.");
                        continue;
                    }
                    naveGenerica.setCabina(new Tripulacion());
                    cab++;
                    break;
                case 9:
                    if (0 < cab) {
                        System.err.println("Ya ha seleccionado una cabina previamente.");
                        continue;
                    }
                    naveGenerica.setCabina(new Ejercito());
                    cab++;
                    break;
                case 10:
                    if (0 < arms) {
                        System.err.println("Ya ha seleccionado un sistema de armas previamente.");
                        continue;
                    }
                    naveGenerica.setArmas(new LaserSimple());
                    arms++;
                    break;
                case 11:
                    if (0 < arms) {
                        System.err.println("Ya ha seleccionado un sistema de armas previamente.");
                        continue;
                    }
                    naveGenerica.setArmas(new MisilesPlasma());
                    arms++;
                    break;
                case 12:
                    if (0 < arms) {
                        System.err.println("Ya ha seleccionado un sistema de armas previamente.");
                        continue;
                    }
                    naveGenerica.setArmas(new LaserDestructorPlanetario());
                    arms++;
                    break;
                default:
                    System.err.println("Ingreso un valor inválido");
            }
            System.out.println("¿Desea agregar otro componente?\n1. Si\t0. No");
            int continuar = sc.nextInt();
            if (continuar == 1) {
                continue;
            }

            naveVendida = new NaveEspacial(naveGenerica);
            if (naveVendida.getPrecio() <= presupuesto) {
                System.out.println("Felicidades por la adquisición de su nueva nave, aquí están las especificaciones:\n"
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
                continue;
            }
            System.out.println(
                    "No tiene los suficientes fondos para comprar esta nave, si lo desea puede ver nuestro catalogo de naves prediseñadas o salir.\n1. Ver catalogo\t 0. Salir.");
            continuar = sc.nextInt();
            if (continuar == 0) {
                sc.close();
                System.exit(0);
            }
            do{
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
            }
        }while(x != -1);
        } while (x != 0);
    }
}
