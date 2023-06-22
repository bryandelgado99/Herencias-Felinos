import Felidae.*;

import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Metodo para input
        Scanner entrada = new Scanner(System.in);

        //Instancias
        Gato minino1 = new Gato("Gato Siames", "Felis catus Siamesus Modernis", "Siameus", 2, 15);
        Lince minino2 = new Lince("Lince Boreal", "Lynx Lynx", "Lynx", 130, 30);
        Guepardo minino3 = new Guepardo("Guepardo sudafricano", "Acinonyx jubatus jubatus", "Acinonyx", 150, 60);
        Tigrillo minino4 = new Tigrillo("Tirica o Gatao tigre chico", "Leopardus guttulus", "Leopardus", 22, 42);
        Caracal minino5 = new Caracal("Caracal montes", "Caracal caracal", "Caracal", 30, 19);

        //Menu principal
        System.out.println("\n\t -----------> Bienvenido a Felinos Felices <-----------");
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("\t ---> 1. Gatos");
        System.out.println("\t ---> 2. Linces");
        System.out.println("\t ---> 3. Guepardo");
        System.out.println("\t ---> 4. Tigrillo");
        System.out.println("\t ---> 5. Caracal");
        System.out.println("--------------------------------------------------------------");

        //Switch selector
        String op;
        do {
            System.out.println("\nUsuario, por favor seleccione el tipo de felino a ingresar: ");
            int opt = entrada.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("\n---------> Ha seleccinado Gato");
                    minino1.imprimir_Datos();
                    minino1.imprimirDatos();
                    break;

                case 2:
                    System.out.println("\n---------> Ha seleccinado Lince");
                    minino2.imprimir_Datos();
                    minino2.imprimirDatos();
                    break;

                case 3:
                    System.out.println("---------> Ha seleccinado Guepardo");
                    minino3.imprimir_Datos();
                    minino3.imprimirDatos();
                    break;

                case 4:
                    System.out.println("---------> Ha seleccinado Tigrillo");
                    minino4.imprimir_Datos();
                    minino4.imprimirDatos();
                    break;

                case 5:
                    System.out.println("---------> Ha seleccinado Carcal");
                    minino5.imprimir_Datos();
                    minino5.imprimirDatos();
                    break;

                default:
                    System.out.println("\n-----> La especie de felino seleccionada no esta en el sistema!!!");
                    break;
            }

            System.out.println("\n\t------> Desea continuar el programa? (S - N) ");
            op = entrada.next();

        } while (Objects.equals(op, "S"));
    }
}
