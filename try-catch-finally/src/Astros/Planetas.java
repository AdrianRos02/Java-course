package Astros;

public class Planetas extends Astros{
	
	private String distanciaSol;
	private String orbitaSol;
	private boolean tieneSatelites;

	public Planetas() {
		super();
	}
	public Planetas(String nombre, String masa, String diametro, String rotacionEje, String temperatura, String gravedad, String distanciaSol, String orbitaSol, boolean tieneSatelites) {
		super(nombre, masa, diametro, rotacionEje, temperatura, gravedad);
		
		this.distanciaSol= distanciaSol;
		this.orbitaSol= orbitaSol;
		this.tieneSatelites= tieneSatelites;
	}
	
	public String getDistanciaSol() {
		return distanciaSol;
	}
	public void setDistanciaSol(String distanciaSol) {
		this.distanciaSol = distanciaSol;
	}
	public String getOrbitaSol() {
		return orbitaSol;
	}
	public void setOrbitaSol(String orbitaSol) {
		this.orbitaSol = orbitaSol;
	}
	public boolean isTieneSatelites() {
		return tieneSatelites;
	}
	public void setTieneSatelites(boolean tieneSatelites) {
		this.tieneSatelites = tieneSatelites;
	}

	@Override
	public String toString() {
		return "Planeta " + nombre + "\n Masa= " + masa + "\n Gravedad= " + gravedad + "\n Distancia Sol= " + distanciaSol
				+ "\n Orbita Sol= " + orbitaSol + "\n Diametro= " + diametro + "\n Satelites= "
				+ tieneSatelites + "\n Diametro=" + diametro + "\n RotacionPropioEje="
				+ rotacionEje + "\n Temperatura= " + temperatura;
	}
	
	
	
}
