import java.awt.Color;
import javax.swing.*;
public class Cas_practic_joc extends JFrame{
	

	public Cas_practic_joc() {
		
		//Panel principal
		setSize(800,700);
		setTitle("3 en raya");
	    setBounds(300, 200, 400, 300);
			
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	    JPanel contentPane = new JPanel();
			 
        contentPane.setLayout(null);
	    setContentPane(contentPane);
		        
	    //Titulo Juego
		 JLabel titulo = new JLabel("3 en raya");
	     titulo.setBounds(70, 32, 100, 25);
		 contentPane.add(titulo);
	
	}
	
	//Main principal
	public static void main(String[] args) {
       
		//variables
		int jugador = 0;  
        int[][] tablero= new int[3][3];

        //para empezar dejar el tablero en blanco
        reiniciar(tablero);
        
        
        //Titulo de la ventana emergente para indicar el turno
        do{
        	juego(tablero);

        	jugador=Casillasmarcadas(tablero);

            mostrar(tablero,jugador,"Después del turno del jugador");

           if(jugador==0) {
                jugarOrdenador(tablero);

                jugador = Casillasmarcadas(tablero);

                mostrar(tablero, jugador, "Después del turno del ordenador");
            }
        }while(jugador == 0);
    }
	
	
	  //Tablero Principal
	    private static void Tablero(int[][] tablero,String a) {
	     
	    	//variables
	    	int x,y;
	         String mensaje=a+"\n\n";

	         //tablero
	         for(x=0;x<tablero.length;x++) {
	             for (y = 0; y < tablero[x].length; y++) {
	                 if(tablero[y][x] == 1){
	                    mensaje+="|   X   ";
	                 }else if(tablero[y][x]==2){
	                     mensaje+="|   O   ";
	                 }else{
	                     mensaje+="|         ";
	                 }
	                 if(y==tablero[x].length-1) {
	                     mensaje += "|";
	                 }
	             }
	             mensaje+="\n";
	             if(x != tablero.length-1) {
	                 mensaje += "______________________\n";
	             }else{
	                 mensaje +="\n";
	                 }
	         }

	         JOptionPane.showMessageDialog(null,mensaje);
	    }


	   //Juego cartelitos de posicion
	    private static void juego(int[][] tablero) {
	       
	    	//variables
	    	String coordenadas;
	        int x,y;
	        boolean ocupado=false;

	        //funcion de la introduccion de coordenadas para colocar la ficha
	        do {
	            ocupado=false;
	            do {
	                coordenadas = JOptionPane.showInputDialog("introduce la coordenada x (de izquierda a derecha del 0 al 2)");
	                x = Integer.parseInt(coordenadas);
	                coordenadas = JOptionPane.showInputDialog("introduce la coordenada y (de arriba a abajo del 0 al 2");
	                y = Integer.parseInt(coordenadas);
	                if(x<0 || x>2 || y<0 || y>2){
	                    JOptionPane.showMessageDialog(null,"Tienes que introducir coordenadas del 0 y 2");
	                }
	            }while (x<0 || x>2 || y<0 || y>2);

	            //indica si la casilla esta ocupada 
	            if(tablero[x][y] == 1 || tablero[x][y]==2) {
	                ocupado=true;
	                JOptionPane.showMessageDialog(null," Posición ya está ocupada.Selecciona otra.");
	            }else{
	                tablero[x][y] = 1;
	            }
	        }while(ocupado==true);
	    }
	    
	    
	  //Mostrar Mensajes de turnos y de ganador
		  private static void mostrar(int[][] tablero, int jugador,String a) {
		        if(jugador==0){
		        	Tablero(tablero,a);
		        }else{
		        	mensajeFinal(jugador,tablero);
		        }
		    }
	    
	    
	    //Jugadas posibles
	    private static boolean JugadasPosibles(int[][] tablero,int p) {
	        boolean tirada=false;
	        int i,j;

	        //comprobar posibilidades de todas las filas
	        for(i=0;i<tablero.length && tirada==false;i++) {
	            if (tablero[i][0] == p && tablero[i][1] == p && tablero[i][2] == 0) {
	                tablero[i][2] = 2;
	                tirada=true;
	            }
	            if (tablero[i][0] == 0 && tablero[i][1] == p && tablero[i][2] == p && tirada==false) {
	                tablero[i][0] = 2;
	                tirada=true;
	            }
	            if (tablero[i][0] == p && tablero[i][1] == 0 && tablero[i][2] == p && tirada==false) {
	                tablero[i][1] = 2;
	                tirada=true;
	            }
	        }
	        //comprobar posibilidades de todas las columnas
	        for(j=0;j<tablero.length && tirada==false;j++) {
	            if (tablero[0][j] == p && tablero[1][j] == p && tablero[2][j] == 0) {
	                tablero[2][j] = 2;
	                tirada=true;
	            }
	            if (tablero[0][j] == 0 && tablero[1][j] == p && tablero[2][j] == p && tirada==false) {
	                tablero[0][j] = 2;
	                tirada=true;
	            }
	            if (tablero[0][j] == p && tablero[1][j] == 0 && tablero[2][j] == p && tirada==false) {
	                tablero[1][j] = 2;
	                tirada=true;
	            }
	        }
	        //comprobar las posibildades de todas las posiciones diagonales
	        if (tablero[0][0] == p && tablero[1][1] == p && tablero[2][2] == 0 && tirada==false) {
	            tablero[2][2] = 2;
	            tirada = true;
	        }
	        if (tablero[0][0] == 0 && tablero[1][1] == p && tablero[2][2] == p && tirada==false) {
	            tablero[0][0] = 2;
	            tirada = true;
	        }
	        if (tablero[0][0] == p && tablero[1][1] == 0 && tablero[2][2] == p && tirada==false) {
	            tablero[1][1] = 2;
	            tirada = true;
	        }
	        if (tablero[2][0] == p && tablero[1][1] == p && tablero[0][2] == 0 && tirada==false) {
	            tablero[0][2] = 2;
	            tirada = true;
	        }
	        if (tablero[2][0] == 0 && tablero[1][1] == p && tablero[0][2] == p && tirada==false) {
	            tablero[2][0] = 2;
	            tirada = true;
	        }
	        if (tablero[2][0] == p && tablero[1][1] == 0 && tablero[0][2] == p && tirada==false) {
	            tablero[1][1] = 2;
	            tirada = true;
	        }
	        return tirada;
	    }
	 
	    
	  //Jugar Ordenador (Maquina)
	    private static void jugarOrdenador(int[][] tablero) {
	       
	    	//variables
	    	int i,j;
	        boolean tirada=false;
	        
	        //En todo este proceso las X seran el 1 y las O el 2
	      
	        tirada=JugadasPosibles(tablero, 2);

	       if(tirada==false) {
	            tirada = JugadasPosibles(tablero, 1);
	        }
	       //funcion recorrer tablero para poder jugar y tener algo de inteligencia artificial
	        if(tirada==false){
	           for(i=0;i<tablero.length && tirada==false;i++) {
	                for(j=0;j<tablero[i].length && tirada==false;j++) {
	                    if(tablero[i][j]==0){
	                        tablero[i][j]=2;
	                        tirada=true;
	                    }
	                }
	            }
	        }
	    }
	    
