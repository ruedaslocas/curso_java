package poo;

import oop.oficina;
import oop.persona;

public class oficinaPresentacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		oficina o = new oficina(2);
		
		o.sentarEnPuesto(new persona("alex"), 1);
		o.sentarEnPuesto(new persona("pepe"), 2);

		persona p5;
		
		for (int numeroPuesto = 1; numeroPuesto <=o.getNumeroPuestos(); numeroPuesto++) {
			p5 = o.obtenerpersona(numeroPuesto);
			
			System.out.printf(numeroPuesto + " : ");
			System.out.println(o.obtenerpersona(numeroPuesto).getNombre());
			
			
			
		}
		
		

	}

}
