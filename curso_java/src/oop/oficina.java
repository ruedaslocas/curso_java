package oop;

public class oficina {

	private persona[] puesto;

	public oficina(int numeroPuesto) {

		puesto = new persona[numeroPuesto];

	}

	public void sentarEnPuesto(persona persona, int numeroPuesto) {

		puesto[numeroPuesto -1] = persona;

	}

	public persona obtenerpersona(int numeroPuesto) {

		return puesto[numeroPuesto -1];

	}
	
	
	public int getNumeroPuestos() {
		
		return puesto.length;
		
	}

	

}
