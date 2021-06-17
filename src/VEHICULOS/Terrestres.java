package VEHICULOS;

public abstract class Terrestres extends Vehiculos{
	
	//ATRIBUTO
	private int numRuedas;

	//CONSTRUCTOR POR DEFECTO;
	public Terrestres() {
		super();
	}
	
	//CONSTRUCTOR
	public Terrestres(String tipo, String matricula, String modelo, int numRuedas) {
		super(tipo, matricula, modelo);
		this.numRuedas= numRuedas;
	}

	//GETTER Y SETTER
	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
}