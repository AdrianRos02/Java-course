

public class probar2 {

public static void main(String[] args) {
		
		int i = 1, j = 1, k = 1;
		i=1;
		j=1;
		k=1;
		
		
		i = i + j++;
			
		 System.out.println(" i = "+ i + ", j= "+ j +", k= "+ k ); 
		 i=2;
		 j=2;
		 k=1;
			
			
		 i = j + ++k;
		 System.out.println(" i = "+ i + ", j= "+ j +", k= "+ k ); 
		 i=4;
		 j=2;
		 k=2;
		
			
		 i = ++j + k++; 
		 System.out.println(" i = "+ i + ", j= "+ j +", k= "+ k );
		 i=5;
		 j=3;
		 k=3;
			
			
		 i = k + 1 + ++j;
		 System.out.println(" i = "+ i + ", j= "+ j +", k= "+ k ); 
		 i=8;
		 j=4;
		 k=3;

			
		 i = ++i + --j + k--;
		 System.out.println(" i = "+ i + ", j= "+ j +", k= "+ k ); 
		 i=15;
		 j=3;
		 k=2;
		}
}


