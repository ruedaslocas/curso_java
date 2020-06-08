package poo;

import java.util.Scanner;

import oop.arrayMenorMayor;

//import oop.persona;

public class consolaPOO1 {

	public static void main(String[] args) {

		//ejercicio 1 poo1
		
		/*Scanner sc = new Scanner(System.in);

		persona p1 = new persona();

		System.out.printf("cuantos años tienes: ");
		int edadp1 = sc.nextInt();
		sc.nextLine();

		System.out.printf("cual es tu nombre: ");
		String nombre = sc.nextLine();

		p1.setEdad(edadp1);
		p1.setNombre(nombre);

		System.out.println("tu nombre es: " + p1.getNombre() + " y tienes " + p1.getEdad() + " años");

		p1.mayorMenor(edadp1);
		sc.close();*/
		
		
		//ejercicio 2 poo1
		
		//ejercicio 3 poo1
		
		Scanner sc = new Scanner(System.in);
		
		/*cuadrado cuadro = new cuadrado();
		
		
		System.out.println("inserte el lado del cuadrado: ");
		double lado = sc.nextDouble();
		
		cuadro.setLado(lado);
		
		System.out.println("este es el perimetro del cuadrado: " + cuadro.perimetro(lado));
		System.out.println("esta es la superficie del cuadrado: " + cuadro.superficie(lado));*/
		
		
		//ejercicio 4
		
		/*empleado empleado = new empleado();
		
		int sueldo ;
		String nombre;
		
		System.out.println("introduce tu nombre ; ");
		nombre = sc.nextLine();
		empleado.setNombre(nombre);
		
		System.out.println("introduce tu sueldo: ");
		sueldo=sc.nextInt();
		empleado.setSueldo(sueldo);
		
		System.out.printf("tu nombre es: "+ empleado.getNombre());
		System.out.println("tu sueldo es: "+ empleado.getSueldo());
		
		empleado.datos(sueldo);

		sc.close();*/
		
		//ejercicio 5
	/*	matematicas mate = new matematicas();
		
		int numero1;
		int numero2;
		int opcion;
		
		
		System.out.printf("introduce un numero: ");
		
		numero1=sc.nextInt();
		mate.setNumero1(numero1);
		
		System.out.printf("introduce otro numero: ");
		
		numero2=sc.nextInt();
		sc.nextLine();
		mate.setNumero2(numero2);
		
		System.out.printf("que desa hacer?\n1.-Sumear \n2.-Restar \n3.-Multiplicar \n4.-Dividir: ");

		opcion = sc.nextInt();
		sc.nextLine();
		mate.setOpcion(opcion);
		
		mate.matematicas(opcion);
		
		sc.close();*/
		
		
		//ejercicio 6
		
		arrayMenorMayor num = new arrayMenorMayor();
		
		
		//meter datos array
		
		/*for (int i = 0; i < numero.length; i++) {
			
			System.out.println("inserte un numero: ");
			numero[i]= sc.nextInt();
		}
		
		//mostrar datos array
		for (int i = 0; i < numero.length; i++) {
			
			System.out.println(numero[i]);
			
		}*/
		
		System.out.println("inserte 5 valores: ");
		
		 int a1=sc.nextInt();
		 sc.nextLine();
		 int a2=sc.nextInt();
		 sc.nextLine();
		 int a3=sc.nextInt();
		 sc.nextLine();
		 int a4=sc.nextInt();
		 sc.nextLine();
		 int a5=sc.nextInt();
		 sc.nextLine();
		 
		 num.numero(a1, a2, a3, a4, a5);
		 
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
