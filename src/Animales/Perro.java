package Animales;
public class Perro extends Mascotas {

	//Variables
	String raza;
	boolean pulgas;
	
	//Constructor
	Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado,fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
	}
	//Getters y Setters
	
	public String getraza() {
		return raza;
	}
	public void setraza(String raza) {
		this.raza=raza;
	}
	
	public boolean getpulgas() {
		return pulgas;	
	}
	public void setpulgas(boolean pulgas) {
		this.pulgas=pulgas;
	}
	//Metodos
	
	@Override
	public void muestra() {
		
		System.out.println("Se llama "+this.getNombre()+" tiene "+this.getEdad()+" Esta "+this.getEstado()+" nacido en "+this.getFechaNacimiento()+"Es de raza: "+this.getraza()+"pulgas: "+this.getpulgas());
		
	}
	
	@Override
	public void habla() {
	
		System.out.println("Guau");
	}
	

	
	
	
}
