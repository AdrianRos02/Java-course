package juego;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class juego extends JFrame{

	
	public juego(){
		
		setTitle("JUEGO DEL INFIERNO (99,99% IMPOSIBLE)");
		  setBounds(300, 200, 400, 300);
			
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
	        JPanel contentPane = new JPanel();
			 
		       contentPane.setLayout(null);
		       contentPane.setBackground(Color.red);
		        setContentPane(contentPane);
		        
		        //Titulo Juego
		        JLabel titulo = new JLabel("IRAS AL CIELO?");
		        titulo.setBounds(70, 32, 100, 25);
		        
		        contentPane.add(titulo);
		        
		        
		      //Boton SI
			       JButton si1= new JButton("SI");
			       si1.setBounds(250, 100, 60, 20);
			    contentPane.add(si1);
			    
				  //Boton NO
				       JButton no= new JButton("NO");
				       no.setBounds(150, 100, 60, 20);
				    contentPane.add(no);
			    
			    
				    setVisible(true);
				    
			    si1.addMouseListener(new MouseListener() {
			    	public void mouseEntered(MouseEvent e) {
							
							si1.setText("NO");
							no.setText("SI");
						}

			    	@Override
						public void mouseExited(MouseEvent e) {
							si1.setText("SI");
							no.setText("NO");
						}
						
						public void mouseClicked(MouseEvent e) {
							
						}
						
						public void mousePressed(MouseEvent e) {
							
						}
						
						public void mouseReleased(MouseEvent e) {
							
						}

					
					});
					
					
				no.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(contentPane, "Al fin apretaste NO, VAS AL INFIERNO");
						}
					});
					
					
				 
				}
			    

	public static void main(String[]args ) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new juego();
			}
		});
		
	}
}
