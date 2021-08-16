package poo;

public class inventariodeproductos {
    private String name;
    private int amount;
    private float price;
    private int ID;
    private String category;
    private int id;
	private static int idsig=1;


    public inventariodeproductos(String name,int amount,float price,int ID,String category){
        this.name=name;
        this.amount=amount;
        this.price=price;
        this.ID=ID;
        this.category=category;
        id=idsig;
		idsig++;
    }

    public String dime_datos(){ //getter datos
		return "\nProducto: "+ name +" Cantidad: "+amount
				+ " Precio: $"+price+ " ID: "+ID+
				" Categoria: "+category;
	}

    public int BuscarporNombre(String name){
        if(true==name.equalsIgnoreCase(this.name)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public int BuscarporID(int ID){
        if(ID==id){
            return 1;
        }
        else{
            return 0;
        }
    }

    

}
