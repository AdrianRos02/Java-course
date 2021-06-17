package EmpresaYEmpleados;

import java.util.ArrayList;

public class Empresas{

	//VARIABLES
	String nombre;
	int CIF;
	int telefono;
	String direccion;
	int empleados;
	
	
	ArrayList empresa = new ArrayList();
	//CONSTRUCTOR
	public Empresas(String nombre,int CIF,int telefono,String direccion,int empleados) {
		this.nombre=nombre;
		this.CIF=CIF;
		this.telefono=telefono;
		this.direccion=direccion;
		this.empleados=empleados;
		
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCIF() {
		return CIF;
	}

	public void setCIF(int cIF) {
		CIF = cIF;
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

	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public ArrayList getEmpresa() {
		return empresa;
	}

	public void setEmpresa(ArrayList empresa) {
		this.empresa = empresa;
	}

	//METODOS
	public void AñadirEmp(Empleados emp1) {
	
		
		this.empresa.add(emp1);
	
	}
	public void EliminarEmp(Empleados emp1) {
		this.empresa.remove(emp1);
	}
	
	public void Mostrar() {	
		System.out.println(this.empleados);
	}
	
	public void informacionEmp() {
		
	}
	public void sumaBrutos() {
		
	}
	public void sumarNetos() {
		
	}
}
