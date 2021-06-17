package EjercicioD3;


public class EjercicioC3 {
	public static void main (String []args) {
		int resultadop1;
		int lado1;
		int lado2;
		int lado3;
		int lado4;
		
		
		Rectangulo p1=new Rectangulo();
		p1.setx1(0);
		p1.sety1(0);
		p1.setx2(5);
		p1.sety2(5);
		p1.setX1Y1(0,0);
		p1.setX2Y2(5,5);
		p1.setAll(0, 0, 5, 5);
		Rectangulo p2=new Rectangulo();
		p2.setx1(7);
		p2.sety1(9);
		p2.setx2(2);
		p2.sety2(3);
		p2.setX1Y1(7,9);
		p2.setX2Y2(2,3);
		p2.setAll(7, 9, 2, 3);
		
		lado1=p1.getx2()-p1.getx1();
		lado2=p1.gety2()-p1.gety1();
		lado3=p2.getx2()-p2.getx1();
		lado4=p2.gety2()-p2.gety1();
		
		System.out.println("x= "+p1.getx1()+" y= "+p1.gety1());
		System.out.println("x= "+p1.getx2()+" y= "+p1.gety2());
		System.out.println(" ");
		

		

		System.out.println("areas= "+(lado1*lado2));
		System.out.println("perimetro= "+(lado1*2+lado2*2));
		System.out.println(" ");
		
		System.out.println("x= "+p2.getx1()+" y= "+p2.gety1());
		System.out.println("x= "+p2.getx2()+" y= "+p2.gety2());
		System.out.println(" ");
		System.out.println("areas= "+(lado3*lado4));
		System.out.println("perimetro= "+(lado3 *2+lado4*2));
		
		
		
		p1.imprime();
		p2.imprime();

		
		
	}
}
