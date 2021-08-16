package poo;

import java.util.*;


public class Uso_empleado {

	public static void main(String[] args) {

		jefatura jefeRRHH=new jefatura("Julieta Gonzales",150000 , 1999, 2, 9);
		jefeRRHH.estableceIncentivo(25000);
		
	
		empleado []MisEmpleados=new empleado[5];

		MisEmpleados[0]=new empleado ("Agustin Waine",85000,2021,1,2);
		MisEmpleados[1]=new empleado ("Fracisco Franco",100000,1998,10,21);
		MisEmpleados[2]=new empleado ("Catalina Fernandez",125000,1986,11,22);
		MisEmpleados[3]=jefeRRHH;// POLIMORFISMO. Principio de sustitucion
		MisEmpleados[4]=new jefatura("Ricardo Fort", 195000, 1989, 6, 25);
		//double num1=7.5	  int num2=(int)num1 casting

		jefatura jefaFinanzas=(jefatura)MisEmpleados[4];//casting de objeto

		jefaFinanzas.estableceIncentivo(25000);

		Arrays.sort(MisEmpleados);

		for(empleado e: MisEmpleados) {//for each
			e.subeSueldo(5);
			System.out.println(e.devuelvedatos()
			+"\nSueldo: $" +e.dameSueldo()+"\nAlta: " +
			e.dameAltaContrato());
		}
	}
}

class empleado implements Comparable{

	public empleado(String nom,double sue,int an,int mes,int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(an,mes-1,dia);
		altaContrato=calendario.getTime();
		seccion="administracion";
		id=idsig;
		idsig++;
	}

	public int compareTo(Object miobjeto) {
		empleado auxemp=(empleado) miobjeto;
		if(this.sueldo<auxemp.sueldo){
			return -1;
		}
		if(this.sueldo>auxemp.sueldo){
			return 1;
		}
		return 0;
	}
	
	//getter
	public String dameNombre(){
		return nombre;
	}
	public double dameSueldo(){
		return sueldo;
	}
	public Date dameAltaContrato(){
		return altaContrato;
	}
	public String devuelvedatos() {//getter
		return "\nNombre: "+nombre+"\nSeccion: "+seccion+"\nID: "+id;
	}

	public void cambsec(String seccion) {//setter
	
	this.seccion=seccion;
	}
	
	//setter
	public void subeSueldo(double porcentaje) {
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;

	private String seccion;
	
	private int id;

	private static int idsig=1;
	
}

class jefatura extends empleado{
	public jefatura(String nom, double sue, int an, int mes, int dia) {
		super(nom, sue, an, mes, dia);
		
	}

	public void estableceIncentivo(double b){
		incentivo=b;
	}

	public double dameSueldo(){
		double sueldojefe=super.dameSueldo();
		return sueldojefe+incentivo;
	}

	private double incentivo;

}