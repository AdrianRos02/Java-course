package editor_de_texto;

import javax .swing.*;
import javax.swing.text.DefaultEditorKit;

import java.awt.Container;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


public class editor_de_texto extends JFrame{
   
	
			
	//Barra principal
		private JMenu menuArchivo,menuEdicion,menuAcercaDe;
	
	//Dentro de Archivo
		 private JMenuItem menuItemNuevo,menuItemAbrir,menuItemGuardar,menuItemCerrar;
	//Dentro de Edicion
		 private Action Copiar,Pegar,Recortar;
	//Dentrto de Acerca de	 
		 private JMenuItem menuItemAcercaDe;
		 
	//Cursiva y negrita
		 private JToggleButton negrita,cursiva,subrayado;
		 
	//TIPOGRAFIA y grandaria
		 private JMenuItem lista;
		 private String[] fuentes;
		 private DefaultListModel dlm;
		 
		 
		
			
	//empieza el editor
	public editor_de_texto()
	{
		//panel principal
		setSize(800,700);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Editor de texto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container ContentPane=getContentPane();
		
		
		
		JPanel miPanel = new JPanel();
		miPanel.setLayout(null);
		miPanel.setBounds(100, 50, 500, 400);
		
		JMenuBar barraMenu = new JMenuBar();
	
	
		//Campo de texto
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(40, 40, 700, 550);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

 		      miPanel.add(areaTexto);
		
		//crear cuadro y menu
		
		barraMenu = new JMenuBar();
        menuArchivo = new JMenu();
        menuEdicion = new JMenu();
        menuAcercaDe = new JMenu();
        menuItemNuevo = new JMenuItem();
        menuItemAbrir = new JMenuItem();
        menuItemGuardar = new JMenuItem();
        menuItemCerrar = new JMenuItem();
      
        //copiar
        Copiar = new DefaultEditorKit.CopyAction();
        Copiar.putValue(Action.NAME ,"Copiar");
        menuEdicion.add(Copiar);
        //pegar
        Pegar = new DefaultEditorKit.PasteAction();
        Pegar.putValue(Action.NAME ,"Pegar");
        menuEdicion.add(Pegar);
        //recortar
        Recortar = new DefaultEditorKit.CutAction();
        Recortar.putValue(Action.NAME ,"Recortar");
        menuEdicion.add(Recortar);
        
        menuItemAcercaDe = new JMenuItem();
        negrita=new JToggleButton("Negrita");
        cursiva=new JToggleButton("Cursiva");
        subrayado=new JToggleButton("Sub");

        
        
        //Barra menu adds
        menuArchivo.setText("Fichero");
        barraMenu.add(menuArchivo);
        
        menuEdicion.setText("Edita");
        barraMenu.add(menuEdicion);
        
        menuAcercaDe.setText("acerca de...");
        barraMenu.add(menuAcercaDe);
        
        
        setJMenuBar(barraMenu);
        
        
        
        //Operaciones dentro de las barras
       //Archivo
        //nuevo
        menuItemNuevo.setText("Nuevo");
        menuArchivo.add(menuItemNuevo);
        menuArchivo.addSeparator();
        
        menuItemNuevo.addActionListener((ActionListener) new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	           areaTexto.setText("");  
        	}  
        	});  
        //abrir
        menuItemAbrir.setText("Abrir");
        menuArchivo.add(menuItemAbrir);
        menuArchivo.addSeparator();
        
        menuItemAbrir.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){
        		areaTexto.setText(AbrirArchivo()); 
        	          
        	
        	}  
        	});
        
        //guardar
        menuItemGuardar.setText("Guardar");
        menuArchivo.add(menuItemGuardar);
        menuArchivo.addSeparator();
        menuItemGuardar.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		JFileChooser chooser = new JFileChooser();
        		PrintWriter writer=null;
        		File ruta=null;
        		int aprove=chooser.showSaveDialog(ContentPane);
        		try {
        			ruta=chooser.getSelectedFile();
        			writer=new PrintWriter(ruta);
        			if(aprove ==JFileChooser.APPROVE_OPTION) {
        				writer.println(areaTexto.getText());
        				writer.flush();
        			}
        		}
        		catch (FileNotFoundException excp) {
        			excp.printStackTrace();
        		}
        		catch(NullPointerException excp) {
        			JOptionPane.showMessageDialog(null, "no se a realizado el guardado","Error", JOptionPane.INFORMATION_MESSAGE);
        		}
        		}
       		
       	 
       	});
        //cerrar
        menuItemCerrar.setText("Cerrar");
        menuArchivo.add(menuItemCerrar);
        menuArchivo.addSeparator();
        menuItemCerrar.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
    		System.exit(0);
    		}
         
    	});
      
        
        //Acerca de
        menuItemAcercaDe.setText("Version 1.0 "
        		+ "Este programa es un Editor de texto basico hecho solo para escribir"
        		+ "y probar varios eventos de botones");
        menuAcercaDe.add(menuItemAcercaDe);
        menuAcercaDe.addSeparator();
        
        //Negrita y cursiva
    
        ActionListener negritaCursiva = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                if(negrita.isSelected() == true && cursiva.isSelected() == true) {
                    areaTexto.setFont(new Font("Negrita", Font.BOLD|Font.ITALIC, 12));
                }
                else if(negrita.isSelected() == true) {
                	areaTexto.setFont(new Font("Negrita", Font.BOLD, 12));
                }

                else if(cursiva.isSelected() == true) {
                	areaTexto.setFont(new Font("Cursiva", Font.ITALIC, 12));
                }
               /* else if(subrayado.isSelected() == true) {
                	areaTexto.setFont(new Font("Subrayado", Font., 12));
                }*/
                else {
                	areaTexto.setFont(new Font("llano", Font.PLAIN, 10));
                }
            }
        };

        negrita.addActionListener(negritaCursiva);
        cursiva.addActionListener(negritaCursiva);
        
        negrita.setText("N");
        barraMenu.add(negrita);
        
        cursiva.setText("K");
        barraMenu.add(cursiva);
           
        
        //Contenedor
        ContentPane.add(barraMenu);
        ContentPane.add(miPanel);
        
        
        
        
        
	}
	//operacion AbrirArchivo
	private String AbrirArchivo() {
	String aux="";
	String texto="";
	try {
		JFileChooser file=new JFileChooser();
		file.showOpenDialog(this);
		
		File abre=file.getSelectedFile();
		
		if(abre!=null) {
			FileReader archivos=new FileReader(abre);
			BufferedReader leer=new BufferedReader(archivos);
			while((aux=leer.readLine())!=null) {
				texto+= aux+"\n";
			}
			leer.close();
		}
	}
	catch(IOException ex) {
		JOptionPane.showMessageDialog(null,ex+""+"No se a encontrado el archivo", texto, JOptionPane.WARNING_MESSAGE);
	}
	return texto;
	}

	
	//main
	public static void main (String []args) {
		
	editor_de_texto programa=new editor_de_texto();
	programa.setVisible(true);
	}
}
