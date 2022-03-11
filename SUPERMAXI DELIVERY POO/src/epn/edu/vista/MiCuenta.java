package epn.edu.vista;

import epn.edu.modelo.Cliente;

import java.util.ArrayList;


public class MiCuenta {

    public static void miCuenta() {
        System.out.println("#####################################");
        System.out.println("####       REGISTRO CLIENTE       ###");
        System.out.println("#####################################");

        Cliente.DatosCliente();
        Pedidos.pedidos();

    }


}