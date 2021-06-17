package minicalculadora;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.*;
import java.awt.event.*;

public class minicalculadora2 extends JFrame{

	private JButton sumatorio,productorio,exponencial;
	 private JTextField valor1,valor2,camporesultado;
	private double resu;
	
	public minicalculadora2() {
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
	       valor2.setBounds(new Rectangle(30, 100, 100, 21));
	       contentPane.add(valor2);
	       
	       
	       //Botones
	       
	       //sumatorio
	       JRadioButton sumatorio= new JRadioButton("Sum");
	       
	       sumatorio.setBounds(150, 50, 70, 23);
	        contentPane.add(sumatorio);
	        
	        //productorio
	        JRadioButton productorio= new JRadioButton("produc");
	       productorio.setBounds(150, 85, 70, 23);
		        contentPane.add(productorio);
		        
		    //exponencial
		        JRadioButton exponencial= new JRadioButton("expo");
		    exponencial.setBounds(150, 120, 70, 23);
		    contentPane.add(exponencial);
		    
		    //Boton calcular
		  
	        JButton calcular= new JButton("Calcular");
	        calcular.setBounds(240, 50, 100, 23);
	    contentPane.add(calcular);
	    
	    
	    	//Agrupar
	    	ButtonGroup agrupar=new ButtonGroup();
	    	agrupar.add(sumatorio);
	    	agrupar.add(productorio);
	    	agrupar.add(exponencial);
	    	
	    	
		
	       
		    //etiqueta resultat
		    camporesultado = new JTextField();
		    camporesultado.setBounds(240, 100, 100, 40);
		    camporesultado.setEditable(false);
		      contentPane.add (camporesultado);
		      
		setVisible(true);

		//operacion sumatorio
		sumatorio.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	     double  num1,num2;
	     String resultado;

	            
	          num1=Double.parseDouble(valor1.getText());
	          num2=Double.parseDouble(valor2.getText());
	          
	          double contador = 0;
	           
	          for(double i=num1;i<=num2;i++) {
	        	 
	        	 contador=contador+i;
	        	 
	        	  
	          }
	         
	          
	          resu=contador;
	          resultado=String.valueOf(resu);
	          
	          		
	                  
	}
});

	//operacion productorio
		productorio.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		double  num1,num2;
	     String resultado;
	          
	     num1=Double.parseDouble(valor1.getText());
         num2=Double.parseDouble(valor2.getText());
         
         double contador = 1;
         
         for(double i=num1;i<=num2;i++) {
       	 
       	 contador=contador*i;
       	 
       	  
         }
        
         
         resu=contador;
         resultado=String.valueOf(resu);
         
	              
	        }
});

	//operacion exponencial
		exponencial.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		double  num1,num2 ;
	     String resultado;
	     num1=Double.parseDouble(valor1.getText());
         num2=Double.parseDouble(valor2.getText());
         double contador = num1;
	        	for(double i=0 ;i<num2;i++) {
	        		
	        		contador=contador*num1;
	        		
	        		
	        		
	        	}
	        
	          resu=contador;
	          resultado=String.valueOf(resu);
	                       
	        }
	
});
		//Evento boton
    	calcular.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		     if(sumatorio.isSelected()) {
    		    	 camporesultado.setText(String.valueOf(resu));
    		     }
    		    
    		     if(productorio.isSelected()) {
    		    	 camporesultado.setText(String.valueOf(resu));
    		     }
    		   
    		     if(exponencial.isSelected()) {
    		    	 camporesultado.setText(String.valueOf(resu));
    		     }
    		 
    		        	  
    		          }});
    		        
}

public static void main(String[] args) {
    new minicalculadora2();
}
}