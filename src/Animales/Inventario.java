
package Animales;
import java.util.ArrayList;

public class Inventario {

	
	private ArrayList<Mascotas> animales= new ArrayList();
	
	
	
	private String getTipoMascota(Mascotas m) {
		
		//Perro
		if(m instanceof Perro){
			System.out.println("Es un perro");
		}
		else {
			System.out.println("No es un perro");
		}
		//Gato
		if(m instanceof Gato){
			System.out.println("Es un Gato");
		}
		else {
			System.out.println("No es un Gato");
		}
		//Loro
		if(m instanceof Aves){
			System.out.println("Es un Ave");
		}
		else {
			System.out.println("No es un Ave");
		}
		
		
		return null;
	}
	
	public void mostrarListaAnimales() {
		
		for (int i=0;i<animales.size();i++) {
			
			Mascotas m=animales.get(i);
			
			String tipo=getTipoMascota(m);
			
			String nombre=m.getNombre();
			
			System.out.println(i+" : "+tipo+" "+nombre);
		}
		
	}
	
	public void mostrarUnAnimal(int indice) {
		if (indice >= 0 && indice < animales.size()) {
            System.out.println("MASCOTA " + indice );
            Mascotas m = animales.get(indice);
            m.muestra();
        }
	}
	
	public void mostrarTodosAnimales() {
		for (int i=0;i<=animales.size();i++) { 
			  
		mostrarUnAnimal(i);
		System.out.println(" ");
	}
	}
	
	public void insertarAnimal(Mascotas a) {
		
		animales.add(a);
		
		
	}
	
	public boolean eliminarAnimal(int indice) {
		
		 if (indice >= 0 && indice < animales.size()) {
	            animales.remove(indice);
	            return true;
	        } else {
	            return false;
	        }
		
	}
	public void vaciarInventario() {
		animales.clear();
	}
	
}
