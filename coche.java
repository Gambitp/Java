package poo;
	
public class coche {
	
	private int ruedas,largo,ancho,motor,pesoPlataforma,pesoCoche,carroceria;
	private boolean asientos_cuero,climatizador;
	private String color;
	public coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
		color="azul";
		asientos_cuero= false;
		climatizador=false;
		carroceria=500;
		pesoCoche=pesoPlataforma+carroceria;
	}
	
	public String dime_datos(){ //getter datos
		return "El coche tiene "+ ruedas +" ruedas. Es de color "+color
				+ ". Tiene un motor de "+motor+ " cm^3. "+dime_asientos()+
				dime_climatizador()+dime_pesoCoche()+precio();
	}
	
	public void cambio_color(String a) { //setter color
		color=a;
	}
	
	public String dime_color(){ //getter color

		return "El coche tiene color "+ color;
	}
	
	public void cambio_asientos(String asientos_cuero) { //setter asientos
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}
		else {
			this.asientos_cuero=false;
		}
			
	}
	
	public String dime_asientos(){ //getter asientosroas
		if (asientos_cuero==true) {
			return "El coche tiene asientos de cuero. ";
		}
		else {
			return "El coche tiene asientos de serie. ";
		}
	
	}
	
	public void cambio_climatizador(String climatizador) { //setter asientos
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}
		else {
			this.climatizador=false;
		}
		System.out.println(this.climatizador);
	}
	
	public String dime_climatizador(){ //getter asientos

		if (climatizador==true) {
			return "El coche tiene climatizador. ";
		}
		else {
			return "El coche no tiene climatizador. ";
		}
	
	}

	public void cambio_pesoCoche() { //setter 
		if(asientos_cuero==true) {
			pesoCoche=pesoPlataforma+carroceria+50;
		}
		
	}
	
	public String dime_pesoCoche(){ //getter 
		
		return "El coche pesa "+ pesoCoche+" kg.";
	}
	
	public String precio() { //setter 
		int preciofinal=10000;
		if(asientos_cuero==true) {
			preciofinal+=1500;
		}
		if(climatizador==true) {
			preciofinal+=1000;
		}
		return " El coche cuesta u$s"+ preciofinal;
		
	}
	
}
