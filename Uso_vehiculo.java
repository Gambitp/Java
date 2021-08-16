package poo;
import javax.swing.*;
public class Uso_vehiculo {

	public static void main(String[] args) {
		
		/*coche Renault = new coche(); //instanciar clase - ejemplar clase
	
		Renault.cambio_color(JOptionPane.showInputDialog("Introduce color"));
		
		Renault.cambio_asientos(JOptionPane.showInputDialog("tiene asientos de cuero? "));
		
		Renault.cambio_climatizador(JOptionPane.showInputDialog("Tiene climatizador? "));
		
		System.out.println(Renault.dime_climatizador());
		
		Renault.cambio_pesoCoche();
		
		Renault.dime_climatizador();
		
		System.out.println(Renault.dime_datos());*/ 

		//El codigo es anterior a la creacion de la clase Furgoneta

		coche micoche1= new coche();

		micoche1.cambio_color("Rojo");
		
		furgoneta mifurgoneta1 = new furgoneta(7, 580);

		mifurgoneta1.cambio_color("Azul");
		mifurgoneta1.cambio_climatizador("si");
		mifurgoneta1.cambio_asientos("si");

		System.out.println(micoche1.dime_datos());

		System.out.println(mifurgoneta1.dime_datos()+" "+mifurgoneta1.dimeDatosFurgoneta());

	}

}
