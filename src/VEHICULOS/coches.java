package VEHICULOS;

public class coches extends Terrestres {

		private boolean aireAcondicionado;
		
		//CONSTRUCTOR POR DEFECTO
		public coches() {
			super();
		}
		
		//CONSTRUCTOR
		public coches(String tipo, String matricula, String modelo, int numRueda, boolean aireAcondicionado) {
			super(tipo, matricula, modelo, numRueda);
			this.aireAcondicionado= aireAcondicionado;
		}

		//GETTER Y SETTER 
		public boolean isAireAcondicionado() {
			return aireAcondicionado;
		}

		public void setAireAcondicionado(boolean aireAcondicionado) {
			this.aireAcondicionado = aireAcondicionado;
		}

		@Override
		public String toString() {
			return "Coche aireAcondicionado= " + aireAcondicionado + "tipo= " + tipo + " matricula= " + matricula+ " modelo= " + modelo;
		}
}
		
		
