package Astros;

public class Astros {
	
	protected String masa;
	protected String diametro;
	protected String rotacionEje;
	protected String temperatura;
	protected String gravedad;
	protected String nombre;
	
	public Astros() {
		
	}
	
	public Astros(String nombre, String masa, String diametro, String rotacionEje, String temperatura, String gravedad) {
		this.nombre= nombre;
		this.masa= masa;
		this.diametro= diametro;
		this.rotacionEje= rotacionEje;
		this.temperatura= temperatura;
		this.gravedad= gravedad;
	}
	
}
