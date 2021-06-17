package Animales;

public class Loro extends Aves {
	
	
	//Variables
	String origen;
	
	//Constructor
	Loro(String nombre, int edad, String estado, String fechaNacimiento,  boolean pico, boolean vuela,String origen) {
        super(nombre, edad, estado, fechaNacimiento,pico,vuela);
        this.origen = origen;
      
	}
	
	//Getters y Setters
	
	public String getorigen() {
		return origen;
	}
	public void setorigen(String origen) {
		this.origen=origen;
	}
	
	//Metodos
	
	@Override
	public void muestra() {
		
		System.out.println("Se llama "+this.getNombre()+" tiene "+this.getEdad()+" Esta "+this.getEstado()+" nacido en "+this.getFechaNacimiento()+"Es de origen: "+this.getorigen());
		
	}
	@Override
	public void habla() {
		System.out.println("HOLAAA");
	}
	
	public void saluda(){
		System.out.println("Buenas");
	}
	@Override
	public void volar() {
		System.out.println("");
	}
	

}
