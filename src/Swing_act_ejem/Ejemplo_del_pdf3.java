package Swing_act_ejem;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class Ejemplo_del_pdf3  extends JFrame{

	public Ejemplo_del_pdf3() {
		setTitle("EY EY EY AQUI EL RICH ");
		 setSize(300, 200);
		 
		 Container contentpane = getContentPane();

		 JPanel panel = new JPanel();

		 contentpane.add(panel);
		

		 panel.setBackground(Color.BLUE);
		 JSpinner miSpinner;
		 miSpinner = new JSpinner();
		 contentpane.add(miSpinner);
		
		 setVisible(true);
		 }
	
		public static void main(String args[]) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new Ejemplo_del_pdf3();
				}
			});
			
	}
	
}
