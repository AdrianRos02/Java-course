package Calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String args[]){
		
		 Scanner teclado=new Scanner(System.in); 
		

	claseCalc c1=new claseCalc(6,7);
	claseCalc c2=new claseCalc(3,2);
	
	
	/*int[] r =new int[10];
	claseCalc co=new claseCalc[10,6];
	
	for(int i=0;i<10;i++) {
		co[1]=new claseCalc[5,8];
		
	}*/
	
	/*System.out.println("CALCULADORA");
	System.out.println("1.SUMAR");
	System.out.println("2.RESTAR");
	System.out.println("3.MULTIPLICACION");
	System.out.println("4.DIVISION");
	*/
	
	
	c1.suma(c2);
	c1.resta(c2);
	c1.multiplicacion(c2);
	c1.division(c2);
	
	
	
	}
	}
