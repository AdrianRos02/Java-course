package VEHICULOS;

public class barcos extends Acuaticos{
	
	//ATRIBUTO
	private boolean motor;
	
	//CONSTRUCTOR POR DEFECTO
	public barcos() {
		super();
	}
	
	//CONSTRUCTOR
	public barcos(String tipo, String matricula, String modelo, int eslora, boolean motor) {
		super(tipo, matricula, modelo, eslora);
		this.motor= motor;
	}

	//GETTER Y SETTER
	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Barco motor=" + motor + " tipo=" + tipo + " matricula=" + matricula + " modelo=" + modelo ;
	}
	
	
}
