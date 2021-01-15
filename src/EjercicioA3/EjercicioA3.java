package EjercicioA3;

import ejercicio1_1.Punto;

public class EjercicioA3 {
	public static void main (String []args) {
		int resultadop1;
		int lado1;
		int lado2;
		int lado3;
		int lado4;
		
		Rectangulo p1=new Rectangulo();
		p1.x1=0;
		p1.y1=0;
		p1.x2=5;
		p1.y2=5;
		Rectangulo p2=new Rectangulo();
		p2.x1=7;
		p2.y1=9;
		p2.x2=2;
		p2.y2=3;
		
		lado1=p1.x2-p1.x1;
		lado2=p1.y2-p1.y1;
		lado3=p2.x2-p2.x1;
		lado4=p2.y2-p2.y1;
		
		System.out.println("x= "+p1.x1+" y= "+p1.y1);
		System.out.println("x= "+p1.x2+" y= "+p1.y2);
		System.out.println(" ");
		

		

		System.out.println("areas= "+(lado1*lado2));
		System.out.println("perimetro= "+(lado1*2+lado2*2));
		System.out.println(" ");
		
		System.out.println("x= "+p2.x1+" y= "+p2.y1);
		System.out.println("x= "+p2.x2+" y= "+p2.y2);
		System.out.println(" ");
		System.out.println("areas= "+(lado3*lado4));
		System.out.println("perimetro= "+(lado3 *2+lado4*2));

		
		
	}
}
