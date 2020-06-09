package curso_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author alex
 *
 */

public class HolaMundo {

	public static void main(String[] args) throws IOException {
		//
		int años = 27;
		String nombre = "Alex";
		String coche = "audi";
		String pais = "espaÃ±a";
		
		
		//imprimir en pantalla hla mundo 
		System.out.printf("hola mundo "+"mi nombre es "+nombre+" tengo "+años+" aÃ±os, soy de "+pais+" y tengo un "+coche);
		
		
		//charAt
		System.out.println("texto".charAt(1));
		//compareTo
		System.out.println("mendiluce".compareTo("alex"));
		//igual que el anterior pero ignora diferencias entre mayus y minus
		System.out.println("Alex".compareToIgnoreCase("alex"));
		
		//equals 
		String nombre1= "alex";
		String nombre2= "alex";
		
		
		System.out.println(nombre1.equals(nombre2));
		//comparar cadenas
				if (nombre1.equals(nombre2)) {
					
					System.out.println("la cadena es la misma");			
				}else {
					System.out.println("\nla cadena no es la misma");			

				}

				
		//indexOf
		System.out.println("el marido de mi hermana tiene moto".indexOf("tiene"));
		//length
		System.out.println(nombre1.length());
		//match expresion regular
		//System.out.println("12123123A".matches("[0-9]{8}[A-Za-Z]"));
		
		//replace
		System.out.println("alex mendiluce".replace("alex", "Alejandro"));
		
		//split
		System.out.println("uno,dos,tres,cuatro".split(",")[1]);
		
		//substring   desde que posicion quieres empezar y hasta donde
		System.out.println("texto largo que te pases".substring(0,9));
		//lowerCase y upperCase 
		System.out.println("alex".toUpperCase());
		System.out.println("ALEX".toLowerCase());
		//trim quita espacios al principio y al final 
		System.out.println("           asd fa dfa sdfa sfd sadf as fda".trim());
		
		
		
		//creacion de array
		int[] arr= new int[2];
		
		arr[0]=32;
		arr[1]=23;
		//mostrar array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//array bidimensional
		
		char[][] tablero = new char[2][2];
		tablero[0][0] = 'a';
		tablero[0][1] = 'l';
		tablero[1][0] = 'e';
		tablero[1][1] = 'x';
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.println(tablero[i][j]);
			}
			
		}
		
		
		//declaraciones arraylist
		ArrayList<String> usuarios = new ArrayList<String>();
		
		usuarios.add("alex");
		usuarios.add("gorka");
		
		System.out.println(usuarios.size()+" cantidad de datos en el arraylist");
		System.out.println(usuarios.get(0)+" posicion de arraylist seleccionada");
		
		
		//aparte de los operadores clasicos "+,-,*..." todos las operaciones siguiente se haran con el metodo Math
		
		System.out.println(5 + 3);
		System.out.println(5 - 3);
		int numero3 = 5 ;
		int numero2 = 2 ;

		System.out.println(Math.pow(numero3, numero2)+" rais cuadrada de 5");
		
		int a = 2;
		a += 5;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		 
		//lectura por teclado 
		
		Scanner S = new Scanner(System.in);	
		
		System.out.println("dime tu nombre");
		
		String opcion = S.nextLine();
		
		System.out.println("tu nombre es: " + opcion);
		
		S.close();
		
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String opcion2 = br.readLine();
        
        System.out.println("esccribe tu apellido "+opcion2);*/

	//********de String a int y de int a String**************//
		
		
		String numero = "45";
		
		int numeroEntero = Integer.parseInt(numero);
		
		String numeroTexto = String.valueOf(numeroEntero);
		
		

		
		
		
		
		
	}

}
