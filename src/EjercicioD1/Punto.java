package EjercicioD1;

public class Punto {
	
private int x;

private int y;

public Punto(int x,int y) {
	this.x = x;
	this.y = y;
	
}

public int getX() {
	return x;
	
}

public int getY() {
	return y;
	
}

public void setX(int x) {
	this.x=x;
}

public void setY(int y) {
	this.y=y;
	
}

public void imprime() {
	System.out.println(x);
	System.out.println(y);
}

public void setXY(int x, int y) {
	this.x=x;
	this.y=y;
	
}

public void desplazaXY(int dx, int dy) {
	System.out.println(dx);
	System.out.println(dy);
	  this.x += dx;
      this.y += dy;
}


	
public double distancia(Punto p) {
        return Math.sqrt(this.x - p.x) + (this.y - p.y );
	
	
}




}
