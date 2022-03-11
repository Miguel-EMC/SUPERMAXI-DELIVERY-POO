package epn.edu.modelo;

import java.util.ArrayList;

public class Producto {
    public String nombreProducto;
    public int idP;
    public double precio;
    public int cantidad;
    private boolean comprar;

    public Producto(String nombreProducto, int idP, double precio, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.idP = idP;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {

    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Listado de prodcutos
    public static ArrayList<Producto> FrutasYverdurasList() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Ciruela Claudia", 1, 0.25, 10));
        productos.add(new Producto("Mora", 2, 0.25, 50));
        productos.add(new Producto("Kiwi", 3, 0.50, 20));
        productos.add(new Producto("Manzana", 4, 0.35, 20));
        productos.add(new Producto("Frutilla", 5, 0.20, 50));
        productos.add(new Producto("Tomate de Árbol ", 6, 0.15, 20));
        productos.add(new Producto("Papaya de Monte", 7, 1, 20));
        productos.add(new Producto("Chirimoya", 8, 1, 20));
        productos.add(new Producto("Capulí", 9, 0.20, 50));
        productos.add(new Producto("Durazno", 10, 0.40, 20));
        productos.add(new Producto("Taxo", 11, 0.60, 20));
        productos.add(new Producto("Babaco", 12, 1, 10));
        productos.add(new Producto("Acelga", 13, 0.15, 25));
        productos.add(new Producto("Cilantro", 14, 0.10, 100));
        productos.add(new Producto("Tomate riñón ", 15, 0.35, 75));
        productos.add(new Producto("Cebolla Paiteña ", 16, 0.35, 50));
        productos.add(new Producto("Lechuga", 17, 0.50, 20));
        productos.add(new Producto("Patata", 18, 0.35, 50));
        productos.add(new Producto("Aji", 19, 0.25, 15));
        return productos;
    }

    public static ArrayList<Producto> DespensayProductosSecosList() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Atun", 20, 1.25, 20));
        productos.add(new Producto("Arroz", 21, 0.60, 20));
        productos.add(new Producto("Tallarin", 22, 1.75, 20));
        productos.add(new Producto("Lenteja", 23, 1, 20));
        productos.add(new Producto("Frejol", 24, 1, 20));
        productos.add(new Producto("Aceite", 25, 1, 20));
        productos.add(new Producto("Mantequilla", 26, 1, 20));
        productos.add(new Producto("Sal", 27, 0.70, 20));
        productos.add(new Producto("Azucar", 28, 0.50, 50));
        productos.add(new Producto("Canguil", 29, 0.80, 50));
        return productos;
    }

    public static ArrayList<Producto> SnacksyConfiteriaList() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Doritos", 30, 0.50, 20));
        productos.add(new Producto("Ruffles", 31, 0.50, 20));
        productos.add(new Producto("Galletas Oreo", 32, 0.45, 15));
        productos.add(new Producto("Galletas Amor", 33, 1, 15));
        productos.add(new Producto("Tostachos", 34, 0.50, 15));
        productos.add(new Producto("Ryskos", 35, 0.50, 15));
        productos.add(new Producto("Chupetes", 36, 0.15, 15));
        productos.add(new Producto("Manicho", 37, 0.50, 15));
        productos.add(new Producto("Chicles", 38, 0.10, 15));
        productos.add(new Producto("Tango", 39, 0.35, 15));
        productos.add(new Producto("Galak", 40, 0.50, 15));
        return productos;
    }

    public static ArrayList<Producto> LacteosList() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Leche ", 41, 0.80, 25));
        productos.add(new Producto("Queso ", 42, 2, 25));
        productos.add(new Producto("Leche Condensada ", 43, 1.05, 25));
        productos.add(new Producto("Manjar de Leche ", 44, 1.25, 25));
        productos.add(new Producto("Yougurt ", 45, 0.85, 25));
        return productos;
    }

    public static ArrayList<Producto> BebidasList() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Sodas", 46, 1, 50));
        productos.add(new Producto("Guitig", 47, 0.60, 50));
        productos.add(new Producto("Aguas", 48, 0.50, 50));
        productos.add(new Producto("Energizantes", 49, 1, 50));
        productos.add(new Producto("Bebidas Hidrantantes", 50, 1.25, 50));
        productos.add(new Producto("Cervezas", 51, 1.75, 50));
        productos.add(new Producto("Ron", 52, 8, 50));
        productos.add(new Producto("Wiskye", 53, 15, 50));
        productos.add(new Producto("Bodka", 54, 7, 50));
        productos.add(new Producto("Pajaro Azul", 55, 6, 50));
        productos.add(new Producto("Agua ardiente", 56, 9, 50));
        return productos;
    }

    public static ArrayList<Producto> LimpiezaHogarList() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Deja", 57, 1.25, 25));
        productos.add(new Producto("Lava todo", 58, 1.15, 25));
        productos.add(new Producto("Desinfectante", 59, 3, 25));
        productos.add(new Producto("Cloro", 60, 0.80, 25));
        productos.add(new Producto("Trapiador", 61, 2, 25));
        productos.add(new Producto("Escoba", 62, 2, 25));
        productos.add(new Producto("Javon de ropa", 63, 0.70, 25));
        productos.add(new Producto("Shampoo", 64, 6, 25));
        productos.add(new Producto("Javon de olor", 65, 1.35, 25));
        productos.add(new Producto("Cepillo de Dientes", 66, 3.35, 25));
        productos.add(new Producto("Pasta de dientes", 67, 2.25, 25));
        return productos;
    }

    public static ArrayList<Producto> PolloyCarneList() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pollo", 68, 6, 25));
        productos.add(new Producto("Carne", 69, 7, 25));
        productos.add(new Producto("Carne Fritada", 12, 0.15, 25));
        productos.add(new Producto("Chuletas", 71, 2, 25));
        productos.add(new Producto("Salchichas", 72, 0.75, 25));
        productos.add(new Producto("Corvina", 73, 2.35, 25));
        productos.add(new Producto("Pescado", 74, 4, 25));
        productos.add(new Producto("Peporoni", 75, 4, 25));
        productos.add(new Producto("Jamon", 76, 1, 25));
        productos.add(new Producto("Montadela", 77, 1, 25));
        productos.add(new Producto("Carne Molida", 78, 3.50, 25));
        productos.add(new Producto("Tocino", 79, 5, 25));

        return productos;
    }

    public static ArrayList<Producto> SeccionMacotaList() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Alimento para perros", 80, 1, 25));
        productos.add(new Producto("Alimento para gatos", 81, 1, 25));
        productos.add(new Producto("Collares", 82, 2, 25));
        productos.add(new Producto("Pecheras", 83, 15, 25));
        productos.add(new Producto("Alimento para peces", 84, 3, 25));
        productos.add(new Producto("Vitaminas", 85, 7, 25));
        productos.add(new Producto("Desparacitantes", 86, 8, 25));
        productos.add(new Producto("Camas para mascota", 87, 20, 25));
        productos.add(new Producto("Juguetes para perro ", 88, 4, 25));
        productos.add(new Producto("Juguetes para Gato", 89, 4, 25));
        productos.add(new Producto("Arena de Gato", 90, 7, 25));
        productos.add(new Producto("Comida para Hamster", 91, 3, 25));
        return productos;

    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", idP=" + idP +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", comprar=" + comprar +
                '}';
    }

    public void setComprar(boolean comprar) {
        this.comprar = comprar;
    }
}