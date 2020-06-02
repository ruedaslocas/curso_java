package oop;

public class matematicas {

	private int numero1;
	private int numero2;
	private int opcion;

	public void matematicas(int opcion) {
		int resultado;
		setOpcion(opcion);

		switch (opcion) {
		case 1:

			resultado = this.numero1 + this.numero2;

			System.out.println(this.numero1 + " + " + this.numero2 + " = " + resultado);

			break;

		case 2:

			resultado = this.numero1 - this.numero2;

			System.out.println(this.numero1 + " - " + this.numero2 + " = " + resultado);

			break;

		case 3:

			resultado = this.numero1 * this.numero2;

			System.out.println(this.numero1 + " * " + this.numero2 + " = " + resultado);

			break;

		case 4:

			resultado = this.numero1 / this.numero2;

			System.out.println(this.numero1 + " / " + this.numero2 + " = " + resultado);

			break;

		default:
			
		}

	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

}
