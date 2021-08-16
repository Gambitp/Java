package poo;

public class furgoneta extends coche{
    
    private int capacidad_carga;
    private int plazas_extra;

    public furgoneta(int plazas_extra,int capacidad_carga){
        super(); //llamar al constructor de la clase padre

        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;


    }


    public String dimeDatosFurgoneta() {

        return " La capasidad de carga es: "+capacidad_carga+" kg. Y las plazas son: "+plazas_extra;
        
    }

}
