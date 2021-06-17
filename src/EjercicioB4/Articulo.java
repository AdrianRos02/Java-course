package EjercicioB4;


public class Articulo {

    String nombre;
    double precio;
    int iva;
    int cuantosQuedan;

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

}
