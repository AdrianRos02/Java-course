package EjercicioA2;

public class EjercicioA2 {
public static void main(String[]args) {
	Persona vero=new Persona();
	vero.dni=123456789;
	vero.nombre="vero";
	vero.apellidos="fandos";
	vero.edad=24;
	
	Persona alex=new Persona();
	alex.dni=123456789;
	alex.nombre="alex";
	alex.apellidos="grao";
	alex.edad=92;
	
	
	System.out.println(vero.nombre +" "+vero.apellidos+" con DNI "+vero.dni+" con "+vero.edad+ "años");
	System.out.println(alex.nombre+ " "+alex.apellidos+" con DNI "+alex.dni+" con "+alex.edad+"años");

}
}
