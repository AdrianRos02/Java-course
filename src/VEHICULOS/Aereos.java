package VEHICULOS;

public abstract class Aereos extends Vehiculos{
	
	//ATRIBUTO
	private int numAsientos;
	
	//CONSTRUCTOR POR DEFECTO
	public Aereos() {
		super();
	}
	
	//CONSTRUCTOR
	public Aereos(String tipo, String matricula, String modelo, int numAsientos) {
		super(tipo, matricula, modelo);
		this.numAsientos= numAsientos;
	}

	//GETTER Y SETTER 
	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
}
