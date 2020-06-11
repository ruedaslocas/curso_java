package ejercicioVentanas;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Once {

	private JFrame frame;
	private JTextField texDecenasMillar;
	private JTextField txtMil;
	private JTextField txtCentena;
	private JTextField txtDecenas;
	private JTextField txtUnidad;
	private JLabel lblDecenasMillar;
	private JLabel lblMil;
	private JLabel lblCentenas;
	private JLabel lblDecenas;
	private JLabel lblUnidad;
	private int valorOnce;
	JButton btnNewButton;
	private String valorOnceS;
	private String[] numeros = new String[5];
	String btn;
	private JLabel lblPulsado;
	int numero = (int) Math.floor(Math.random() * 99999);

	int quinto;
	int cuarto;
	int tercero;
	int segundo;
	int primero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Once window = new Once();
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
	public Once() {
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

		// bton de cobrar
		JButton btnCobrar = new JButton("Cobrar");
		btnCobrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// System.out.println(lblDecenasMillar.getText()+"-----" +
				// texDecenasMillar.getText());

				if (lblUnidad.getText().equals(txtUnidad.getText())) {

					if (lblDecenas.getText().equals(txtDecenas.getText())) {

						if (lblCentenas.getText().equals(txtCentena.getText())) {

							if (lblMil.getText().equals(txtMil.getText())) {

								if (lblDecenasMillar.getText().equals(texDecenasMillar.getText())) {
									lblPulsado.setText("tu premio es de 10.000 euros");
								} else {

									lblPulsado.setText("tu premio es de 500 euros");

								}

							} else {

								lblPulsado.setText("tu premio es de 50 euros");

							}

						} else {

							lblPulsado.setText("tu premio es de 10 euros");
						}

					} else {
						lblPulsado.setText("tu premio es de 2 euros");
					}
				} else {

				}

			}
		});
		btnCobrar.setBounds(12, 201, 117, 57);
		frame.getContentPane().add(btnCobrar);
		// boton de resultado
		JButton btnResultadoDeLa = new JButton("Resultado");

		btnResultadoDeLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*quinto = numero % 10;
				numero = numero / 10;
				cuarto = numero % 10;

				numero = numero / 10;
				tercero = numero % 10;

				numero = numero / 10;
				segundo = numero % 10;

				numero = numero / 10;
				primero = numero % 10;

				System.out.printf("%d  %d  %d  %d  %d  \n", primero, segundo, tercero, cuarto, quinto);

				int[] numero2 = new int[5];

				numero2[0] = primero;
				numero2[1] = segundo;
				numero2[2] = tercero;
				numero2[3] = cuarto;
				numero2[4] = quinto;*/

				// si se ha pulsado dicho boton
				if (btn != null) {
					// bucle para 5 numeros aleatorios de 0-9

					// asignamos a cada label la posicion del array
					texDecenasMillar.setText(numeros[0]);
					txtMil.setText(numeros[1]);
					txtCentena.setText(numeros[2]);
					txtDecenas.setText(numeros[3]);
					txtUnidad.setText(numeros[4]);

				} else {
					lblPulsado.setText("pulsa el boton generar");
				}

			}
		});
		btnResultadoDeLa.setBounds(165, 201, 117, 57);
		frame.getContentPane().add(btnResultadoDeLa);

		// boton gerear numeros aletorios

		btnNewButton = new JButton("Generar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// bucle para 5 numeros aleatorios de 0-9
				for (int i = 0; i < 5; i++) {

					// como math muestra numeros double lo pasamos a int
					valorOnce = (int) Math.floor(Math.random() * 10);
					// una ven ests convertidos en int... lo pasamos a String
					valorOnceS = Integer.toString(valorOnce);
					// y de String lo metemos en un array
					numeros[i] = valorOnceS;

				}

				// asignamos a cada label la posicion del array
				lblDecenasMillar.setText(numeros[0]);
				lblMil.setText(numeros[1]);
				lblCentenas.setText(numeros[2]);
				lblDecenas.setText(numeros[3]);
				lblUnidad.setText(numeros[4]);
				lblPulsado.setText("");
				// e.getActionCommand para saber que boton se ha pulsado
				btn = e.getActionCommand();
			}
		});

		btnNewButton.setBounds(309, 201, 117, 57);
		frame.getContentPane().add(btnNewButton);

		lblDecenasMillar = new JLabel();
		lblDecenasMillar.setBounds(39, 48, 40, 40);
		frame.getContentPane().add(lblDecenasMillar);

		lblMil = new JLabel(numeros[1]);
		lblMil.setBounds(117, 48, 40, 40);
		frame.getContentPane().add(lblMil);

		lblCentenas = new JLabel();
		lblCentenas.setBounds(188, 48, 40, 40);
		frame.getContentPane().add(lblCentenas);

		lblDecenas = new JLabel();
		lblDecenas.setBounds(254, 48, 40, 40);
		frame.getContentPane().add(lblDecenas);

		lblUnidad = new JLabel();
		lblUnidad.setBounds(327, 48, 40, 40);
		frame.getContentPane().add(lblUnidad);

		texDecenasMillar = new JTextField();
		texDecenasMillar.setText("1");
		texDecenasMillar.setBounds(39, 100, 40, 40);
		frame.getContentPane().add(texDecenasMillar);
		texDecenasMillar.setColumns(10);

		txtMil = new JTextField();
		txtMil.setText("2");
		txtMil.setBounds(117, 100, 40, 40);
		frame.getContentPane().add(txtMil);
		txtMil.setColumns(10);

		txtCentena = new JTextField();
		txtCentena.setText("3");
		txtCentena.setBounds(188, 100, 40, 40);
		frame.getContentPane().add(txtCentena);
		txtCentena.setColumns(10);

		txtDecenas = new JTextField();
		txtDecenas.setText("4");
		txtDecenas.setBounds(254, 100, 40, 40);
		frame.getContentPane().add(txtDecenas);
		txtDecenas.setColumns(10);

		txtUnidad = new JTextField();
		txtUnidad.setText("5");
		txtUnidad.setBounds(327, 100, 40, 40);
		frame.getContentPane().add(txtUnidad);
		txtUnidad.setColumns(10);

		lblPulsado = new JLabel("");
		lblPulsado.setBackground(Color.GREEN);
		lblPulsado.setBounds(39, 21, 355, 15);
		frame.getContentPane().add(lblPulsado);
	}
}
