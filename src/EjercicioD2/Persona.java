package EjercicioD2;

public class Persona {
	
	private int dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean esMayorEdad;
	//get

	public int getdni() {
		return dni;
		
	}

	public String getnombre() {
		return nombre;
		
	}
	
	public String getapellidos() {
		return apellidos;
		
	}
	public int getedad() {
		return edad;
		
	}
	public boolean getesMayorEdad() {
		return esMayorEdad;
		
	}
	
	//set

	public void setdni(int dni) {
		this.dni=dni;
	}

	public void setnombre(String nombre) {
		this.nombre=nombre;
		}
	public void setapellidos(String apellidos) {
		this.apellidos=apellidos;
		}
	public void setedad(int edad) {
		this.edad=edad;
		
}
	public void setesMayorEdad(boolean esMayorEdad) {
		this.esMayorEdad=esMayorEdad;
		}
	
	//METODOS
	
	public void imprime() {
		System.out.println(dni);
		System.out.println(nombre);
		System.out.println(apellidos);
		System.out.println(edad);
		System.out.println(esMayorEdad);
	}
	
	public void esMayorEdad(boolean esMayorEdad) {
		
		if(edad<18) {
			esMayorEdad=false;
			
		}
		else {
			esMayorEdad=true;
		
		}
		return ;
		}
	
public boolean esJubilado() {
	 return this.edad >= 65;
	}
public int diferenciaEdad(Persona p) {
    return this.edad - p.edad;
}
}
