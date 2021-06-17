package Animales;

public class Canario extends Aves{

	
	//Variables
	String color;
	String canta;
	
	//Constructor
		Canario(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela, String color,String canta) {
	        super(nombre, edad, estado, fechaNacimiento,pico,vuela);
	        this.color = color;
	        this.canta=canta;
	      
		}
	
	//Getters y Setters
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public String getcanta() {
		return canta;
	}
	public void setcanta(String canta) {
		this.canta=canta;
	}
	
	//Metodos
	
	@Override
	public void muestra() {
		
		System.out.println();
	}
	@Override
	public void habla() {
		System.out.println();
	}
	
	@Override
	public void volar() {
		System.out.println();
	}
	
}
