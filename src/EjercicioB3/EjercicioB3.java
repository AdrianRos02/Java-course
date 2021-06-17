package EjercicioB3;



public class EjercicioB3 {
	public static void main (String []args) {
		int resultadop1;
		int lado1;
		int lado2;
		int lado3;
		int lado4;
		
		Rectangulo p1=new Rectangulo(0,0,5,5);

		Rectangulo p2=new Rectangulo(7,9,6,3);

		
		lado1=p1.x2-p1.x1;
		lado2=p1.y2-p1.y1;
		lado3=p2.x2-p2.x1;
		lado4=p2.y2-p2.y1;
		

        System.out.println("Coordenadas del rectángulo 1 (" + p1.x1 + "," + p1.y1 + ") y (" + p1.x2 + "," + p1.y2 + ")");
        System.out.println("Coordenadas del rectángulo 2 (" + p2.x1 + "," + p2.y1 + ") y (" + p2.x2 + "," + p2.y2 + ")");
        System.out.println("El perímetro del rectángulo 1 es: " + perimetro(p1));
        System.out.println("El perímetro del rectángulo 2 es: " + perimetro(p2));
        System.out.println("El área del rectángulo 1 es: " + area(p1));
        System.out.println("El área del rectángulo 2 es: " + area(p2));
        System.out.println("");

    }

    public static double perimetro(Rectangulo rect) {
         int lado1 = Math.abs(rect.x1 - rect.x2);
         int lado2 = Math.abs(rect.y1 - rect.y2);

        return (lado1 + lado2) * 2;
    }

    public static double area(Rectangulo rect) {
        int lado1 = Math.abs(rect.x1 - rect.x2);
        int lado2 = Math.abs(rect.y1 - rect.y2);

        return lado1 * lado2;
    }

		
	}

