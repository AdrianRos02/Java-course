package Astros;

public class Satelites extends Astros{
	
	private String distanciaPlaneta;
	private String orbitaPlaneta;
	private String planetaPerteneciente;
	
	
	public Satelites() {
		super();
	}
	
	public Satelites(String nombre, String masa, String diametro, String rotacionEje, String temperatura, String gravedad, String distanciaPlaneta, String orbitaPlaneta, String planetaPerteneciente) {
		super(nombre, masa, diametro, rotacionEje, temperatura, gravedad);
		this.distanciaPlaneta= distanciaPlaneta;
		this.orbitaPlaneta= orbitaPlaneta;
		this.planetaPerteneciente= planetaPerteneciente;
	}
	
	
	public String getDistanciaPlaneta() {
		return distanciaPlaneta;
	}
	public void setDistanciaPlaneta(String distanciaPlaneta) {
		this.distanciaPlaneta = distanciaPlaneta;
	}
	public String getOrbitaPlaneta() {
		return orbitaPlaneta;
	}
	public void setOrbitaPlaneta(String orbitaPlaneta) {
		this.orbitaPlaneta = orbitaPlaneta;
	}
	public String getPlanetaPerteneciente() {
		return planetaPerteneciente;
	}
	public void setPlanetaPerteneciente(String planetaPerteneciente) {
		this.planetaPerteneciente = planetaPerteneciente;
	}

	@Override
	public String toString() {
		return "Satelite " + nombre + "\n Planeta Perteneciente= " + planetaPerteneciente + "\n Distancia al Planeta= " + distanciaPlaneta + "\n Orbita sobre el Planeta= " + orbitaPlaneta
				+ "\n Masa= " + masa + "\n Diametro= " + diametro
				+ "\n Rotacion sobre su propio eje= " + rotacionEje + "\n Temperatura= " + temperatura + "\n Gravedad= " + gravedad;
	}
	
	
}
