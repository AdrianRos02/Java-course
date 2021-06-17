package Banco;
import java.util.Scanner;

public abstract class CuentaBancaria {

	Scanner teclado=new Scanner(System.in);
	//VARIABLES
	
	int iban;
	double saldo;
	double interesAnualBasico;
	private final int max = 100;
	 private float Moviments [] = new float [max];
    private int nMoviments =0;
	private Object total1;
	
	
	//CONSTRUCTOR
	
	public CuentaBancaria(int iban,double saldo,double interesAnualBasico) {
		
		
	}
	
	
	//GETTERS Y SETTERS
	
	public double getiban() {
		return iban;
	}
	public void setiban(int iban) {
		this.iban=iban;
	}
	
	public double getsaldo() {
		return saldo;
	}
	public void setsaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public double getinteresAnualBasico() {
		return interesAnualBasico;
	}
	public void interesAnualBasico(double interesAnualBasico) {
		this.interesAnualBasico=interesAnualBasico;
	}
	
	
	//METODOS
	
	
	public abstract String consultarAtributos() ;
		

	
	private void añadir(int añadir) {
		 this.saldo=this.saldo+añadir;
		
		
		}
	public void ingresarDinero(int añadir) {
		this.saldo = this.saldo + añadir;
		System.out.println("Ingreso de: "+añadir+" Total: "+this.saldo);
		
	}
	
	public void retirarDinero(int añadir) {
		this.saldo = this.saldo - añadir;
		
		System.out.println("Retirada de: "+añadir + " Total:"+this.saldo);
	}
	
	public void transpasarDinero(int añadir, CuentaBancaria cc ) {
	
		this.retirarDinero(añadir);
		cc.ingresarDinero(añadir);
		
	}
		
	public abstract void calcularIntereses() ;
	
	
	
}
