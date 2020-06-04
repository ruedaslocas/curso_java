package oop;

import java.util.Arrays;

public class arrayMenorMayor {

	private int[] numeros = new int[5];
	private int pos;
	private int a1;
	private int a2;
	private int a3;
	private int a4;
	private int a5;

	public void numero(int a1, int a2, int a3, int a4, int a5) {
		//System.out.println("entra");
		this.a1  =a1;
		this.a2  =a2;
		this.a3  =a3;
		this.a4  =a4;
		this.a5  =a5;

		numeros[0] = a1;

		numeros[1] = a2;
		numeros[2] = a3;
		numeros[3] = a4;
		numeros[4] = a5;
		
		Arrays.sort(numeros);
		
		//System.out.println("sigue");
		
		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);
		}
		System.out.println("el numero mas bajo "+numeros[0] +" y el numero mas alto "+ numeros[4]);

	}


	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getA1() {
		return a1;
	}



	public void setA1(int a1) {
		this.a1 = a1;
	}

	public int getA2() {
		return a2;
	}

	public void setA2(int a2) {
		this.a2 = a2;
	}

	public int getA3() {
		return a3;
	}

	public void setA3(int a3) {
		this.a3 = a3;
	}

	public int getA4() {
		return a4;
	}

	public void setA4(int a4) {
		this.a4 = a4;
	}

	public int getA5() {
		return a5;
	}

	public void setA5(int a5) {
		this.a5 = a5;
	}

}
