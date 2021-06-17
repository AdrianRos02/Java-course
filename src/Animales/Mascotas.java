package Animales;

public abstract class Mascotas {

	//variables
	String nombre;
	int edad;
	String estado;
	String fechaNacimiento;
	
	//Constructor
	public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }
	
	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	
	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public void setfechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
	}
	
	//metodos
	public abstract void muestra();
	
	public abstract void habla();
	
	
	public void cumpleaños() {
		
		System.out.println("nacio en: "+fechaNacimiento+" tiene "+edad);
	}
	
	public void morir() {
		
		System.out.println("Se siente "+estado);
		
	}
	
	
	
	
}
