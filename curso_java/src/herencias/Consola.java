package herencias;

import java.util.Scanner;

public class Consola {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double precio;
		double pulgadas;
		String tipo;
		String nombre;

		TelevisionPlana[] elec = new TelevisionPlana[5];

		for (int i = 0; i < elec.length; i++) {

			System.out.println("inserte el nombre de un a TV");
			nombre = sc.nextLine();
			System.out.println("inserte precio:");
			precio = sc.nextDouble();
			sc.hasNextLine();
			System.out.println("pulgadas");
			pulgadas = sc.nextDouble();
			sc.nextLine();
			System.out.println("inserte el tipo de pantalla");
			tipo = sc.nextLine();
			elec[i] = new TelevisionPlana(pulgadas, tipo, precio, nombre);

		}
		for (int i = 0; i < elec.length; i++) {
			System.out.println(elec[i]);
		}
		sc.close();

	}

}
