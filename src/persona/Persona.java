package persona;

public class Persona {
	
	//Atributos o Caracteristicas
	String nombre;
	String apellido;
	int edad;
	float altura;
	int peso;
	char genero;
	String ojos;
	
	//Metodos o acciones
	
	public void caminar() {
		
		System.out.println("Estoy caminando");
	}
	
	
	public void comer() {

		System.out.println("Estoy comiendo");
	}
	
	public void dormir() {
		
		System.out.println("Estoy durmiendo");
	}
	
	public void correr() {
		 
		System.out.println("Estoy corriendo");
	}
	
	public void listar() {
		
		System.out.println("Me llamo " +nombre + " mi apellido es " + apellido +" tengo "+ edad +" de edad mido "+ altura +" peso "+ peso +" soy de genero "+ genero);
	}





}
