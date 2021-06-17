package EjercicioC4;

public class Articulo {

   private String nombre;
   private double precio;
   private int iva;
   private int cuantosQuedan;
   

   public Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
       if (nombre.equals("")) {
           System.err.println("ERROR: Falta el nombre del articulo");
       } else if (precio <= 0) {
           System.err.println("ERROR: El precio es menor o igual a 0");
       } else if (iva != 21) {
           System.err.println("ERROR: El IVA tiene que ser un 21%");
       } else if (cuantosQuedan < 0) {
           System.err.println("ERROR: El stock no puede ser menor que cero");
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
    

}
