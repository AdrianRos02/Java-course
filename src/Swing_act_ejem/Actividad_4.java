package Swing_act_ejem;
import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Actividad_4 {

	public static void main(String args[]) {
		
		marcoConTexto mimarco= new marcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class marcoConTexto extends JFrame{
	public marcoConTexto() {
		setVisible(true);
		
		setSize(600,450);
		
		setLocation(400, 200);
		
		setTitle("primer texto");
	
		
		Container contentpane = getContentPane();
		
		JPanel panel=new JPanel();
		
	contentpane.add(panel);

	panel.setBackground(Color.red);
	panel.add(new JButton ("Click aqui"));
	setVisible(true);
	//LAMINA DE ENCIMA
			Lamina miLamina=new Lamina();
			contentpane.
			add(miLamina);
			
	}
}
class Lamina extends JPanel{

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("yeeeeeeeeeeeeee", 100, 100);

		
	
	}
}

