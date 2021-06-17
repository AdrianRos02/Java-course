package Animales;

public abstract class Aves extends Mascotas{

	//Variables
	
	boolean pico;
	boolean vuela;
	//Constructor
	Aves(String nombre, int edad, String estado, String fechaNacimiento, boolean pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
	}
	
	//Getters y Setters
	
	public boolean getpico() {
		return pico;
	}
	public void setpico(boolean pico) {
		this.pico=pico;
	}
	
	public boolean getvuela() {
		return vuela;	
	}
	public void setvuela(boolean vuela) {
		this.vuela=vuela;
	}
	
	
	//Metodos

	@Override
	public abstract void muestra();
	
	@Override
	public abstract void habla();
	
	public abstract void volar();
}
