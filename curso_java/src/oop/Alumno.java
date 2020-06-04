package oop;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {

	private String nombre;

	private int[] notas = new int[5];

	// constructor que mete nota ( siempre el nombre de la clase)
	public Alumno() {
		// System.out.println("entra");

		Scanner sc = new Scanner(System.in);

		System.out.println("inserta el nombre nombre del alumno");
		nombre = sc.nextLine();

		for (int i = 0; i < notas.length; i++) {
			System.out.println("nota " + (i + 1) + " : ");
			notas[i] = sc.nextInt();
			sc.nextLine();

		}

	}
	
	public Alumno(String nombre, int[] notas) {
		
		this.nombre = nombre;
		this.notas = notas;
		
	}

	// sacar la mejor nota
	public int mejorNota() {

		int mejor = notas[0];

		for (int i = 1; i < notas.length; i++) {

			if (notas[i] > mejor) {
				mejor = notas[i];

			}
		}

		return mejor;

	}

	/// sacar la menor nota

	public int menorNota() {

		int menor = notas[0];
		// sacar la nota menor
		for (int i = 1; i < notas.length; i++) {

			if (notas[i] < menor) {
				menor = notas[i];

			}
		}

		// clonar el array para usar el SORT
		// int[] notas2 = notas.clone();

		/// return Arrays.stream(notas).max().getAsInt();

		return menor;

	}

	public double media() {

		double total = 0, media;

		for (int not : notas) {
			total += not;
		}

		media = total / notas.length;

		return media;

	}
//mostrar nombre y nota media
	public void mostar() {

		System.out.println(nombre + " nota media de " + media());

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno: nombre=" + nombre + ", notas=" + Arrays.toString(notas);
	}

}
