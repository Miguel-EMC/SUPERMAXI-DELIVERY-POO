package epn.edu.vista;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import epn.edu.modelo.Cliente;
import epn.edu.modelo.Producto;
import epn.edu.modelo.Repartidor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MisPedidos {
    public static void misPedidos() throws IOException {

        ArrayList<Producto> pedido = new ArrayList<Producto>();
        Pedidos01 pedidos = new Pedidos01();
        Producto productoSeleccionado = new Producto();
        Cliente cliente = new Cliente();
        Repartidor repartidor = new Repartidor();
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("#####################################");
            System.out.println("####         MIS PEDIDOS          ###");
            System.out.println("#####################################");
            System.out.println("1. Mostrar Compra");
            System.out.println("2. Factura");
            System.out.println("0. Regresar");
            System.out.println("Ingrese una opccion: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    //En esta opccion se podra apreciar los porductos comprados por el Usuario
                    //Tambien se podra realizar la opccion de realizar el envio y el tipo de pago.
                    File archivo;
                    archivo = new File("C:\\archivo.txt");
                 try {
                    if (archivo.createNewFile()) {

                        System.out.println("#####################################");
                        System.out.println("####      MOSTRAR COMPRA          ###");
                        System.out.println("#####################################");
                        Pedidos01.Mostrar();
                    }} catch (IOException e) {
                     System.out.println("No se ha podido crear el archivo");
                 }
                    System.out.println("Ingrese la distancia en Km del supermaxi mas cercano a su HOGAR: ");
                    double km = sc.nextDouble();

                    System.out.println("Insegre el 1 para realizar la compra o 0 para cancelar la compra ");
                    int result = sc.nextInt();
                    if (result == 1){
                        for (int i=0;  i <= cliente.pagarCompra(km) ; i++ ){
                            System.out.println("::::::::::::::::::::::::::::");
                            System.out.println("REALIZANDO COMPRA....................!");
                            System.out.println("::::::::::::::::::::::::::::");
                        }

                        System.out.println("---------- SU COMPRA FUE ENVIADA CON EXITO ----------- ");
                        System.out.println("::::: REVISE EL TOTAL A PAGAR EN LA OPCION FACTURA :::::::");
                    }
                    if( result ==0 ) {

                        for (int i=0;  i <= cliente.cancelarCompra(km) ; i++ ){
                            System.out.println("::::::::::::::::::::::::::::");
                            System.out.println("CANCELANDO COMPRA....................!");
                            System.out.println("::::::::::::::::::::::::::::");
                        }
                        System.out.println("------- SU COMPRA FUE CANCELADA -----------------");
                    }

                    break;
                case 2:
                    System.out.println("::::::::::::::::::::::::::::::::::::::::");
                    System.out.println(":::::::        TIPO DE PAGO     ::::::::");
                    System.out.println("1. Tarjeta de Credito ");
                    System.out.println("2. Efectivo ");
                    int opc1 = sc.nextInt();
                    switch (opc1)
                    {
                        case 1:
                            System.out.println("#####################################");
                            System.out.println("####          FACTURA             ###");
                            System.out.println("#####################################");
                            System.out.println(":::: DATOS DEL CLIENTE :::::::");
                            Cliente.MostrarCliente();
                            System.out.println(":::::: ORDEN DE COMPRA ::::::");
                            Pedidos01.Mostrar();
                            System.out.println("Tipo de pago Tarjeta de credio con descuento del 12% ");
                            double total;
                            total = Pedidos01.MostrarSubtotal();
                            System.out.println("Total Sin Descuento: "+total);
                            System.out.println("Total Incluido Descuento: "+total*0.12);
                            System.out.println("Costo del envio : $ 3.00");
                            System.out.println("Total a pagar inluido el envio: "+(total*0.12+3));
                            System.out.println(repartidor.enviar());
                            break;
                        case 2:
                            System.out.println("#####################################");
                            System.out.println("####          FACTURA             ###");
                            System.out.println("#####################################");
                            System.out.println(":::: DATOS DEL CLIENTE :::::::");
                            Cliente.MostrarCliente();
                            System.out.println(":::::: ORDEN DE COMPRA ::::::");
                            Pedidos01.Mostrar();
                            System.out.println("::::::      PAGO       ::::::");
                            System.out.println("Tipo de pago Tarjeta de credio con descuento del 15% ");
                            double total1=0;
                            total1 = Pedidos01.MostrarSubtotal();
                            System.out.println("Total Sin Descuento: "+total1);
                            System.out.println("Total Incluido Descuento: "+ total1*0.10);
                            System.out.println("Costo del envio : $ 3.00");
                            System.out.println("Total a pagar inluido el envio: "+(total1*0.10+3));
                            System.out.println(repartidor.enviar());
                            break;
                    }
                    break;
                default:
                    System.out.println("Ingrese una opccion correcta.........!\n\n");
                    break;
            }
        } while (opc != 0);
    }

    public void arregloRecibido(ArrayList<Producto> lista) {
        ArrayList<Producto> arregloRecibido = new ArrayList<>();
        for (int i = 0; i < arregloRecibido.toArray().length; i++) {
            //arregloRecibido.toArray()[i] = lista.get(i);
            arregloRecibido.set(i, lista.get(i));
        }
        for (int i = 0; i < arregloRecibido.toArray().length; i++) {
            System.out.println("recibido" + arregloRecibido.get(i));
        }
    }
}
