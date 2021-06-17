package VEHICULOS;

public class motos extends Terrestres{
	
	//ATRIBUTO
	private String color;
	
	//CONSTRUCTOR POR DEFECTO
	public motos() {
		super();
	}
	
	//CONSTRUCTOR
	public motos(String tipo, String matricula, String modelo, int numRueda, String color) {
		super(tipo, matricula, modelo, numRueda);
		this.color= color;
	}
	

	//GETTER Y SETTER 
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Moto de tipo: "+tipo+" con matricula "+matricula+" con modelo "+modelo+" color "+color;
	
	}
}
