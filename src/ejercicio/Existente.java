package ejercicio;

public class Existente {

	public static boolean existe(int vector[], int x) {
		
		boolean exist=false;
			for(int i=0;i<vector.length;i++) {
				if(vector[i]==x)
					exist=true;
		    }
		return exist;
	}
}
