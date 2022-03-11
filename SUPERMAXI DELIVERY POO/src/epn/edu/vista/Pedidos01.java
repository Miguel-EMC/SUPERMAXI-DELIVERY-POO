package epn.edu.vista;

import epn.edu.modelo.Producto;

import java.util.ArrayList;

import java.util.Scanner;

public class Pedidos01 {

    public static MisPedidos arreglo = new MisPedidos();
    public static ArrayList<Producto> pedido = new ArrayList<Producto>();
    static Producto productoSeleccionado = new Producto();
    static ArrayList<Producto> frutasyVerduras = Producto.FrutasYverdurasList();
    static ArrayList<Producto> despensayProductosSecos = Producto.DespensayProductosSecosList();
    static ArrayList<Producto> snacksyConfiterias = Producto.SnacksyConfiteriaList();
    static ArrayList<Producto> lacteos = Producto.LacteosList();
    static ArrayList<Producto> bebidas = Producto.BebidasList();
    static ArrayList<Producto> liempizaHogar = Producto.LimpiezaHogarList();
    static ArrayList<Producto> polloyCarne = Producto.PolloyCarneList();
    static ArrayList<Producto> seccionMascota = Producto.SeccionMacotaList();

    public static void FrutasyVerduras(){
        Scanner sc = new Scanner(System.in);
        int opc;
            System.out.println("\nID"+"\t\t\t PRODUCTO"+"\t\t\tPRECIO");
        for (int i = 0; i<frutasyVerduras.size(); i++){
            System.out.println(i + 1 + "-- " + frutasyVerduras.get(i).getNombreProducto() + " :::::: PRECIO :::: "+" $"+frutasyVerduras.get(i).getPrecio());
        }
        System.out.println("Ingrese el ID de la categoria de Frutas y Verduras");
        opc = sc.nextInt();
        productoSeleccionado = Buscar(opc,frutasyVerduras);
        pedido.add(productoSeleccionado);
        MostrarTodo(pedido);
        Subtotal(pedido);
        arreglo.arregloRecibido(pedido);
        //System.out.println(pedido);
        //Pedidos.pedidos();
        }


    public static void DespensayProductosSecos(){
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("\nID"+"\t\t\t PRODUCTO"+"\t\t\tPRECIO");
        for (int i = 0; i<despensayProductosSecos.size(); i++){
            System.out.println(i + 20 + "-- " + despensayProductosSecos.get(i).getNombreProducto() + " :::::: PRECIO :::: "+" $"+despensayProductosSecos.get(i).getPrecio());
        }
        System.out.println("Ingrese el ID de la categoria Despensa y Productos Secos");
        opc = sc.nextInt();
        productoSeleccionado = Buscar(opc,despensayProductosSecos);
        pedido.add(productoSeleccionado);
        MostrarTodo(pedido);
        Subtotal(pedido);
        //Pedidos.pedidos();
    }

    public static void SnacksyConfiterias(){
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("\nID"+"\t\t\t PRODUCTO"+"\t\t\tPRECIO");
        for (int i = 0; i<snacksyConfiterias.size(); i++){
            System.out.println(i + 30 + "-- " + snacksyConfiterias.get(i).getNombreProducto() + " :::::: PRECIO :::: "+" $"+snacksyConfiterias.get(i).getPrecio());
        }
        System.out.println("Ingrese el ID de la categoria Sanacks y Confiterias ");
        opc = sc.nextInt();
        //Pedidos.pedidos();
        productoSeleccionado = Buscar(opc,snacksyConfiterias);
        pedido.add(productoSeleccionado);
        MostrarTodo(pedido);
        Subtotal(pedido);

    }

    public static void Lacteos(){
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("\nID"+"\t\t\t PRODUCTO"+"\t\t\tPRECIO");
        for (int i = 0; i<lacteos.size(); i++){
            System.out.println(i + 41 + "-- " + lacteos.get(i).getNombreProducto() + " :::::: PRECIO :::: "+" $"+lacteos.get(i).getPrecio());
        }
        System.out.println("Ingrese el ID de la categoria Lacteos ");
        opc = sc.nextInt();
        //Pedidos.pedidos();
        productoSeleccionado = Buscar(opc,lacteos);
        pedido.add(productoSeleccionado);
        MostrarTodo(pedido);
        Subtotal(pedido);
    }

