package EjercicioD4;



public class EjercicioD4 {

	public static void main(String[] args) {

        Articulo a1 = new Articulo("Sudadera", 15, 21, 5);
        Articulo a2 = new Articulo("Pantalon", 20, 18, 10);

        System.out.println(a1.getnombre() + "  Precio: " + a1.getprecio() + "€  IVA: " + a1.getiva() + "%  PVP: " + (a1.getprecio() + (a1.getprecio() * a1.getiva() / 100)) + "€");
        System.out.println(a2.getnombre() + "  Precio: " + a2.getprecio() + "€  IVA: " + a2.getiva() + "%  PVP: " + (a2.getprecio() + (a2.getprecio() * a2.getiva() / 100)) + "€");

        a1.setnombre("Sudadera");
        a1.setprecio(0);
        a1.setprecio(30);

        a2.setiva(10);
        a2.setcuantosQuedan(-5);
        a2.setcuantosQuedan(0);

        
        if (a1.vender(1000)) {
            System.out.println("He vendido mil!");
        } else {
            System.out.println("No he vendido mil, se cancela la venta por falta de stock");
        }
        
        if (a1.vender(2)) {
            System.out.println("He vendido 2!");
        } else {
            System.out.println("No he vendido 2, se cancela la venta por falta de stock");
        }
        
        System.out.println("Voy a almacenar 3 mas");
        if (a1.almacenar(3)) {
            System.out.println("He almacenado 3!");
        } else {
            System.out.println("No he almacenado 3, no hay sitio");
        }
        System.out.println(a1.getnombre() + " Precio: " + a1.getprecio() + "€  IVA: " + a1.getiva() + "%  PVP: " + (a1.getprecio() + (a1.getprecio() * a1.getiva() / 100)) + "€");
        System.out.println(a2.getnombre() + "  Precio: " + a2.getprecio() + "€  IVA: " + a2.getiva() + "%  PVP: " + (a2.getprecio() + (a2.getprecio() * a2.getiva() / 100)) + "€");

    }
}

