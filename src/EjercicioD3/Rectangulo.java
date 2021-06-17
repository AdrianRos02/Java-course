package EjercicioD3;

public class Rectangulo {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int X1Y1;
	private int X2Y2;
	private int All;
	private int Perimetro;
	private int Area;
	
	public int getx1() {
		return x1;
		
	}
	public int gety1() {
		return y1;
		
	}
	public int getx2() {
		return x2;
		
	}
	public int gety2() {
		return y2;
		
	}
	public int getX1Y1() {
		return X1Y1;
		
	}
	public int getX2Y2() {
		return X2Y2;
		
	}

	public int getAll() {
		return All;
		
	}

	public int getPerimetro() {
		return Perimetro;
		
	}
	public int getArea() {
	
		return Area;
		
	}
	
	public void setx1(int x1) {
		this.x1=x1;
	}	
	public void setx2(int x2) {
		this.x2=x2;
	}	
	public void sety1(int y1) {
		this.y1=y1;
	}	
	public void sety2(int y2) {
		this.y2=y2;
	}	
	public void setX1Y1(int X1,int Y1) {
		this.X1Y1=X1;
		this.X1Y1=Y1;
		
	}
	public void setX2Y2(int X2,int Y2) {
		this.X2Y2=X2;
		this.X2Y2=Y2;
		
	}
	public void setAll(int X1,int Y1,int X2,int Y2) {
		this.All=X1;
		this.All=X2;
		this.All=Y1;
		this.All=Y2;
	}
	
	//IMPRIMIR
	
	public void imprime() {
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(x2);
		System.out.println(y2);
		System.out.println(X1Y1);
		System.out.println(X2Y2);
		System.out.println(All);
	}
}
