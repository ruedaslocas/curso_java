package ejercicioVentanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class cartas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cartas window = new cartas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cartas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 438, 270);
		frame.getContentPane().add(panel);
		
		JLabel lblCarta = new JLabel("texto de la carta!!!");
		panel.add(lblCarta);
		
		JButton btnMayor = new JButton("la carta va a ser mayor");
		panel.add(btnMayor);
		
		JButton btnIgual = new JButton("la carta va a ser la misma");
		btnIgual.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(btnIgual);
		
		JButton btnMenor = new JButton("la carta va a ser menor");
		panel.add(btnMenor);
	}

}
