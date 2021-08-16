package poo;
public class Pruebas{

    public static void main(String[] args) {
        Empleados trabajador1= new Empleados("Paco");

        Empleados trabajador2= new Empleados("Ana");

        Empleados trabajador3= new Empleados("Antonio");

        Empleados trabajador4= new Empleados("Maria");

        trabajador1.cambiaseccion("RRHH");

        System.out.println(trabajador1.DevuelveDatos());

        System.out.println(trabajador2.DevuelveDatos());

        System.out.println(trabajador3.DevuelveDatos());

        System.out.println(trabajador4.DevuelveDatos());

        System.out.println(Empleados.dameidsiguiente());

    }
        
}

class Empleados{

    public Empleados(String nom){ //constructor
        nombre=nom;
        seccion="administracion";
        idpersonal=id;
        id++;
    }

    public void cambiaseccion(String seccion){      //setter
        this.seccion=seccion;
    }

    public String DevuelveDatos(){  //getter
        return "El nombre es "+nombre+", la seccion es "+seccion+". El id es "+idpersonal;
    }
    
    public static String dameidsiguiente() {
        
        return "\n El id siguiente es  "+id+"\n";

    }



    private final String nombre;
    private String seccion;
    private static int id=1;
    private final int idpersonal;
}