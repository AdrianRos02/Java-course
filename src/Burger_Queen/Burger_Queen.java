package Burger_Queen;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.event.*;

public class Burger_Queen extends JFrame{

	private JButton sumar;
		 private JTextField camporesultado,campoIva,campoPVP ;
		 private  double total = 0,iva=0,operacion=0;
		
		
		public Burger_Queen() {
			Font lletra = new Font("Arial", Font.BOLD, 25);
			setTitle("Burger Menu APP");
			  setBounds(300, 200, 600, 700);
				
		        setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		       
		 
		        JPanel contentPane = new JPanel();
		 
		       contentPane.setLayout(null);
		       contentPane.setBackground(Color.red);
		        setContentPane(contentPane);
		        
		       //Titulo menu
		        JLabel titulo = new JLabel("Menu basico(8€)");
		        titulo.setFont(lletra);
		        titulo.setBounds(70, 32, 280, 25);
		        
		        contentPane.add(titulo);
		        
		        //icono ventana
		        
		        Toolkit predeterminado=Toolkit.getDefaultToolkit();
		        Image icono=predeterminado.getImage("300px-KFC_logo.svg_.png");
		        setIconImage(icono);
		       
		  
		       //Cuadro hamburguesa
		      
		        JLabel hamburguesa = new JLabel("Hamburguesa");
		        hamburguesa.setBounds(50, 70, 100, 25);
		        hamburguesa.setBackground(Color.white);
		        contentPane.add(hamburguesa);
		        
		        JRadioButton pollo =new JRadioButton("Pollo");
		       JRadioButton cerdo =new JRadioButton("Cerdo");
		       JRadioButton ternera =new JRadioButton("Ternera(+1)");
		       JRadioButton vegana =new JRadioButton("Vegana(+1)");
		       
		       pollo.setBounds(50,100,100,30);
		       cerdo.setBounds(50,125,100,30);
		       ternera.setBounds(50,150,100,30);
		       vegana.setBounds(50,175,100,30);
		       
		       ButtonGroup bg=new ButtonGroup();
		       bg.add(pollo);bg.add(cerdo);bg.add(ternera);bg.add(vegana);
		       contentPane.add(pollo);contentPane.add(cerdo);contentPane.add(ternera);contentPane.add(vegana);
		       
		       //Cuadro pan
			      
		        JLabel pan = new JLabel("Pan");
		        pan.setBounds(200, 70, 100, 25);
		        contentPane.add(pan);
		        
		        JRadioButton Normal =new JRadioButton("Normal");
		       JRadioButton Integral =new JRadioButton("Integral");
		       JRadioButton Centeno =new JRadioButton("Centeno");
		       
		       Normal.setBounds(200,100,100,30);
		       Integral.setBounds(200,125,100,30);
		       Centeno.setBounds(200,150,100,30);
		      
		       
		       ButtonGroup bg1=new ButtonGroup();
		       bg1.add(Normal);bg1.add(Integral);bg1.add(Centeno);
		       contentPane.add(Normal);contentPane.add(Integral);contentPane.add(Centeno);
		       
		       //Cuadro Patatas
		       
			      
		        JLabel patatas = new JLabel("Patatas");
		        patatas.setBounds(350, 70, 100, 25);
		        contentPane.add(patatas);
		        
		        JRadioButton Fritas =new JRadioButton("Fritas");
		       JRadioButton Gajo =new JRadioButton("Gajo");
		       JRadioButton Caseras =new JRadioButton("Caseras(+1€)");
		       
		       Fritas.setBounds(350,100,100,30);
		       Gajo.setBounds(350,125,100,30);
		       Caseras.setBounds(350,150,100,30);
		      
		       
		       ButtonGroup bg2=new ButtonGroup();
		       bg2.add(Fritas);bg2.add(Gajo);bg2.add(Caseras);
		       contentPane.add(Fritas);contentPane.add(Gajo);contentPane.add(Caseras);
		       
		       //Cuadro Bebida
		       
			      
		        JLabel bebida = new JLabel("Bebida");
		        bebida.setBounds(50, 240, 100, 25);
		        contentPane.add(bebida);
		        
		        JRadioButton cola =new JRadioButton("Cola");
		       JRadioButton naranja =new JRadioButton("Naranja");
		       JRadioButton limon =new JRadioButton("Limon");
		       JRadioButton agua =new JRadioButton("Agua");
		       JRadioButton cerveza =new JRadioButton("Cerveza");
		       
		       cola.setBounds(50,260,80,30);
		       naranja.setBounds(140,260,80,30);
		       limon.setBounds(230,260,80,30);
		       agua.setBounds(320,260,80,30);
		       cerveza.setBounds(410,260,80,30);
		      
		       
		       ButtonGroup bg3=new ButtonGroup();
		       bg3.add(cola);bg3.add(naranja);bg3.add(limon);bg3.add(agua);bg3.add(cerveza);
		       contentPane.add(cola);contentPane.add(naranja);contentPane.add(limon);contentPane.add(agua);contentPane.add(cerveza);
		       
		       //Cuadro Adicionales
		       
		        JLabel adicional = new JLabel("Opciones extra/adicionales");
		        adicional.setBounds(50, 320, 200, 25);
		        contentPane.add(adicional);
		        
		        JCheckBox doble =new JCheckBox("Hamburguesa doble (+2€)");
		        JCheckBox extraqueso=new JCheckBox("Extra de queso (+0,50€)");
		        JCheckBox extrapatatas =new JCheckBox("Extra de patatas (+1€)");
		      
		        doble.setBounds(50,350,200,30);
		        extraqueso.setBounds(50,390,200,30);
		        extrapatatas.setBounds(50,430,200,30);
		      
		       
		       contentPane.add(doble);contentPane.add(extraqueso);contentPane.add(extrapatatas);
		       
		       
		     //Cuadro Salsas
		       
		        JLabel salsas = new JLabel("Salsas(+0,50€ cada una)");
		        salsas.setBounds(320, 320, 200, 25);
		        contentPane.add(salsas);
		        
		        JSpinner Ketchup =new JSpinner();
		        JSpinner Mostaza=new JSpinner();
		        JSpinner Barbacoa =new JSpinner();
		        JSpinner Thai =new JSpinner();
		      
		        JLabel ketchup = new JLabel("Ketchup");
		        ketchup.setBounds(290, 350, 200, 25);
		        contentPane.add(ketchup);
		        Ketchup.setBounds(340,350,40,30);
		        
		        JLabel mostaza = new JLabel("Mostaza");
		        mostaza.setBounds(390, 350, 200, 25);
		        contentPane.add(mostaza);
		        Mostaza.setBounds(440,350,40,30);
		       
		        JLabel barbacoa = new JLabel("Barbacoa");
		        barbacoa.setBounds(280, 400, 200, 25);
		        contentPane.add(barbacoa);
		        Barbacoa.setBounds(340,400,40,30);
		        
		        JLabel thai= new JLabel("Thai");
		        thai.setBounds(390, 400, 200, 25);
		        contentPane.add(thai);   
		        Thai.setBounds(440,400,40,30);
			       
		       
		       contentPane.add(Ketchup);contentPane.add(Mostaza);contentPane.add(Barbacoa);contentPane.add(Thai);
		       
		       
		       //Repartos
		       JLabel repartos = new JLabel("Repartos");
		        repartos.setBounds(250, 460, 100, 25);
		        contentPane.add(repartos);
		        
		        JRadioButton domicilio =new JRadioButton("Reparto a domicilio(+2€)");
		       JRadioButton local =new JRadioButton("Recogida en local");
		       
		       domicilio.setBounds(300,500,210,30);
		       local.setBounds(130,500,150,30);
		       
		       
		       ButtonGroup bg5=new ButtonGroup();
		       bg5.add(domicilio);bg5.add(local);
		       contentPane.add(domicilio);contentPane.add(local);
		       
		       
		       //Boton CALCULAR
		       JButton calcular= new JButton("Calcular");
		        calcular.setBounds(240, 550, 100, 23);
		    contentPane.add(calcular);
		    
		    //Operacion Boton
		    calcular.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			total=8;
	    			
	    			int vKetchup = (int) Ketchup.getValue();
	    			double Ketchup=vKetchup*0.5;
	    			int vMostaza = (int) Mostaza.getValue();
	    			double Mostaza=vMostaza*0.5;
	    			int vBarbacoa = (int) Barbacoa.getValue();
	    			double Barbacoa=vBarbacoa*0.5;
	    			int vThai = (int) Thai.getValue();
	    			double Thai=vThai*0.5;
	    			
	    			
	    			
	    		     if(ternera.isSelected()|vegana.isSelected()) {
	    		    	 
	    		    	 total=total+1;
	    		     }
	    		    
	    		   
	    		      if(Caseras.isSelected()) {
	    		    	 total=total+1;

	    		      }
	    		       if(doble.isSelected()) {
	    		    	 total=total+2;

	    		     }
	    		      if(extraqueso.isSelected()) {
	    		    	total=total+0.5;

	    		      }
	    		      if(extrapatatas.isSelected()) {
	    		    	   
	    		    	 total=total+1;

	    		       }
	    		     if(domicilio.isSelected()) {
	    		    	 
						 total=total+2;
	    		     }
	    		     
	    		    	 camporesultado.setText(String.valueOf(operacion=total+Ketchup+Mostaza+Barbacoa+Thai));
	    		    	 campoIva.setText(String.valueOf(iva=operacion*0.15));
	    		    	 campoPVP.setText(String.valueOf(iva+operacion));
	    		        	  
	    		          }});
		    
		    //Cuadro precio
		    JLabel precio = new JLabel("Precio");
		    precio.setBounds(100, 570, 200, 25);
	        contentPane.add(precio);
	        
		    camporesultado = new JTextField();
		    camporesultado.setBounds(100, 600, 100, 40);
		    camporesultado.setEditable(false);
		      contentPane.add(camporesultado);
		     //cuadro iva
		      
		     JLabel iva = new JLabel("IVA");
		     iva.setBounds(250, 570, 200, 25);
		     contentPane.add(iva);
		     
		      campoIva = new JTextField();
		      campoIva.setBounds(250, 600, 100, 40);
		      campoIva.setEditable(false);
			      contentPane.add(campoIva);
			      
			 //cuadro pvp
	        JLabel pvp = new JLabel("P.V.P");
	        pvp.setBounds(400, 570, 200, 25);
		    contentPane.add(pvp);  
			      
			  campoPVP = new JTextField();
			  campoPVP.setBounds(400, 600, 100, 40);
			  campoPVP.setEditable(false);
			  contentPane.add(campoPVP);
			   
			setVisible(true);

	}

	public static void main(String[] args) {
	    new Burger_Queen();
	}
	

}
