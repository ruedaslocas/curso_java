package oop;

public class cuadrado {

	// variables de instancia

	private double lado;

	public double perimetro(double lado) {

		double perimetro = lado * 4;

		return perimetro;
	}

	public double superficie(double lado) {

		double superficie = lado * lado;

		return superficie;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
