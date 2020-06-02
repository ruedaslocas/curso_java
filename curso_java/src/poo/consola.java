package poo;

import java.util.ArrayList;
import java.util.Scanner;

import oop.persona;

public class consola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// llamamos al contructor 1 (nos pide meter nombre y apellido)
		persona p = new persona();
		p.setNombre("alex");
		p.setApellido("mendiluce");

		System.out.println(p.getNombre() + " " + p.getApellido());

		// llamamos al contructor uno pero le pasamos datos de otra manera
		persona p2 = new persona("andres", " mendiluce");

		System.out.println(p2.getNombreCompleto());

		// llamamos al contructor 2 ya que si el campo capellidoesta vacio nos metera
		// null

		persona p3 = new persona("otro");

		System.out.println(p3.getNombreCompleto());

		// llamamos al constructor 3 ya que si no le pasamos ningun parametro.. los
		// valores seran los que declare en la clase persona
		persona p4 = new persona();

		System.out.println(p4.getNombreCompleto());

		// arraylist de personas
		ArrayList<persona> per = new ArrayList<persona>();
		// insertar datos de persona en arraylist
		per.add(p);
		per.add(p2);
		per.add(p3);
		per.add(p4);
		per.add(new persona("juan", "perez"));

		// recorremos arraylist der personas y mostramos
		for (persona pers : per) {
			System.out.println(pers.getNombreCompleto());
		}

		// array personas

		persona[] arrayPer = new persona[2];
		// meter datos array de personas
		arrayPer[0] = p;
		arrayPer[1] = new persona("array", "arrayPersona");

		// recorremos array de personas y mostramos
		for (persona persona : arrayPer) {
			System.out.println(persona.getNombreCompleto());

		}
		Scanner s = new Scanner(System.in);
		String nombre;

		do {
			//insertar nombre de persona por teclado 
			System.out.println("inserte un nombre: ");

			nombre = s.nextLine();
			per.add(new persona(nombre));
		} while (!"salir".equals(nombre));

		for (persona persona : arrayPer) {
			System.out.println(persona.getNombre());

		}
		s.close();
	}

}
