package ejercicioVentanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class historia {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					historia window = new historia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public historia() throws IOException {
		initialize();
		
		FileReader fr =new FileReader("ejer2ventana.csv");
		BufferedReader br = new BufferedReader(fr);
		
		//ArrayList<ClaseHistorias> clase =new ArrayList();
		String linea = null ;
		
		String historia;
		String descripcion;
		
		//ClaseHistorias Chistoria= new ClaseHistorias();
		String[] parts = linea.split(";");	
		
		while ((linea = br.readLine()) !=null) {
			
			
			historia = parts[0]; // 004
			descripcion = parts[1]; 
			System.out.println(linea);
		}
	
		
		br.close();
		fr.close();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		
		JLabel lblHisotira = new JLabel("Historia;");
		lblHisotira.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblHisotira);
	}

}
