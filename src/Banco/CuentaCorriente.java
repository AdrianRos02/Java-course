package Banco;

public class CuentaCorriente extends CuentaBancaria {

	
	//VARIABLES
	int iban;
	double saldo;
	double interesAnualBasico;
	private final int max = 100;
	 private float Moviments [] = new float [max];
   private int nMoviments =0;
	
	
	
	
	//Constructor
	public CuentaCorriente(int iban,double saldo,double interesAnualBasico) {
		super(iban,saldo,interesAnualBasico);
		this.iban=iban;
		this.saldo=saldo;
		this.interesAnualBasico=interesAnualBasico;
		
		
	}
	
	
	
	
	
	public String consultarAtributos() {
		String consulta;
		consulta = "Numero de cuenta :" + iban + " Con saldo: "+saldo+"  Con un interes basico de "+ interesAnualBasico;
			return consulta;
	}
	

	public void ingresarDinero(int añadir) {
		this.saldo = this.saldo + añadir;
		
		System.out.println("Ingreso de: "+añadir+" Total: "+saldo);
		
	}
	
	public void retirarDinero(int añadir) {
		this.saldo = this.saldo - añadir;
		
		System.out.println("Retirada de: "+" Total:"+this.saldo);
	
	}
	
		

	@Override	
	public void calcularIntereses() {
		
		
		System.out.print("Calculo total de Interes + el minimo: "+(this.saldo+interesAnualBasico));
		
		
		
	}
	
	
	
}
