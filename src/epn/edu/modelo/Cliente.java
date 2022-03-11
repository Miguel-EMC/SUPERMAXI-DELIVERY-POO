package epn.edu.modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Persona implements AccionCliente{

    public static ArrayList<Cliente> listaPersona = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
/*    private String nombre;
    private String cedula;
    private String telefono;
    private String email;*/
    private String Direccion;
    private boolean comprar;

    public Cliente(String nombre,String id,String telefono, String email, String direccion/*, boolean comprar*/) {
        super.nombre = nombre;
        super.id = id;
        super.telefono = telefono;
        super.email = email;
        this.Direccion = direccion;
        //this.comprar = comprar;
    }

    public Cliente() {
        super();

    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public boolean isComprar() {
        return comprar;
    }

    public void setComprar(boolean comprar) {
        this.comprar = comprar;
    }

    public static void DatosCliente(){
        //ArrayList<Cliente> listaPersona = new ArrayList<>();
        Scanner sc = new Scanner(System.in);  //Faltaba  este objeto
        System.out.println("Nombre: ");
        String nombre = sc.next();
        System.out.println("cedula: ");
        String cedula = sc.next();
        System.out.println("Telefono: ");
        String telefono = sc.next();
        System.out.println("email: ");
        String email = sc.next();
        System.out.println("Diereccion:");
        String Direccion =sc.next();
       listaPersona.add(new Cliente(nombre,cedula,telefono,email,Direccion));
        System.out.println(":::: REGISTRADO CON EXITO  ::: \n");


    }

    public static void MostrarCliente (){
        for (int i=0;i<listaPersona.size();i++){
            System.out.printf(
                             "Nombre: " + listaPersona.get(i).getNombre()
                            +"\nCedula: " + listaPersona.get(i).getId()
                            +"\nTelefono: "+listaPersona.get(i).getTelefono()
                            +"\nEmail: "+listaPersona.get(i).getEmail()
                            +"\nDireccion: " + listaPersona.get(i).getDireccion()+"\n");
        }
    }


    @Override
    public double pagarCompra(double km) {
        return km;
    }

    @Override
    public double cancelarCompra(double km) {
        return km;
    }
}
