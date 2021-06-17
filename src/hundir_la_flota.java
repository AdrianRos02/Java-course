
import java.util.Scanner;

public class hundir_la_flota {
	
	Scanner teclado= new Scanner(System.in);
	
	
	//TABLERO
	
	
	public static void crear_mapa(char[][] t) {
		
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[0].length;j++) {
				t[i][j]='-';
			}
		}
		
	}
	
	
		
	public static void muestra_tablero (char[][] t) {
		
			int num=0;
			char let='A';
		
	
			
				for(int i=0;i<t[0].length;i++) {
					System.out.print("\t"+num+" ");
					num++;
				}
				System.out.println(" ");
				
						
		
		
		for(int i=0;i<t.length;i++) {
			System.out.print(let);
			for(int j=0;j<t[0].length;j++) {
				System.out.print("\t"+t[i][j]+" ");
				
			}
			System.out.println("");
			let++;
		}
		
		
	}
	
	
	public static int insertar_barcos(char [][] mapa,lancha.buque..){
		
	}
	
	public static boolean comprobar_Lancha (char [][] mapa, int x, int y) {
        boolean libre = true;

            if ((mapa[x][y] != '-' ) ) {
                libre = false;
            }
            return libre;
        }
	
	
    
    public static void lancha (char [][] mapa) {
        char lancha = 'L';
        
        int coordenadax =0;
        int coordenaday =0;
        boolean libre = false;
        do {
            coordenadax =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
            coordenaday =(int) (0 + Math.random() * (mapa[0].length-1 - 0 + 1));
             libre = comprobar_Lancha(mapa, coordenadax, coordenaday);
        }
        while (libre == false);

        if (libre == true) {
            mapa[coordenadax][coordenaday]='L';
            
        }
        }

       
       
     
	
    public static boolean comprobar_Buque (char [][] mapa, int x, int y) {
        boolean libre = true;

            if ((mapa[x][y] != '-' ) || (mapa[x][y+1] != '-') || (mapa[x][y+2] != '-') ) {
                libre = false;
            }
            return libre;
        }
	
	
    
    public static void buque (char [][] mapa) {
        char Buque = 'B';
        
        int coordenadax =0;
        int coordenaday =0;
        boolean libre = false;
        do {
            coordenadax =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
            coordenaday =(int) (0 + Math.random() * (mapa[0].length-3 - 0 + 1));
             libre = comprobar_Buque(mapa, coordenadax, coordenaday);
        }
        while (libre == false);

        if (libre == true) {
            mapa[coordenadax][coordenaday]='B';
            mapa[coordenadax][coordenaday+1]='B';
            mapa[coordenadax][coordenaday+2]='B';
        }
        }
		
    public static boolean comprobar_Acorazado (char [][] mapa, int x, int y) {
        boolean libre = true;
        
        
            if ((mapa[x][y] != '-' ) || (mapa[x][y+1] != '-') || (mapa[x][y+2] != '-') || (mapa[x][y+3] != '-') ) {
                libre = false;
            }
            return libre;
        }
	
	
    
    public static void acorazado (char [][] mapa) {
        char Acorazado = 'Z';
        
        int coordenadax =0;
        int coordenaday =0;
        boolean libre = false;
        do {
            coordenadax =(int) (0 + Math.random() * ((mapa.length-1) - 0 + 1));
            coordenaday =(int) (0 + Math.random() * ((mapa[0].length-4) - 0 + 1));
             libre = comprobar_Acorazado(mapa, coordenadax, coordenaday);
        }
        while (libre == false);

        if (libre == true) {
            mapa[coordenadax][coordenaday]='Z';
            mapa[coordenadax][coordenaday+1]='Z';
            mapa[coordenadax][coordenaday+2]='Z';
            mapa[coordenadax][coordenaday+3]='Z';
        }
        }
        
	
    public static boolean comprobar_Portaaviones (char [][] mapa, int x, int y) {
        boolean libre = true;
        
        

            if ((mapa[x][y] != '-' ) || (mapa[x+1][y] != '-') || (mapa[x+2][y] != '-') || (mapa[x+3][y] != '-')||  (mapa[x+4][y] != '-')) {
                libre = false;
            }
            return libre;
        }



   
    public static void portaaviones (char [][] mapa) {
        char Portaaviones = 'P';
        int coordenadax =0;
        int coordenaday =0;
        boolean libre = false;
        do {
            coordenadax =(int) (0 + Math.random() * (mapa.length-5 - 0 + 1));
            coordenaday =(int) (0 + Math.random() * (mapa[0].length-1 - 0 + 1));
             libre = comprobar_Portaaviones(mapa, coordenadax, coordenaday);
        }
        while (libre == false);

        if (libre == true) {
            mapa[coordenadax][coordenaday]='P';
            mapa[coordenadax+1][coordenaday]='P';
            mapa[coordenadax+2][coordenaday]='P';
            mapa[coordenadax+3][coordenaday]='P';
            mapa[coordenadax+4][coordenaday]='P';

        }
        }
	
	//BARCOS
	/*
	public static void barcos_standart (char [][] mapa, int Numero_lanchas ) {
		  char lancha = 'L';
	        int coordenadax =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
	        int coordenaday =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
	        
	      
	        mapa[coordenadax][coordenaday]=lancha;
	        
	        
            }
   }
	
	
	
	public static void buque (char [][] mapa){
        char buque = 'B';
        int coordenadax =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
        int coordenaday =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
        mapa[coordenadax][coordenaday]=buque;
        
        for(int i=1;i<=mapa.length;i++) {
            mapa[coordenadax][coordenaday]=buque;
            coordenadax++;
            }
        }

	public static void acorazado (char [][] mapa){
        char acorazado = 'Z';
        int coordenadax =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
        int coordenaday =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
        mapa[coordenadax][coordenaday]=acorazado;
        
        for(int i=1;i<=mapa.length;i++) {
            mapa[coordenadax][coordenaday]=acorazado;
            coordenadax++;
            }
        }
	
	public static void portaaviones (char [][] mapa){
        char portaaviones = 'P';
        int coordenadax =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
        int coordenaday =(int) (0 + Math.random() * (mapa.length-1 - 0 + 1));
        mapa[coordenadax][coordenaday]=portaaviones;
        
        for(int i=1;i<=mapa.length;i++) {
            mapa[coordenadax][coordenaday]=portaaviones;
            coordenaday++;
            }
        }
	
	*/
	
	
	//MAIN 
	
	
	public static void main (String[] args) {
	
		
		final int CordX = 10;
        final int CordY = 8;
        char mapa [][] = new char [CordX][CordY];	
        
        
       
        
        
        crear_mapa(mapa);
        muestra_tablero(mapa);
        insertar_barcos(mapa);
        portaaviones(mapa);
        acorazado(mapa);
        buque(mapa);
        lancha(mapa);             
       
		
		
        muestra_tablero(mapa);
		
		
	/*	lancha(mapa);
		buque(mapa);
		acorazado(mapa);
		portaaviones(mapa);*/
	}
	
	
	
	
}
