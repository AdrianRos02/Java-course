package ejercicio1_1;

public class EjercicioA1 {
public static void main (String []args) {
	int resultadop1;
	
	Punto p1=new Punto();
	p1.x=5;
	p1.y=0;
	Punto p2=new Punto();
	p2.x=10;
	p2.y=10;
	Punto p3=new Punto();
	p3.x=-3;
	p3.y=7;
	
	System.out.println("x= "+p1.x+" y= "+p1.y);
	System.out.println("x= "+p2.x+" y= "+p2.y);
	System.out.println("x= "+p3.x+" y= "+p3.y);
	
	System.out.println(p1.x + p1.y);
	System.out.println(p2.x - p2.y);
	System.out.println(p3.x * p2.y);
	System.out.println(p2.x / p2.y);
	
}
}
