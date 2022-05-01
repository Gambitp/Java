

public class Tornillo {
    public Tornillo(){
       codigoDelTornillo=codigo++;
    }
    

    public int getCodigoDelTornillo() {
        return codigoDelTornillo;
    }




    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getTipoDeTornillo() {
        return TipoDeTornillo;
    }


    public void setTipoDeTornillo(String tipoDeTornillo) {
        TipoDeTornillo = tipoDeTornillo;
    }


    public String getMedida() {
        return Medida;
    }


    public void setMedida(String medida) {
        Medida = medida;
    }


    public String getDenomincion() {
        return Denomincion;
    }


    public void setDenomincion(String denomincion) {
        Denomincion = denomincion;
    }

    private String Medida;
    private String Denomincion;
    private String name;
    private String TipoDeTornillo;
    static int codigo = 0;
    private int codigoDelTornillo;

}
