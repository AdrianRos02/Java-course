

import java.util.ArrayList;


public class Main {
	
  public static void main(String[] args) {
    
    GatoSimple peter = new GatoSimple("Peter","marron","siames","macho",8,14);
    
    System.out.println("hola gatito");
    peter.maulla();
    System.out.println("toma carne");
    peter.come("carne");
    System.out.println("toma pescado");
    peter.come("pescado");
    
    GatoSimple check= new GatoSimple("check","marron","siames","macho",3,10);
    
    System.out.println("check, toma sopita ");
    check.come("sopa");
    
    GatoSimple black = new GatoSimple("black","negro","siames","hembra",5,12);
    
    System.out.println("gatitos, a ver cómo maulláis");
    peter.maulla();
    check.maulla();
    black.maulla();
    
   peter.peleaCon(black);
   black.peleaCon(check);
    check.peleaCon(peter);
    
    
    // VectorGatoSimple

    GatoSimple vectorGatos[]=new GatoSimple[3];
    
    vectorGatos[0]=peter;
    vectorGatos[1]=check;
    vectorGatos[2]=black;
   
    
    System.out.println("\n Vectores \n");
    
    for (GatoSimple gato : vectorGatos) {
    	System.out.println(gato.toString());
		
	}
    
  
  
  
  
  
  }
}

