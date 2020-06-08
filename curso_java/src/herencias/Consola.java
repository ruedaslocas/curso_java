package herencias;

import java.util.Scanner;

public class Consola {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//creamos las variables para guardar datos e insertarlas mas tarde en el array

		double precio;
		double pulgadas;
		String tipo;
		String nombre;
		
		//creamos el array
		TelevisionPlana[] elec = new TelevisionPlana[5];

		//creamos un bucle para insertar datos
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
		
		//creamos un bucle para mostrar los datos
		for (int i = 0; i < elec.length; i++) {
			System.out.println(i+1);
			System.out.println(elec[i]);
		}
		sc.close();

	}

}
