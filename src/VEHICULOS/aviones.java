package VEHICULOS;

public class aviones extends Aereos{
	
	//ATRIBUTO
	private int tiempoMaxVuelo;
	
	//CONSTRUCTOR POR DEFECTO
	public aviones() {
		super();
	}
	
	//CONSTRUCTOR
	public aviones(String tipo, String matricula, String modelo, int numAsientos, int tiempoMaxVuelo) {
		super(tipo, matricula, modelo, numAsientos);
		this.tiempoMaxVuelo= tiempoMaxVuelo;
	}

	//GETTER Y SETTER 
	public int getTiempoMaxVuelo() {
		return tiempoMaxVuelo;
	}

	public void setTiempoMaxVuelo(int tiempoMaxVuelo) {
		this.tiempoMaxVuelo = tiempoMaxVuelo;
	}

	@Override
	public String toString() {
		return "Avion tiempoMaxVuelo= " + tiempoMaxVuelo + " tipo= " + tipo + " matricula= " + matricula + " modelo= "+ modelo ;
	}
	
	
}