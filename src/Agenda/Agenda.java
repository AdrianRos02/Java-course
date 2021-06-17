package Agenda;
import java.util.ArrayList;

public class Agenda {

	
	public static ArrayList<Contacto>Contactos=new ArrayList<Contacto>();
	
	
	
	
	//METODOS
	public boolean añadirContacto(Contacto e) {
		
		Contactos.add(e);
		if(Contactos.add(e)){
		
			System.out.println("El contacto a sido añadido");
			
		}
		
		
		return false ;
	}
	
	public boolean EliminarContacto(String nombre) {
		
		Contactos.remove(nombre);
		if(Contactos.remove(nombre)) {
			
			System.out.println("El contacto a sido eliminado");
			
		}
		
		
		return false;
	}
	
	public boolean existeContacto(String nombre) {
		
		boolean existe=false;
		if(Contactos.contains(nombre) ) {
			existe=true;
		}
		
		return existe;
	}
	
	public void listarContactos() {
		
		System.out.println(Contactos);
	}
	
	public int buscaContacto(String nombre) {
		
		int posicion = 0;
		if(Contactos.contains(nombre) ) {
			System.out.println("El contacto es "+nombre+" En la posicion "+posicion);
		}
		
		return posicion;
		
		
	}
	
	
}
