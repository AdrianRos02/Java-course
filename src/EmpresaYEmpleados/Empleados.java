package EmpresaYEmpleados;

public class Empleados {
	
	//VARIABLES
	private String nombre;
	int DNI;
	double sueldobruto;
	int edad;
	int telefono;
	String direccion;
	int IRPF;
	double sueldobrutoAnual;
	double sueldo;
	
	
	
	//Getters y setters
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}
		
	public double getSueldobruto() {
		return sueldobruto;
	}

	public void setSueldobruto(double sueldobruto) {
		this.sueldobruto = sueldobruto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getIRPF() {
		return IRPF;
	}

	public void setIRPF(int iRPF) {
		IRPF = iRPF;
	}

	public double getSueldobrutoAnual() {
		return sueldobrutoAnual;
	}

	public void setSueldobrutoAnual(double sueldobrutoAnual) {
		this.sueldobrutoAnual = sueldobrutoAnual;
	}

	
	//CONSTRUCTOR


	public Empleados(String nombre,int DNI,double sueldobruto,	int edad,int telefono,String direccion,double sueldo) {
		this.nombre=nombre;
		this.DNI=DNI;
		this.sueldobruto=sueldobruto;
		this.edad=edad;
		this.telefono=telefono;
		this.direccion=direccion;
		this.sueldo= sueldo;
		
	}
	
	
	//METODOS
	
	public void imprimir() {
		
		System.out.println(" Nombre: "+nombre+" Con DNI "+DNI+" Con sueldo "+sueldobruto+" Con edad: "+edad+" Telf: "+telefono+" Direccion: "+direccion);
	}
	
public double calculoSalarioNeto(double sueldo) {
		
		//IRPF SEGÚN EL SUELDO
		int irpf=0;
		double salarioNeto;
		if(sueldo < 12000) {
			irpf= 20;
		}
		
		if(sueldo >= 12000 && this.sueldo <= 25000) {
			irpf= 30;
		}
		
		if(sueldo > 25000) {
			irpf= 40;
		}
		
		//CÁLCULO DEL SALARIO NETO
		salarioNeto= sueldo - (sueldo * (irpf/100));
		
		return salarioNeto;
	}
	
	@Override
	public String toString() {
		return nombre + ", con un sueldo de " + sueldo + "€ dni: " + DNI +" su sueldo bruto es de " + sueldobruto+" tiene " + edad + " años  telefono : " + telefono + " direccion " + direccion;
	}
	
	
}

