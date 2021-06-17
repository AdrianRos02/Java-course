package minicalculadora;


public class complejos {

	private double rel;
	
	private double im;
	
	private complejos vector [] = new complejos [100];
	
	
	
	public complejos (double rel, double im) {
		
		this.rel = rel;
		
		this.im= im;
	}

	
	public double getRel () {
		return rel;
	}
	
	public double getIm () {
		return im;
	}
	
	/*Sumar*/
	
	public String suma (complejos c) {
		
		String solucion;
		
		double x =this.rel + c.rel;
		
		double y = this.im + c.im;
		
		solucion =  x + " + " + y + "i";

		
		return solucion;
		
	}
	
	/*Resta*/
	
	public String resta (complejos c) {
		
		String solucion;
		
		double x =this.rel - c.rel;
		
		double y = this.im - c.im;
		
		solucion =  x + " + " + y + "i";
		
		return solucion;
		
	}
	
	/*Multiplicacion*/
	
	public String multiplicar (complejos c) {
		
		String solucion;
		
		double x =this.rel /*a*/ * c.rel; /*c*/ /*a*c*/
		
		double y = this.im /*b*/ * c.im; /*d*/ /*b*d*/
		
		double z = this.rel /*a*/ * c.im; /*d*/ /*a*d*/
		
		solucion =  (x-y) + " + " + (z+x) + "i";
		
		return solucion;
		
	}
	
	/*Division*/
	
	public String division (complejos c) {
		
		String solucion;
		
		double x =this.rel /*a*/ * c.rel; /*c*/ /*a*c*/
		
		double y = this.im /*b*/ * c.im; /*d*/ /*b*d*/
		
		double z = this.rel /*a*/ * c.im; /*d*/ /*a*d*/
		
		double w = this.im /*b*/ * c.rel; /*c*/ /*b*c*/
		
		solucion =  (x+y)/(c.rel*c.rel + c.im*c.im) + " + " + (w+z)/(c.rel*c.rel + c.im*c.im) + "i";
		
		return solucion;
		
	}
	
	/*Imprimir*/
	
	
	public void imprimir () {
		System.out.println ("El primer numero es: " + this.rel);
		System.out.println ("El segundo numero es: " + this.im + "i");
		System.out.println (" ");
	}
	
	
}

				

	
	/*cv[i]=tal*/

