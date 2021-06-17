package EjercicioD2;

public class EjercicioD2 {
public static void main(String[]args) {
	
	
	
	Persona vero=new Persona();
	vero.setdni(123456789);
	vero.setnombre("adrian");
	vero.setapellidos("fandos");
	vero.setedad(18);
	vero.setesMayorEdad(false);
	
	Persona alex=new Persona();
	alex.setdni(123456789);
	alex.setnombre("alex");
	alex.setapellidos("grao");
	alex.setedad(92);
	alex.setesMayorEdad(true);
	
	
	System.out.println(alex.getdni());
	
	
	vero.imprime();
	alex.imprime();

	  System.out.println("La diferencia de edad es " + vero.diferenciaEdad(alex));
}

}
