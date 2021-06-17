package Astros;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class AstrosMain {

	public static void main(String[] args) {
	
		int opcn= 0;

		PrintWriter salida= null;
		ArrayList <Astros> astros = new ArrayList <Astros>();
		
		Scanner leer = new Scanner(System.in);
		
		Planetas Venus = new Planetas ("Venus", "2000000 Kg", "150900 Km", "8h", "-170 °C", "8m/s", "93493493939 Km", "70 años", true);
		Planetas Neptuno = new Planetas ("Neptuno", "4040404040 Kg", "567989Km", "12h", "-536°C", "21 m/s", "254252525 Km", "50 años", false);
		Planetas Urano = new Planetas ("Urano", "9999999 Kg", "10000 Km", "35h", "-36 °C", "8 m/s", "525252525 Km", "3 años", false);

		Satelites Luna = new Satelites ("Luna", "2000 Kg", "7986 Km", "6h", "-56 °C", "1 m/s", "62 Km", "4 días terrestres", "Tierra");
		Satelites Mimas = new Satelites ("Mimas", "53535353 Kg", "606 Km", "131h", "20 °C", "8 m/s", "294 Km", "2 días ", "Saturno");
		Satelites Calisto = new Satelites ("Calisto", "4364646 Kg", "30Km", "20h", "-70 °C", "9 m/s", "23 Km", "1 dia", "Jupiter");
				
		astros.add(Venus);
		astros.add(Neptuno);
		astros.add(Urano);
		astros.add(Luna);
		astros.add(Mimas);
		astros.add(Calisto);
		

		try {
			
			salida = new PrintWriter("Astros.txt");
			
			do {
		
				System.out.println("Planetas y Satelites");
				for (Astros astros2 : astros) {
			
					System.out.println("Planeta y Satelite: " + astros2.nombre);	
				}
				System.out.println("Salir");
			
				do {
					System.out.println("Seleccione un numero");
					opcn= leer.nextInt();
				}while(opcn > 7 || opcn < 1);
			
				switch (opcn) {
					case 1: System.out.println(
							Venus.toString());
							salida.print(Venus.toString());
							break;
				
					case 2: System.out.println(Neptuno.toString());
							salida.print(Neptuno.toString());
							break;
						
					case 3: System.out.println(Urano.toString());
							salida.print(Urano.toString());
							break;
						
					case 4: System.out.println(Luna.toString());
							salida.print(Luna.toString());
							break;
						
					case 5: System.out.println(Mimas.toString());
							salida.print(Mimas.toString());
							break;
						
					case 6: System.out.println(Calisto.toString());
							salida.print(Calisto.toString());
							break;
						
					case 7: System.out.println("salida");
							System.exit(0);
				}
				salida.flush();
			
			}while(opcn != 7);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error");
		}
		finally {
			salida.close();
		}
		
	}

}
