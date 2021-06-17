package Banco;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{



	public static void main (String []args) {
		
		int opcion=0;
		int cantidad=0;
		double total1;
		double total2;
		
		Scanner teclado=new Scanner(System.in);	
		
		CuentaBancaria adrian=new CuentaCorriente(10, 10, 10);
		CuentaBancaria jose =new CuentaAhorro(30,20,10);
		
		while (opcion<5){
			
			System.out.println("1.CONSULTAR CUENTA");
			System.out.println("2.INGRESAR");
			System.out.println("3.RETIRAR");
			System.out.println("4.TRANSPASAR");
			System.out.println("5.CALCULAR INTERES");
		
		opcion=teclado.nextInt();
		
		switch(opcion) {
		
		case 1: 	
			System.out.println(adrian.consultarAtributos());
			System.out.println(jose.consultarAtributos());
		break;
		case 2:
			System.out.println (" ");
			System.out.println ("Saldo disponible: " + adrian.getsaldo());
			System.out.println ("Introduce cantidad a ingresar: " );
			cantidad = teclado.nextInt();
			adrian.ingresarDinero(cantidad);
		break;
		
		case 3:
			System.out.println (" ");
			System.out.println ("Saldo disponible: " + adrian.getsaldo());
			System.out.println ("Introduce cantidad a retirar: " );
			cantidad = teclado.nextInt();
			adrian.retirarDinero(cantidad);
			
		break;
		
		case 4:
			System.out.print("Dinero transpaso: ");
			cantidad = teclado.nextInt();
			adrian.transpasarDinero(cantidad, jose);
			
			

		break;
		
		case 5:
			
			adrian.calcularIntereses();
			jose.calcularIntereses();
	
			break;
	
		}
		}
	}
}
