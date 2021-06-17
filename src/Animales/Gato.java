package Animales;

public class Gato extends Mascotas{

	//Variables
	String color;
	boolean peloLargo;
	
	//Constructor
		Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
	        super(nombre, edad, estado, fechaNacimiento);
	        this.color = color;
	        this.peloLargo = peloLargo;
		}
	
	//Getters y Setters
	
		public String getcolor() {
			return color;
		}
		public void setcolor(String color) {
			this.color=color;
		}
		
		public boolean getpeloLargo() {
			return peloLargo;	
		}
		public void setpeloLargo(boolean peloLargo) {
			this.peloLargo=peloLargo;
		}
	
	
	//Metodos
	
	@Override
	public void muestra() {
		
		System.out.println("Se llama "+this.getNombre()+" tiene "+this.getEdad()+" Esta "+this.getEstado()+" nacido en "+this.getFechaNacimiento()+"Es de color: "+this.getcolor()+"tiene el pelo: "+this.getpeloLargo());
		
	}
	@Override
	public void habla() {
		
		System.out.println("Miauuu");
		
	}
	
	
}
