package poo;

import java.util.Scanner;

import oop.Alumno;

public class consolaPOO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Alumno alumnos = new Alumno();
		
		/*System.out.println(alumnos);
		System.out.println("esta es la mejor nota; "+alumnos.mejorNota());
		
		System.out.println("esta es la peor nota; "+alumnos.menorNota());
		alumnos.mostar();*/
		
		boolean repetir;
		String respuesta;
		
		
		do {
			
			

			System.out.println("desea meter un alumno? (s/N)");
			respuesta=sc.nextLine();
			
			repetir = false;
			
			if ("s".equalsIgnoreCase(respuesta)) {
				System.out.println(alumnos);
				repetir = true;
				System.out.println("nombre del alumno: "+alumnos.getNombre());
				System.out.println("mejor nota del alumno: "+alumnos.mejorNota());
				System.out.println("nota media del alumno: "+ alumnos.media());
			}
			
		} while (repetir);
		System.out.println("adios!");

	}

}
