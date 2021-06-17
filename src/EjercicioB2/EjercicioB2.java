package EjercicioB2;

public class EjercicioB2 {
public static void main(String[]args) {
	
	
	
	Persona vero=new Persona(1234,"Vero","sales",98);

	
	Persona alex=new Persona(1234,"TOMEU","MARICO",120);
	
	
	
	System.out.println(vero.nombre +" "+vero.apellidos+" con DNI "+vero.dni+" con "+vero.edad+ "años");
	System.out.println(alex.nombre+ " "+alex.apellidos+" con DNI "+alex.dni+" con "+alex.edad+"años");

}
}
