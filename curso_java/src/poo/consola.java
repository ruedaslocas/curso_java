package poo;

import oop.persona;

public class consola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		persona p = new persona();
		p.setNombre("alex");
		p.setApellido("mendiluce");
		
	System.out.println(p.getNombre()+" "+p.getApellido());
	
	
	
	
	persona p2 = new persona("andres", " mendiluce");
	
	System.out.println(p2.getNombreCompleto());
	
	
	
	
	persona p3 = new persona("otro");
	
	System.out.println(p3.getNombreCompleto());
	
	
	
	
	persona p4 = new persona();
	
	System.out.println(p4.getNombreCompleto());


		

	}

}
