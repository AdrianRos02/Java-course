package VEHICULOS;

public abstract class Vehiculos {

	protected String tipo;
	protected String matricula;
	protected String modelo;
	//CONSTRUCTOR POR DEFECTO
		public Vehiculos() {
			
		}
		
		//CONSTRUCTOR
		public Vehiculos(String tipo, String matricula, String modelo) {
			this.tipo= tipo;
			this.matricula= matricula;
			this.modelo= modelo;
		}
}
