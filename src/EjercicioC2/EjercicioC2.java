package EjercicioC2;

public class EjercicioC2 {
public static void main(String[]args) {
	
	
	
	Persona vero=new Persona();
	vero.setdni(123456789);
	vero.setnombre("adrian");
	vero.setapellidos("fandos");
	vero.setedad(18);
	
	Persona alex=new Persona();
	alex.setdni(123456789);
	alex.setnombre("alex");
	alex.setapellidos("grao");
	alex.setedad(92);
	
	
	 String frase1 =vero.getnombre() + " " + vero.getapellidos() + " con DNI " + vero.getdni();
     String frase2 = alex.getnombre() + " " + alex.getapellidos() + " con DNI " + alex.getdni();

	
	if (vero.getedad() >= 18) {
        frase1 += " es mayor de edad";
    } else {
        frase1 += " no es mayor de edad";
    }

    if (alex.getedad() >= 18) {
        frase2 += " es mayor de edad";
    } else {
    	frase2 += " no es mayor de edad";
    }

    System.out.println(frase1);
    System.out.println(frase2);


   
	
}
}
