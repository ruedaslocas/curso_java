package escritorio;

import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventana {

	private static JTextField tfNombre;
	private static JLabel lblSaludo;
	
	public static void main(String[] args) {
		
		//creamos ventana
		JFrame ventana = new JFrame("Ventana de ejemplo desde Java");
		ventana.setBounds(100, 200, 500, 400);
		
		//prueba
		Container contenedor = ventana.getContentPane();
		
		LayoutManager lm;
		contenedor.setLayout(null);
		
		//creacion de label "titulo"
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(0, 0, 200, 30);
		contenedor.add(lblNombre);
		
		//creamos cuadropara texto 
		tfNombre = new JTextField(20);
		tfNombre.setBounds(100, 0, 200, 30);
		contenedor.add(tfNombre);
		
		 //creacion ed boton
		JButton btnSaludar = new JButton("Saludar");
		btnSaludar.setBounds(300, 0, 200, 30);
		contenedor.add(btnSaludar);
		
		//otro label 
		lblSaludo = new JLabel("Escribe tu nombre y te saludaré");
		lblSaludo.setBounds(0, 30, 500, 30);
		contenedor.add(lblSaludo);
		
		//eventos de listener.. acciones
		ActionListener botonListener = new BotonListener();
		btnSaludar.addActionListener(botonListener);
		
		btnSaludar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el botón");
			}
		});
		
		btnSaludar.addActionListener(e -> { 
			System.out.println("Botón con lambda (Java 8)");
			System.out.println(e);
			System.out.println(((AbstractButton) e.getSource()).getText());
		});
		
		ventana.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Cierre de ventana");
				System.exit(0);
			}
		});
		
		ventana.setVisible(true); //.show();
	}
	
	private static class BotonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			lblSaludo.setText("Hola, " + tfNombre.getText());
		}
		
	}

}