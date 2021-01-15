package persona;

public class MainPersona {

	public static void main(String[]args) {
		Persona adrian=new Persona();
		adrian.nombre = "adrian";
		adrian.apellido="rosello";
		adrian.edad=18;
		adrian.peso=78;
		adrian.altura=175;
		adrian.genero='M';
		adrian.correr();
		
		adrian.listar();
	
		Persona pepe=new Persona();
		pepe.nombre= "pepe";
		pepe.apellido="rosello";
		pepe.peso=200;
		pepe.altura=200;
		pepe.genero='M';
		pepe.correr();
		pepe.edad=100;
		
		pepe.listar();
	}
}
