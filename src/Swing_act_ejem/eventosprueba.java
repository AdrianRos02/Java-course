package Swing_act_ejem;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;


public class eventosprueba extends JFrame{
	 private JPanel contentPane;
	 
	 
	 public static void main(String[] args) {
		 EventQueue.invokeLater(new Runnable() {
		 public void run() {
		 try {
		 eventosprueba frame = new eventosprueba();
		 frame.setVisible(true);
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		 }
		 });
		 }
	 
	 public void eventospureba() {
		 //Añade un titulo, no es estrictamente necesario
		 setTitle("Titulo de la ventana");

		 /* Coordenadas x y de la aplicación y su altura y longitud,
		 * si no lo indicamos aparecerá una ventana muy pequeña */
		 setBounds(400, 200, 655, 520);
		 /*Indica que cuando se cierre la ventana se acaba la aplicación,
		 * si no lo indicamos cuando cerremos la ventana la aplicación seguirá funcionando */
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 //Hace visible la ventana, si no lo hacemos no veremos la aplicación
		 setVisible(true);
		 //Creamos el panel
		 contentPane =new JPanel();
		 //Indicamos su diseño
		 contentPane.setLayout(null);
		 //asigno el pannel a la ventana
		 setContentPane(contentPane);
		 //Componentes
		 //Etiquetas
		 JLabel lblEscribeElNombre = new JLabel("Escribe el nombre el nombre de una persona sin dígitos");
		 lblEscribeElNombre.setBounds(369, 32, 229, 25);
		 contentPane.add(lblEscribeElNombre);
		 
		 
		 JLabel lblEligeUnaOpcin = new JLabel("Elige una opción:");
		 lblEligeUnaOpcin.setBounds(176, 32, 109, 14);
		 contentPane.add(lblEligeUnaOpcin);
		 
		 
		 JLabel lblPulsaElBoton = new JLabel("Pulsa el botón");
		 lblPulsaElBoton.setBounds(47, 32, 85, 14);
		 contentPane.add(lblPulsaElBoton);
		 
		 
		 JLabel lblEstasSobreLa = new JLabel("Estas sobre la ");
		 lblEstasSobreLa.setBounds(158, 224, 192, 14);
		 contentPane.add(lblEstasSobreLa);
		 
		 
		 JLabel lblSoloSePuede = new JLabel("Solo se puede escribir dígitos");
		 lblSoloSePuede.setBounds(371, 208, 193, 14);
		 contentPane.add(lblSoloSePuede);
		 
		 
		 JLabel lblNombreElegido = new JLabel("Nombre Elegido");
		 lblNombreElegido.setBounds(175, 124, 110, 14);
		 contentPane.add(lblNombreElegido);
		 
		 
		 //Campo de texto
		 JTextField textField = new JTextField();
		 textField.setBounds(371, 68, 193, 26);
		 contentPane.add(textField);
		 

		 JTextField textField_1 = new JTextField();
		 textField_1.setEditable(false);
		 textField_1.setBounds(175, 150, 141, 20);
		 contentPane.add(textField_1);
		 
		 
		 JTextField textField_2 = new JTextField();
		 textField_2.setBounds(371, 247, 126, 20);
		 contentPane.add(textField_2);
		 
		//Botones
		 JButton btnPulsame = new JButton("Púlsame");
		 btnPulsame.setBounds(43, 70, 89, 23);
		 contentPane.add(btnPulsame);
		 JButton btnAnadir= new JButton("A\u00F1adir");
		 btnAnadir.setBounds(371, 124, 89, 23);
		 contentPane.add(btnAnadir);
		 
		 
		 
		//Eventos
		 btnPulsame.addActionListener(new ActionListener(){
		 public void actionPerformed (ActionEvent e){
		 JOptionPane.showMessageDialog(contentPane, "¡Me has pulsado!");
		 }
		 });
		 //En este caso hemos debido de converir el componente en un atributo
		 comboBox.addActionListener(new ActionListener(){
		 public void actionPerformed (ActionEvent e){
		 textField_1.setText(comboBox.getItemAt(comboBox.getSelectedIndex()));
		 }
		 });
		 textField.addKeyListener(new KeyListener(){
		 public void keyTyped (KeyEvent e){
		 //Si el caracter introducido es un digito...
		 if (Character.isDigit(e.getKeyChar())){
		 //... no lo escribe
		e.consume();
		 }
		 }
		 public void keyReleased(KeyEvent e){
		 }
		 public void keyPressed(KeyEvent e){
		 }
		 });
		 btnAnadir.addActionListener(new ActionListener(){
		 public void actionPerformed (ActionEvent e){
		 comboBox.addItem(textField.getText());
		 textField.setText("");
		 JOptionPane.showMessageDialog(contentPane, "Nombre Añadido");
		 }
		 });
		 rdbtnOpcion.addMouseListener(new MouseListener(){
		 public void mouseClicked(MouseEvent e){
		 }
		 public void mouseEntered(MouseEvent e){
		 lblEstasSobreLa.setText(lblEstasSobreLa.getText()+rdbtnOpcion.getText());
		 }
		 public void mouseExited(MouseEvent e){
		 lblEstasSobreLa.setText("Estas sobre la ");
		 }
		 public void mousePressed(MouseEvent e){
		 }
		 public void mouseReleased(MouseEvent e){
		 }
		 });
		 rdbtnOpcion_1.addMouseListener(new MouseListener(){
		 public void mouseClicked(MouseEvent e){
		 }
		 public void mouseEntered(MouseEvent e){
		 lblEstasSobreLa.setText(lblEstasSobreLa.getText()+rdbtnOpcion_1.getText());
		 }
		 public void mouseExited(MouseEvent e){
		 lblEstasSobreLa.setText("Estas sobre la ");
		 }
		 public void mousePressed(MouseEvent e){
		 }
		 public void mouseReleased(MouseEvent e){
		 }
		 });
		 rdbtnOpcion_2.addMouseListener(new MouseListener(){
		 public void mouseClicked(MouseEvent e){
		 }
		 public void mouseEntered(MouseEvent e){
		 lblEstasSobreLa.setText(lblEstasSobreLa.getText()+rdbtnOpcion_2.getText());
		 }
		 public void mouseExited(MouseEvent e){
		 lblEstasSobreLa.setText("Estas sobre la ");
		 }
		 public void mousePressed(MouseEvent e){
		 }
		 public void mouseReleased(MouseEvent e){
		 }
		 });
		 textField_2.addKeyListener(new KeyListener(){
		 public void keyTyped (KeyEvent e){
		 //Si el caracter introducido no es un digito...
		 if (!Character.isDigit(e.getKeyChar())){
		 //... no lo escribe
		e.consume();
		 }
		 }
		 public void keyReleased(KeyEvent e){
		 }
		 public void keyPressed(KeyEvent e){
		 }
		 });
	 } 
}
