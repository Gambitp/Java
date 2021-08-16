package poo;

public class Usostatic {

	public static void main(String[] args) {
		empleados trab1= new empleados("Agus");
		empleados trab2= new empleados("Pato");
		trab1.cambsec("RRHH");
		System.out.println(trab1.devuelvedatos());
	
		System.out.println(trab2.devuelvedatos());
	}

}

class empleados{
	public empleados(String nom) {
		nombre=nom;
		seccion="administracion";
		id=idsig;
		idsig++;
	}
	public String devuelvedatos() {//getter
		return "el nombre es: "+nombre+",la seccion es: "+seccion+". El Id es: "+id;
	}

	public void cambsec(String seccion) {//setter
	
	this.seccion=seccion;
	}
	private final String nombre;
	private String seccion;
	private int id;
	private static int idsig=1;

}