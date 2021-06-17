package EjercicioD4;

public class Articulo {

   private String nombre;
   private double precio;
   private int iva;
   private int cuantosQuedan;
   private int PVP;
   

    public Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
     
    	if (nombre.equals("")) {
            System.out.println("ERROR: El nombre no puede estar vacío");
        } else if (precio <= 0) {
            System.out.println("ERROR: El precio no puede ser menor o igual a cero");
        } else if (iva != 21) {
            System.out.println("ERROR: El iva debe ser el 21%");
        } else if (cuantosQuedan < 0) {
            System.out.println("ERROR: El stock no puede ser menor que cero");
        } else {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        }
    	
    }
    	   public String getnombre() {
    		   return nombre;
    	   }
    	   public double getprecio() {
    		   return precio;
    	   }
    	   public int getiva() {
    		   return iva;
    	   }
    	   public int getcuantosQuedan() {
    		   return cuantosQuedan;
    	   }
    	   public double getPVP() {
    	        return this.precio + (this.precio / 100.0 * this.iva);
    	   }
    		
    	   
    	   
    	   public void setnombre(String nombre) {
    		   this.nombre="nombre";
    	   }
    	   public void setprecio(int precio) {
    		   this.precio=precio;
    	   }
    	   public void setiva(int iva) {
    		   this.iva=iva;
    	   }
    	   public void setcuantosQuedan(int cuantosQuedan) {
    		   this.cuantosQuedan=cuantosQuedan;
    	   }
    	   
    	   public boolean vender(int unidades) {
    	        int cuantos = this.getcuantosQuedan();
    	        
    	        if (unidades > cuantos) {
    	            return false;
    	        } 
    	        else {
    	            this.setcuantosQuedan(cuantos - unidades);
    	            return true;
    	        }
    	    }
    	   
    	   public boolean almacenar(int unidades) {
    	        int cuantos = this.getcuantosQuedan();
    	        if (cuantos + unidades > 0) {
    	            this.setcuantosQuedan(cuantos + unidades);
    	            return true;
    	        } else {
    	            return false;
    	        }
    	   }
    	   
    	   //IMPRIMIR
    	   public void imprime() {
    			System.out.println(nombre);
    			System.out.println(precio);
    			System.out.println(iva);
    			System.out.println(cuantosQuedan);
    		
    		}
    

}