	    //Comprobar si en las Filas hay 3 seguidas marcadas para dar 3 en raya
	    private static int rayaFilas(int[][] tablero) {
	      
	    	//variables
	    	int i;
	        int n;
	        int linea=0;
	        //bucle
	        for(n=1;n<=2;n++) {
	            for (i = 0; i < tablero.length && linea == 0; i++) {
	                if (tablero[i][0] == n && tablero[i][1] == n && tablero[i][2] == n) {
	                    linea = n;
	                }
	            }
	        }
	        return linea;
	    }
	  //COMPROBACIONES VARIAS
	    //Comprobar si todas las casillas estan llenas
	   private static int marcado(int[][] tablero) {
		 
		   //variables 
		   int ganador=-1;
	        int i,j;
	        
	      //bucle
	        for(i=0;i<tablero.length;i++) {
	             for (j = 0; j < tablero[i].length; j++) {
	                 if(tablero[i][j] == 0){
	                     ganador=0;
	                 }

	             }
	         }
	        return ganador;
	    }
	   //Comprobar si las casillas Diagonales hay 3 seguidas marcadas para dar el 3 en raya
	    private static int rayaDiagonales(int[][] tablero) {
	       
	    	//variables
	    	int diagonal=0;
	        int n;
	        
	        //bucle 
	        for(n=1;n<=2;n++) {
	            if (tablero[0][0] == n && tablero[1][1] == n && tablero[2][2] == n) {
	                diagonal = n;
	            }
	            if (tablero[0][2] == n && tablero[1][1] == n && tablero[2][0] == n) {
	                diagonal = n;
	            }
	        }
	        return diagonal;
	    }
	  //Comprobar si en las columnas hay 3 seguidas marcadas para dar el 3 en raya
	    private static int rayaColumnas(int[][] tablero) {
	      
	    	//variables
	    	int j;
	        int col=0;
	        int n;

	        //bucle
	        for(n=1;n<=2;n++) {
	            for (j = 0; j < tablero.length && col == 0; j++) {
	                if (tablero[0][j] == n && tablero[1][j] == n && tablero[2][j] == n) {
	                    col = n;
	                }
	            }
	        }
	        return col;
	    }
	    
	    
	    //Comprobadores de Filas,Columnas,Diagonales y si el tablero esta lleno
	    private static int Casillasmarcadas(int[][] tablero) {
	        
	    	//variables
	    	int ganador=0;

	    	//proceso
	        ganador=rayaFilas(tablero);
	        if(ganador==0) {
	         
	            ganador = rayaColumnas(tablero);
	        }
	        if(ganador==0) {
	           
	            ganador = rayaDiagonales(tablero);
	        }
	     
	        if(ganador == 0) {
	            ganador = marcado(tablero);
	        }
	        return ganador;
	    }
	    
	    //Reinicio del juego ponemos vacio el tablero
	    private static void reiniciar(int[][] tablero) {
	     
	    	//variables
	    	int x,y;

	    	//bucle poner vacio el tablero
	        for(x=0;x<tablero.length;x++) {
	            for(y=0;y<tablero[x].length;y++){
	                tablero[y][x]=0;
	            }
	        }
	    }
	    
	    //Mensaje Final de la partida
	    private static void mensajeFinal(int ganador, int[][] tablero) {
	       
	    	//variables
	    	String mensaje="";
	    	
	    	//Mensaje Ganador
	        if(ganador==1) {
	            mensaje="HAS GANADO A LA MAQUINA!!!!";
	        }
	        //Mensaje Perdedor
	        else if(ganador==2){
	            mensaje="HAS PERDIDO,PRUEBA OTRA VEZ";
	        }
	        //Mensaje en tablas
	        else {
	            mensaje="NO HAY CUADRADOS DISPONIBLES";
	        }
	        Tablero(tablero,mensaje);
	    }
	}

    

	
	
	

