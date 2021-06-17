package minicalculadora;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.*;
import java.awt.event.*;

public class Minicalculadora extends JFrame{

	private JButton sumar,resta,multiplicacion,division;
	 private JTextField valor1,valor2,camporesultado;
	
	
	public Minicalculadora() {
		setTitle("Minicalculadora");
		  setBounds(300, 200, 355, 320);
			
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	        
	 
	        JPanel contentPane = new JPanel();
	 
	       contentPane.setLayout(null);
	       contentPane.setBackground(Color.darkGray);

	       setContentPane(contentPane);
	       
	       //valor del primer numero
	       JTextField valor1=new JTextField();
	       
	       valor1.setLayout(null);
	       valor1.setBounds(new Rectangle(30, 50, 100, 21));
	       contentPane.add(valor1);
	       
	       //valor del segundo numero
	       JTextField valor2=new JTextField();
	         
	       valor2.setLayout(null);
	       valor2.setBounds(new Rectangle(30, 80, 100, 21));
	       contentPane.add(valor2);
	       
	       //valor imaginario de 1
	       JTextField valor3=new JTextField();
	       
	       valor3.setLayout(null);
	       valor3.setBounds(new Rectangle(150, 50, 100, 21));
	       contentPane.add(valor3);
	       //valor imaginario de 2
	       JTextField valor4=new JTextField();
	       
	       valor4.setLayout(null);
	       valor4.setBounds(new Rectangle(150, 80, 100, 21));
	       contentPane.add(valor4);
	       
	       
	       //Botones
	       
	       //Suma
	       JButton sumar= new JButton("+");
	     
	       sumar.setBounds(30, 120, 50, 23);
	        contentPane.add(sumar);
	        
	        //Resta
	       JButton resta= new JButton("-");
	        resta.setBounds(100, 120, 50, 23);
		        contentPane.add(resta);
		        
		    //multiplicacion
		    JButton multiplicacion= new JButton("*");
		    multiplicacion.setBounds(170, 120, 50, 23);
		    contentPane.add(multiplicacion);
		
		    //division
		    JButton division= new JButton("/");
		    division.setBounds(240, 120, 50, 23);
		    contentPane.add(division);
	       
		    //etiqueta resultat
		    camporesultado = new JTextField();
		    camporesultado.setBounds(100, 200, 100, 40);
		    camporesultado.setEditable(false);
		      contentPane.add(camporesultado);
		      
		setVisible(true);

		//operacion suma
sumar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	     double  num1,num2 ,num3,num4,resu;
	     String resultado;
	     

	        
	          num1=Double.parseDouble(valor1.getText());
	          num2=Double.parseDouble(valor2.getText());
	          num3=Double.parseDouble(valor3.getText());
	          num4=Double.parseDouble(valor4.getText());
	          
	          complejos c=new complejos(num1,num2);
	          complejos c1=new complejos(num3,num4);
	         
	          resultado=String.valueOf(c.suma(c1));
		           camporesultado.setText(resultado);
	                   
	}
});

	//operacion resta
	resta.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		double  num1,num2,num3,num4,resu;
	     String resultado;
	          
	          num1=Double.parseDouble(valor1.getText());
	          num2=Double.parseDouble(valor2.getText());
	          num3=Double.parseDouble(valor3.getText());
	          num4=Double.parseDouble(valor4.getText());
	         
	          complejos c=new complejos(num1,num2);
	          complejos c1=new complejos(num3,num4);
	      
	        
	          resultado=String.valueOf(c.resta(c1));
	          camporesultado.setText(resultado);
	              
	        }
});

	//operacion multiplicar
	multiplicacion.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		double  num1,num2,resu;
	     String resultado;
	        	
	          num1=Double.parseDouble(valor1.getText());
	          num2=Double.parseDouble(valor2.getText());
	          complejos c=new complejos(num1,num2);
	          complejos c1=new complejos(num1,num2);
	         
	          resultado=String.valueOf( c.multiplicar(c1));
	          camporesultado.setText(resultado);              
	        }
	
});

	//operacion division
	division.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		double  num1,num2,resu;
	     String resultado;
	       
	          num1=Double.parseDouble(valor1.getText());
	          num2=Double.parseDouble(valor2.getText());
	          complejos c=new complejos(num1,num2);
	          complejos c1=new complejos(num1,num2);
	          
	          resultado=String.valueOf(c.division(c1));
	           camporesultado.setText(resultado);
	         }  
	       
	         });
}

public static void main(String[] args) {
    new Minicalculadora();
}
}