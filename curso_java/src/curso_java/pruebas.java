package curso_java;

import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numero ;
		String texto ;
		String texto2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("excribe un numero:");
		numero= sc.nextInt();
		//solucion.. problema en el Scanner
		//sc.nextLine();
		System.out.println("escribe un texto");
		texto= sc.nextLine();
		System.out.println("escribe un texto2");
		texto2= sc.nextLine();
		System.out.println(numero);
		System.out.println(texto);
		System.out.println(texto2);
		
	}
	


}
