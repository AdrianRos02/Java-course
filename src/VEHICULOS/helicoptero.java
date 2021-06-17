package VEHICULOS;

public class helicoptero extends Aereos{
	
	//ATRIBUTO
	private int numHelices;
	
	//CONSTRUCTOR POR DEFECTO
	public helicoptero() {
		super();
	}
	
	//CONSTRUCTOR
	public helicoptero(String tipo, String matricula, String modelo, int numAsientos, int numHelices) {
		super(tipo, matricula, modelo, numAsientos);
		this.numHelices= numHelices;
	}

	//GETTER Y SETTER 
	public int getNumHelices() {
		return numHelices;
	}

	public void setNumHelices(int numHelices) {
		this.numHelices = numHelices;
	}

	@Override
	public String toString() {
		return "Helicoptero numHelices= " + numHelices + " tipo= " + tipo + " matricula= " + matricula + " modelo= "+ modelo ;
	}
	
	
}
