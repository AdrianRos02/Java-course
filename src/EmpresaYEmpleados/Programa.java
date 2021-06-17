package EmpresaYEmpleados;
import java.util.ArrayList;

public class Programa {
	
	public static void main(String []args) {
		
		//Crear Empleados
		Empleados adrian=new Empleados("adrian", 987654322, 1200, 20, 987654343, "calle plana",1200);
		Empleados jose=new Empleados("jose", 286462432, 1100, 24, 465464343, "calle pepe",1400);
		Empleados pepe=new Empleados("pepe", 757757567, 2000, 40, 829546242, "calle ancha",2400);
		
		
		
		//Crear Empresas
		Empresas emp1=new Empresas("Bifazna", 23583672, 67252642, "calle rivalta", 2);
		Empresas emp2=new Empresas("zasca", 46446474, 1242535, "calle haz", 4);
		Empresas emp3=new Empresas("prefacty", 3653636, 224254235, "calle proper", 3);

		//Añadir empleados
		emp1.AñadirEmp(adrian);
		emp2.AñadirEmp(jose);
		emp3.AñadirEmp(pepe);
		
		//Eliminar empleados
		emp3.EliminarEmp(pepe);
		emp3.AñadirEmp(jose);
		
		// EMPLEADOS DE CADA EMPRESA
				System.out.println("La empresa 1 tiene a " + emp1.getEmpresa());
				System.out.println("La empresa 2 tiene a " + emp2.getEmpresa());
				System.out.println("La empresa 3 tiene a " + emp3.getEmpresa());
				
		
				
		// SALARIO NETO DE CADA EMPLEADO
				System.out.println("El salario neto de " + adrian.getNombre() + " es de " + adrian.calculoSalarioNeto(adrian.getSueldo()) + "€");
				System.out.println("El salario neto de " + jose.getNombre() + " es de " + jose.calculoSalarioNeto(jose.getSueldo()) + "€");
				System.out.println("El salario neto de " + pepe.getNombre() + " es de " + pepe.calculoSalarioNeto(pepe.getSueldo()) + "€");
			}
	}


