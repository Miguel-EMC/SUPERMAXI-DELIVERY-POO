package epn.edu.vista;

import java.io.IOException;
import java.util.Scanner;

public class MenuCliente {
    public static void menuCliente() throws IOException {

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("#####################################");
            System.out.println("####       SUPERMAXI DELIVERY     ###");
            System.out.println("#####################################");
            System.out.println("1. Mi Cuenta");
            System.out.println("2. Mis Pedidos");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opccion: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    MiCuenta.miCuenta();
                    break;
                case 2:
                    MisPedidos.misPedidos();
                    break;
                case 3:
                    System.out.println(":::: GRACIAS VUELVA PRONTO ::: ");
                    break;
                default:
                    System.out.println("Ingrese una opccion correcta.........!\n\n");
                    break;
            }
        }while (opc != 3);
    }
}
