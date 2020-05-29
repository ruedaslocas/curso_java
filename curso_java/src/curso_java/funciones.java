package curso_java;

public class funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado, x=1, y=2;
		
		//parametros que le pasamos a la funcion 
		resultado= sumar(x,y);
		
		sepadador();
		mostrar(resultado+" suma en a/b lo que teno en x/y");

		
		String[] mensaje= {"uno","dos"};
		
		for (String mensajes:mensaje) {
			
			sepadador();
			System.out.println(mensajes);
						
		}
		//remplaza la primera posicion la letra
		mensaje[0]=mensaje[0].replace('u', 'a');
		System.out.println(mensaje[0]);
		
		//buscar numero en array, creamos el array directamente en la llamada y le ponemos el numero a buscar
		System.out.println(buscarEnArray(new int[] {1,  5, 8 ,4 ,3}, 8));
		
	}
		
	
	//funciones
	
	/*****
	 * la funciones private solo son vistas por la propia clase
	 * las fucniones public puede ser vista por todos los paquetes
	 * las funciones sin nada pueden ser vistas solo por ese paquete
	 * si se quiere hacer llamada a otra funcion haremos import
	 */
	private static void sepadador() {
		System.out.println("<----------------------------------->");
	}
	//funcion basica de sumar 2 numeros... siempre fuera del main
	private static int sumar(int a, int b) {
		
		return a+b;
	}
	
	private static boolean buscarEnArray(int[] arr, int buscar) {
		
		boolean encontrado = false;
		
			for (int numero : arr) {
				if (numero == numero) {
					encontrado = true;
					
					break;
				}
				System.out.println(numero);
	
			}	
			if (encontrado) {
				System.out.println("encontrado");
	

			}
			return encontrado;
	}
	
	private static void mostrar(Object objeto) {
		
		System.out.println(objeto);
	}
	
	private static void mostrarArray(String[] textos) {
		String[] copia = textos.clone();
		
			
		for (String texto:copia) {
			
		}
		copia[1]="alex";

	}

}
