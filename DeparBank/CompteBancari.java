package DeparBank;

public class CompteBancari {

	
	    
	    // Definición
	
	    private int numeroCuenta;
	    private double saldo;
	    
	    public CompteBancari(int cuenta, double inicial) {
	        numeroCuenta = cuenta;
	        saldo = inicial;
	    } 

	    public void depositar(double cantidad) {
	        saldo = saldo + cantidad;
	    } 

	    public void retirar(double cantidad) {
	        saldo = saldo - cantidad;
	    } 

	    public double saldo() {
	        return saldo;
	    }    
	    
	
}
