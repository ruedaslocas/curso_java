package poo;

import oop.punto;

public class puntoPresentacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		punto p = new punto(1, 2);
		punto p2 = new punto(1, 2);

		System.out.println(p);// equivale a syso(p.toString())
		System.out.println(p.suma(p2));
		p.suma(p2);
		System.out.println(p.suma(p2));
		System.out.println(p2.suma(p));

	}

}
