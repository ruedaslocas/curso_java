package oop;

public class empleado {

	private String nombre;
	private int sueldo;

	public void datos(int sueldo) {

		setSueldo(sueldo);

		if (sueldo >= 3000) {

			System.out.println("tienes que pagar la renta");
		} else {
			System.out.println("no tienes que pagar la renta");
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}
