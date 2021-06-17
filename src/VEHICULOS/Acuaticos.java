package VEHICULOS;

public abstract class Acuaticos extends Vehiculos{
	
	//ATRIBUTO
	private int eslora;
	
	//CONSTRUCTOR POR DEFECTO
	public Acuaticos() {
		super();
	}
	
	//CONSTRUCTOR
	public Acuaticos(String tipo, String matricula, String modelo, int eslora) {
		super(tipo, matricula, modelo);
		this.eslora= eslora;
	}

	//GETTER Y SETTER
	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
}
