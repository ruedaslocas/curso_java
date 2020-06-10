package poo;

import java.util.Scanner;

import oop.cuadro;

public class POO3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		cuadro[] cuadros = new cuadro[10];
		String respuesta;
		int i = 0;
		
		 String titulo;
		 String autor;
		 int altura;
		 int anchura;
		 int anio;
		 boolean restaurado = false;
		 double precio;
		 String s;

		do {
			System.out.println("desea introducir un cuadro? s/n");
			respuesta = sc.nextLine();


			if ("s".equalsIgnoreCase(respuesta)) {

				System.out.println("introduce el Titulo del cuadro: ");

				titulo = sc.nextLine();
				//cuadro.setTitulo(titulo);

				System.out.println("introduce el autor del cuadro: ");

				autor = sc.nextLine();
				//cuadro.setAutor(autor);

				System.out.println("introduce la altura del cuadro: ");

				altura = sc.nextInt();
				//cuadro.setAltura(altura);

				System.out.println("introduce la anchura del cuadro: ");

				anchura = sc.nextInt();
				//cuadro.setAnchura(anchura);

				System.out.println("introduce el año del cuadro: ");

				anio = sc.nextInt();
				sc.nextLine();
				//cuadro.setAño(año);

				System.out.println("se ha restaurado el cuadro: s/n ");

				s = sc.nextLine();
				
				//otra forma de camviar el valor del boolean por teclado
				//restaurado = "si".equalsIgnoreCase(sc.nextLine());
				if (s.equalsIgnoreCase("s")) {

					restaurado = true;
					
					
					//cuadro.setRestaurado(restaurado);
				}else {
					restaurado = false;
				}
				
				System.out.println("precio del cuadro: ");

				precio = sc.nextDouble();
				sc.nextLine();
				//cuadro.setPrecio(precio);
				
				cuadros[i] = new cuadro(titulo, autor, altura, anchura, anio, restaurado, precio);
				i++;

				
			}

		} while ("s".equalsIgnoreCase(respuesta));
		System.out.println("salir");

		for (i = 0; cuadros[i] != null; i++) {
			System.out.println(cuadros[i]);
		}
		sc.close();
	}


}
