package poo;
import java.util.*;

public class Uso_persona {
    public static void main(String[] args) {
        persona[] laspersonas= new persona[2];
        laspersonas[0]=new empleado2("Agustin",55000, 2009, 02, 25);
        laspersonas[1]=new alumno("Francisco", "Medicina");
        
        for(persona p: laspersonas){
            System.out.println(p.damenombre()+", "+p.damedescripcion());
        }
    }
}

abstract class persona{
    public persona(String nom){
        nombre=nom;
    }

    public String damenombre(){
        return nombre;
    }
	
    public abstract String damedescripcion();

    private String nombre;
}

class empleado2 extends persona{

	public empleado2(String nom,double sue,int an,int mes,int dia) {
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(an,mes-1,dia);
		altaContrato=calendario.getTime();
		seccion="administracion";
		id=idsig;
		idsig++;
	}

    public String damedescripcion(){
        return "Este empleado tiene un ID= "+id+" con un sueldo= "+sueldo;
    }
	
	public double dameSueldo(){
		return sueldo;
	}
	public Date dameAltaContrato(){
		return altaContrato;
	}
	public String devuelvedatos() {//getter
		return "\nSeccion: "+seccion+"\nID: "+id;
	}

	public void cambsec(String seccion) {//setter
	
	this.seccion=seccion;
	}
	
	//setter
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	
	
	
	private double sueldo;
	
	private Date altaContrato;

	private String seccion;
	
	private int id;

	private static int idsig=1;
	
}

class alumno extends persona{
    public alumno(String nom,String car) {
        super(nom);
        carrera=car;
    }

    public String damedescripcion(){
        return "Este alumno esta estudiando la carrera de "+carrera;
    }
    private String carrera;
}