    public static void Bebidas(){
        Scanner sc = new Scanner(System.in);
        int  opc;
        System.out.println("\nID"+"\t\t\t PRODUCTO"+"\t\t\tPRECIO");
        for (int i = 0; i<bebidas.size(); i++){
            System.out.println(i + 46 + "-- " + bebidas.get(i).getNombreProducto() + " :::::: PRECIO :::: "+" $"+bebidas.get(i).getPrecio());
        }
        System.out.println("Ingrese el ID de la categoria Bebidas");
        opc = sc.nextInt();
        //Pedidos.pedidos();
        productoSeleccionado = Buscar(opc,bebidas);
        pedido.add(productoSeleccionado);
        MostrarTodo(pedido);
        Subtotal(pedido);
    }
    public static void LimpiezaHogar(){
        Scanner sc = new Scanner(System.in);
        int  opc;
        System.out.println("\nID"+"\t\t\t PRODUCTO"+"\t\t\tPRECIO");
        for (int i = 0; i<liempizaHogar.size(); i++){
            System.out.println(i + 57 + "-- " + liempizaHogar.get(i).getNombreProducto() + " :::::: PRECIO :::: "+" $"+ liempizaHogar.get(i).getPrecio());
        }
        System.out.println("Ingrese el ID de la categoria Limpieza Hogar ");
        opc = sc.nextInt();
        //Pedidos.pedidos();
        productoSeleccionado = Buscar(opc,liempizaHogar);
        pedido.add(productoSeleccionado);
        MostrarTodo(pedido);
        Subtotal(pedido);
    }
    public static void PolloyCarne(){
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("\nID"+"\t\t\t PRODUCTO"+"\t\t\tPRECIO");
        for (int i = 0; i<polloyCarne.size(); i++){
            System.out.println(i + 68 + "-- " + polloyCarne.get(i).getNombreProducto() + " :::::: PRECIO :::: "+" $"+polloyCarne.get(i).getPrecio());
        }
        System.out.println("Ingrese el ID de la categoria Pollo y Carnes ");
        opc = sc.nextInt();
        //Pedidos.pedidos();
        productoSeleccionado = Buscar(opc,polloyCarne);
        pedido.add(productoSeleccionado);
        MostrarTodo(pedido);
        Subtotal(pedido);
    }
    public static void SeccionMacota(){
        Scanner sc = new Scanner(System.in);
        int  opc;
        System.out.println("\nID"+"\t\t\t PRODUCTO"+"\t\t\tPRECIO");
        for (int i = 0; i<seccionMascota.size(); i++){
            System.out.println(i + 80 + "-- " + seccionMascota.get(i).getNombreProducto() + " :::::: PRECIO :::: "+" $"+seccionMascota.get(i).getPrecio());
        }
        System.out.println("Ingrese el ID de la categoria Seccion Mascota");
        opc = sc.nextInt();
        //Pedidos.pedidos();
        productoSeleccionado = Buscar(opc,seccionMascota);
        pedido.add(productoSeleccionado);
        MostrarTodo(pedido);
        Subtotal(pedido);
    }
     public static Producto Buscar(int Id, ArrayList<Producto> lista ) {
          Producto productoSeleccionado = new Producto();
          for(int i=0 ; i<lista.size(); i++){

              // System.out.println(lista.get(i).getIdP());
              if (lista.get(i).getIdP() == Id){
                  productoSeleccionado.setIdP(lista.get(i).getIdP());
                  productoSeleccionado.setNombreProducto(lista.get(i).getNombreProducto());
                  productoSeleccionado.setPrecio(lista.get(i).getPrecio());
                  break;
              }
          }
        return productoSeleccionado;
     }

     public static void MostrarTodo(ArrayList<Producto> lista){
        for (int i=0 ; i<lista.size(); i++){
            System.out.println("ID: "+lista.get(i).getIdP()+"\t"+"Nombre: "+lista.get(i).getNombreProducto()+"\t Precio: "+" $"+lista.get(i).getPrecio());
        }
     }
     public  static double Subtotal(ArrayList<Producto> lista){
         double total = 0;
        for(int i=0 ; i<lista.size(); i++){

            total= total + lista.get(i).getPrecio();
        }
         System.out.println("Subtotal "+ total);
         return total;
     }


     public static void Mostrar(){
        MostrarTodo(pedido);
         Subtotal(pedido);
     }

     public static double MostrarSubtotal(){
         return Subtotal(pedido);
     }


}


