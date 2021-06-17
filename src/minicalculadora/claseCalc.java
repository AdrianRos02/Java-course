package minicalculadora;

public class claseCalc {


		private double r;
		private double i;

		
		
		public claseCalc(double x, double y) {
			
			this.r=x;
			this.i=y;
			
		}
		/*public double geti() {
			return i;
			
		}
		public double getr() {
			return r;
			
		}

*/	
	
		
		
		public void imprime(double r,double i) {
			
	
			System.out.println(r +" "+i+"i");
			
			
		}
		
		
		public void suma(claseCalc c2) {
			
			double res=this.r+c2.r;
			double res1=this.i+c2.i;			
			imprime(res,res1);
			
			
		}
		
		public void resta(claseCalc c2) {
			
			double res=this.r-c2.r;
			double res1=this.i-c2.i;
			imprime(res,res1);
		}
	
	public void multiplicacion(claseCalc c2) {
			
			double res=this.r*c2.r;
			double res1=this.i*c2.i;
			imprime(res,res1);
		}
		
	public void division(claseCalc c2) {
		
		double res=this.r/c2.r;
		double res1=this.i/c2.i;
		imprime(res,res1);
	}
		
}
