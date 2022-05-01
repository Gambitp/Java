


public class App {
    public static void main(String[] args) throws Exception {
        
        Tornillo tornillo1 = new Tornillo();

        tornillo1.setMedida("A4x25");

        System.out.println(tornillo1.getMedida());
        System.out.println(tornillo1.getCodigoDelTornillo());

        Tornillo tornillo2 = new Tornillo();

        tornillo2.setMedida("M5x25");

        System.out.println(tornillo2.getMedida());
        System.out.println(tornillo2.getCodigoDelTornillo());
    }
}
