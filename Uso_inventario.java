package poo;

import java.util.Scanner;

public class Uso_inventario {
    public static void main(String[] args) {
        String name;
        int amount;
        float price;
        int ID;
        String category="INVALID";
        int i=0,c,j,cat=0,aux=0;
        Scanner entrada =new Scanner(System.in);
        inventariodeproductos []Basededatos=new inventariodeproductos[100];

        do{
            System.out.println("\nSeleccione una opcion:\n 0: Ingresar producto\n 1: Mostrar listado de productos.\n 2: Buscar producto por nombre.\n 3: Buscar producto por ID.\n 4: Compra de producto\n 5: Venta de producto.\n 6: Ganancia por venta totales\n 7:Salir\n");
            c= entrada.nextInt();
            switch (c){
                case 0:
                
                    System.out.println("\nIngrese el nombre del producto: ");
                    name= entrada.next();
                    entrada.reset();
                    System.out.println("\nIngrese la cantidad de producto: ");
                    amount= entrada.nextInt();
                    System.out.println("\nIngrese el precio del producto: ");
                    price= entrada.nextFloat();
                    System.out.println("\nIngrese el ID del producto: ");
                    ID= entrada.nextInt();
                    cat=0;
                    while(cat<=2){
                        System.out.println("\nIngrese el categoria del producto: \n0-Comestible\n1-Bebida\n2-Artefacto");
                        cat= entrada.nextInt();
                      
                        if (cat <= 2 && cat >= 0){
                            switch (cat){
                                case 0:
                                    category="Comestible";
                                    System.out.println(category);
                                    cat=5;
                                    break;
                                case 1:
                                    category="Bebida";
                                    System.out.println(category);
                                    cat=5;
                                    break;
                                case 2:
                                    category="Artefacto";
                                    System.out.println(category);
                                    cat=5;   
                                    break;
                            }
                        }
                        else{
                            cat=1;
                        }
                    }                            
                    Basededatos[i]= new inventariodeproductos(name, amount, price, ID,category);
                    i++;
                    break;
                case 1:
                    for(j=0;j<i;j++){                             
                        System.out.println(Basededatos[j].dime_datos()); 
                    } 
                    break;
                case 2:
                
                    System.out.println("\nIngrese el nombre del producto: ");
                    name= entrada.next();
                    entrada.reset();
                    for(j=0;j<i;j++){
                        if(Basededatos[j].BuscarporNombre(name)==1){
                            System.out.println(Basededatos[j].dime_datos()+"\n");
                            aux++;
                        }
                        
                    }
                    if(aux==0){
                        System.out.println("There's no product with that name.");
                    }
                    
                    break;
         
                case 3:
                
                    System.out.println("\nIngrese el ID del producto: ");
                    ID= entrada.nextInt();
                    entrada.reset();
                    for(j=0;j<i;j++){
                        if(Basededatos[j].BuscarporID(ID)==1){
                            System.out.println(Basededatos[j].dime_datos()+"\n");
                            aux++;
                        }
                        
                    }
                    if(aux==0){
                        System.out.println("There's no product with that name.");
                    }
                    
                    break;
                default:
                    break;
                
            }
        }
        while(c!=7);
        

    } 
}  
