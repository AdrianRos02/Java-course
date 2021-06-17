package Swing_act_ejem;
import javax.swing.*;
import java.awt.*;

public class Actividad_1 {

		public static void main(String args[]) {
			
			FinestraEmergen finestra = new FinestraEmergen();
			
			
			
		}
		
}
		class FinestraEmergen extends JFrame{
			public FinestraEmergen() {
				setSize(500,600);
				setVisible(true);
				setTitle("Prueba");
				setResizable(false);
				setLocation(700, 300);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		
}
