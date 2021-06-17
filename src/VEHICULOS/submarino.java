package VEHICULOS;

public class submarino extends Acuaticos{
	
	//ATRIBUTO
	private int profMax;
	
	//CONSTRUCTOR POR DEFECTO
	public submarino() {
		super();
	}
	
	//CONSTRUCTOR
	public submarino(String tipo, String matricula, String modelo, int eslora, int profMax) {
		super(tipo, matricula, modelo, eslora);
		this.profMax= profMax;
	}

	//GETTER Y SETTER 
	public int getProfMax() {
		return profMax;
	}

	public void setProfMax(int profMax) {
		this.profMax = profMax;
	}

	@Override
	public String toString() {
		return "Submarino profMax= " + profMax + " tipo= " + tipo + " matricula= " + matricula + " modelo= " + modelo;
	}
	
	
}

