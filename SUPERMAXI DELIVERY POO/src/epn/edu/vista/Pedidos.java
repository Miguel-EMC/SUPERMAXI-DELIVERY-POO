package epn.edu.vista;

import java.util.Scanner;

public class Pedidos {
    public static void pedidos(){

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("#####################################");
            System.out.println("####       REALIZAR PEDIDO        ###");
            System.out.println("#####################################");
            System.out.println("1. Frutas y Verduras");
            System.out.println("2. Despensa y Productos secos");
            System.out.println("3. Snacks y Confiteria");
            System.out.println("4. Lacteos");
            System.out.println("5. Bebidas");
            System.out.println("6. Limpieza Hogar");
            System.out.println("7. Pollo o Carne");
            System.out.println("8. Seccion Mascotas");
            System.out.println("0. Regresar ");
            opc = sc.nextInt();
            switch (opc){

                case 1:
                    System.out.println("#####################################");
                    System.out.println("####     FRUTAS Y VERDURAS        ###");
                    System.out.println("#####################################");
                    Pedidos01.FrutasyVerduras();

                    break;
                case 2:
                    System.out.println("#####################################");
                    System.out.println("####  DESPENSA Y PRODUCTOS SECOS  ###");
                    System.out.println("#####################################");
                    Pedidos01.DespensayProductosSecos();
                    break;
                case 3:
                    System.out.println("#####################################");
                    System.out.println("####      SNACKS Y CONFITERIA     ###");
                    System.out.println("#####################################");
                    Pedidos01.SnacksyConfiterias();
                    break;
                case 4:
                    System.out.println("#####################################");
                    System.out.println("####            LACTEOS           ###");
                    System.out.println("#####################################");
                    Pedidos01.Lacteos();
                    break;
                case 5:
                    System.out.println("#####################################");
                    System.out.println("####           BEBIDAS            ###");
                    System.out.println("#####################################");
                    Pedidos01.Bebidas();
                    break;
                case 6:
                    System.out.println("#####################################");
                    System.out.println("####       LIMPIEZA HOGAR         ###");
                    System.out.println("#####################################");
                    Pedidos01.LimpiezaHogar();
                    break;
                case 7:
                    System.out.println("#####################################");
                    System.out.println("####      POLLO Y CARNES          ###");
                    System.out.println("#####################################");
                    Pedidos01.PolloyCarne();
                    break;
                case 8:
                    System.out.println("#####################################");
                    System.out.println("####       SECCIO MASCOTA         ###");
                    System.out.println("#####################################");
                    Pedidos01.SeccionMacota();
                    break;
            }
        }while (opc != 0);
    }
}
