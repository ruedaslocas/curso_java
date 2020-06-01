package ejercicio;

import java.util.Scanner;

public class BasicosSecuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//escribe 2 numero por teclado y muestralos 
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero:");
		
		int numero1 = sc.nextInt();
		
		System.out.println("introduce otro numero:");
		
		int numero2 = sc.nextInt();
		
		System.out.println("los numero son "+numero1+" y " + numero2 );
		
		sc.close();*/
		
		
		//escribe 1 nombre por teclado y muestralos 
				/*Scanner sc = new Scanner(System.in);
				
				System.out.println("introduce un nombre:");
				
				String nombre = sc.nextLine();
				
				System.out.println("buenos dias "+nombre );
				
				sc.close();
				*/
		
		//escribe una temperatura en ºC y pasalos a ºF
				/*Scanner sc = new Scanner(System.in);
				
				System.out.println("introduce la temperatura:");
				
				double grados = sc.nextDouble();
				
				double fahrenheit = 32 +(9*grados/5);
				
				System.out.println("los grados introducido "+grados+"ºC son "+ fahrenheit );
				
				sc.close();*/
		
		
		
		//escribe el radio y muestra la longitud y el area 
				/*Scanner sc = new Scanner(System.in);
				
				System.out.println("valor del radio");
				
				double radio = sc.nextDouble();
				
				double longitud = 2* Math.PI*radio;
				
				double area = Math.PI*Math.pow(radio, 2);
				
				
				
				System.out.println("el radio es : "+radio+"\n el area de ese radio es : "+area+"\n y la longitud es : "+longitud);
	
				sc.close();*/
		
		
		
		//escribe en km/h y pasalo a m/h 
				/*Scanner sc = new Scanner(System.in);
				
				System.out.println("una velocidad en km/h:");
				
				int km = sc.nextInt();
				
				int m = km*1000/3600;
				
				System.out.println("la velocidad introducida es de: " +km+ "km/h \n y la velocidad en metros son :" +m +"m/s");
				
				sc.close();
				*/
		
		
		
		//escribe 2 catetos y calcula la hipotenuda
				/*Scanner sc = new Scanner(System.in);
				
				System.out.println("introduce 2 numeros:");
				
				double long1 = sc.nextDouble();
				
				
				double long2 = sc.nextDouble();
				
				double resultado = Math.sqrt(Math.pow(long1, 2)+Math.pow(long2, 2));
				
				System.out.println("tus catetos son:"+long1+","+long2+"\ny el resultado es:"+resultado);
				
				sc.close();*/
				
		
		//calcula el volumen de una esfera 
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el volumen y radio:");
		
		double volumen = sc.nextDouble();
		double radio = sc.nextDouble();
		
		double resultado = (4/3)*Math.PI*Math.pow(radio, 3);
		
				
		System.out.println("volumen: "+volumen+"\nradio: "+radio+"\n resultado: "+resultado);
		
		sc.close();*/
		
		// **** revisar**** calcula el area de un trianguo en cuncion de las longitudes de sus lados
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce 3 longitudes del lado:");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		
		
		double p = (a+b+c)/2;
		double resultado = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		
		System.out.println(resultado);
		
		
		sc.close();*/
		
		
		//numero de 3 cifrar y muestra de 1 en 1
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un numero de 3 cifras:");
		
		int numero = sc.nextInt();
		
		
		System.out.println("Primera cifra de " + numero + " -> " + (numero/100));
        System.out.println("Cifra central de " + numero + " -> " + (numero/10)%10);
        System.out.println("Última cifra  de " + numero + " -> " + (numero%10));
		
		
		sc.close();*/
		
		//introduce un numero de 5 digitos y muestrado cne forma de triangulo
		
		/*Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca valor de numero de 5 cifras: ");
        N = sc.nextInt(); 
        System.out.println(N/10000);
        System.out.println(N/1000);
        System.out.println(N/100);
        System.out.println(N/10);
        System.out.println(N);*/
		
		
		 /*Scanner sc = new Scanner(System.in);
	        int N;
	        System.out.print("Introduzca valor de N: ");
	        N = sc.nextInt();               
	        System.out.println(N%10);
	        System.out.printf("%02d %n",N%100);
	        System.out.printf("%03d %n",N%1000);
	        System.out.printf("%04d %n",N%10000);
	        System.out.printf("%05d %n",N);*/
		
		
		//calcula si un numero es par o no 
		 /*Scanner sc = new Scanner(System.in);
	        int N;
	        System.out.print("Introduzca valor de numero: ");
	        N = sc.nextInt();  
	        
	        if (N%2 == 0) {
		        System.out.println(N+" es un numero par");

			}else {
		        System.out.println(N+" no es un numero par");

			}*/
		
		//calcula si es multiplo de 10 
		 /*Scanner sc = new Scanner(System.in);
	        int N;
	        System.out.print("Introduzca valor de numero: ");
	        N = sc.nextInt();  
	        
	        if (N%10 == 0) {
		        System.out.println(N+" es un multiplo de 10");

			}else {
		        System.out.println(N+" no es un multiplo de 10");

			}*/
		
		//comprueba si es mayuscula 
		/*Scanner sc = new Scanner(System.in);
        
        System.out.print("escribe una letra: ");
        char N = sc.nextLine().charAt(0);  
        
        if (Character.isUpperCase(N)) {
	        System.out.println(N+" esta en mayuscula");

		}else {
	        System.out.println(N+" no esta en mayusculas");

		}*/
		
		//comprueba si los 2 caracteres son iguales o no 
		/*Scanner sc = new Scanner(System.in);
		
        System.out.print("introduce 2 letras: ");
        char letra1 = sc.nextLine().charAt(0);  
        char letra2 = sc.nextLine().charAt(0);
        
        if (letra1 == letra2) {
        	System.out.println("son iguales: "+letra1+" y "+letra2);
			
		}else {
        	System.out.println("no son iguales: "+letra1+" y "+letra2);

		}*/
       
      //comprueba si es minuscula 
      		/*Scanner sc = new Scanner(System.in);
              
              System.out.print("escribe una letra: ");
              char N = sc.nextLine().charAt(0);  
              char c = sc.nextLine().charAt(0);  

              
              if (Character.isLowerCase(N)) {
      	        System.out.println(N+""+c+" esta en minuscula");

      		}else {
      	        System.out.println(N+""+c+" no esta en minuscula");

      		}*/
		
		//comprueba si es numero o no 
		/*Scanner sc = new Scanner(System.in);
        
        System.out.print("escribe un caracter: ");
        char N = sc.nextLine().charAt(0);  
        

        
        if (Character.isDigit(N) && N>0 ) {
	        System.out.println(N+" es un numero");
	        
		        System.out.println("es mayor");

		}else {
	        System.out.println(N+" no es un numero");


		}*/
		
		//realiza una division y que el divisor no sea 0
		
		/*Scanner sc = new Scanner(System.in);
        
        System.out.print("mete numeros para dividir: ");
        int N = sc.nextInt();  
        int D = sc.nextInt();
        

        
        if (N!=0) {
	        System.out.println(N/D);
	        

		}else {
	        System.out.println("no se puede");


		}*/
		
		
		//mete 3 numeros que formen una hora
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("mete 3 numeros: ");
        int H = sc.nextInt();  
        int M = sc.nextInt();
        int S = sc.nextInt();

        

        
        if (H<=24 && H<=59 && S<=59) {
	        System.out.println(+H+"h"+M+"m"+S+"s");
	        

		}else {
	        System.out.println("no se puede");

		}*/
		
		// mete un mes y muestra cuantos dias tiene ese mes
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("mete un numero entre 1 y 12: ");
        int M = sc.nextInt(); 
        if (M<=12 && M>=0) {
        	switch (M) {
			case 1:
				System.out.println("enero 31 dias");
				break;
			case 2:
				System.out.println("febrero 28 dias");
				break;
			case 3:
				System.out.println("marzo 31 dias");
				break;
			case 4:
				System.out.println("abril 30 dias");
				break;
			case 5:
				System.out.println("mayo 31 dias");
				break;
			case 6:
				System.out.println("junio 30 dias");
				break;
			case 7:
				System.out.println("julio 31 dias");
				break;
			case 8:
				System.out.println("agosto 31 dias");
				break;
			case 9:
				System.out.println("septiembre 30 dias");
				break;
			case 10:
				System.out.println("octubre 31 dias");
				break;
			case 11:
				System.out.println("noviembre 30 dias");
				break;
			case 12:
				System.out.println("diciembre 31 dias");
				break;

			default:
				break;
			}
			
		}else {
			System.out.println("no se puede");
		}*/
		
		//cambio de char a int
		/*int N = 5;
        double A = 4.56;
        char C = 'a';
        // int D = (int)(C);
        System.out.println("Variable N = " + N);
        System.out.println("Variable A = " + A);
        System.out.println("Variable C = " + C);
        System.out.println(N + " + " + A + " = " + (N+A));
        System.out.println(A + " - " + N + " = " + (A-N));
        System.out.println("Valor numérico del carácter " + C + " = " + (int)C);  */   
		
		//1 el doble de un numero
		/*Scanner sc = new Scanner(System.in);
		int doble = sc.nextInt()*2;
		System.out.println(doble);*/
		
		//2 el triple de un numero
		/*Scanner sc = new Scanner(System.in);
		int triple = sc.nextInt()*3;
		System.out.println(triple);*/
		
		//3 6 veces la diferencia de 2 numeros
		/*Scanner sc = new Scanner(System.in);
		System.out.printf("introduce dos numero; ");
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A>=B) {
			System.out.println((A-B)*6);
		}*/
		
		
		//4 La diferencia entre el producto de A por B y la suma de C más D
				/*Scanner sc = new Scanner(System.in);
				System.out.printf("introduce 4 numero; ");
				int A = sc.nextInt();
				int B = sc.nextInt();
				int C = sc.nextInt();
				int D = sc.nextInt();

					System.out.println((A*B)-(C+D));*/
		//5 La mitad de la última cifra de un número entero A
		/*Scanner sc = new Scanner(System.in);
		System.out.printf("introduce dos numero; ");
		int A = sc.nextInt();
		

			System.out.println(A%10/2);*/
		
		//6 La suma de los dígitos de un número entero N de 3 cifras
				/*Scanner sc = new Scanner(System.in);
				System.out.printf("introduce dos numero; ");
				
				int A = sc.nextInt();
				
				System.out.println(A/100 + A%10 + A/10%10);*/
		//7 La suma de la última cifra de los números enteros N y M
		/*Scanner sc = new Scanner(System.in);
		System.out.printf("introduce dos numero; ");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println( A%10+B%10);*/
		//8 Comprobar si un número entero N es múltiplo de 2 y de 3
		
				/*Scanner sc = new Scanner(System.in);
				System.out.printf("introduce 1 numero; ");
				
				int A = sc.nextInt();
				
				if (A%2==0 && A%3==0) {
					System.out.println("si");
					
				}		*/
				
				//9 Comprobar si la última cifra de un número entero N es par
				
				/*Scanner sc = new Scanner(System.in);
				System.out.printf("introduce 1 numero; ");
				
				int A = sc.nextInt();
				
				if (A%10%2==0) {
					System.out.println("es par");
				}System.out.println("no es par");*/
				
				//10. Comprobar si la primera cifra de un número entero N de 3 cifras es impar
		
				
				/*Scanner sc = new Scanner(System.in);
				System.out.printf("introduce 1 numero; ");
				
				int A = sc.nextInt();
				
				if (A/100%2!=0) {
					System.out.println("es impar");
				}System.out.println(" es par");*/
		
		
		
		
		
		//11. Comprobar si la primera cifra de un número entero N de 4 cifras es par

		/*Scanner sc = new Scanner(System.in);
		System.out.printf("introduce 1 numero; ");
		
		int A = sc.nextInt();
		
		if (A/1000%2!=0) {
			System.out.println("es impar");
		}else {
			System.out.println("es par");

		}*/
		
		
		//12. Comprobar si una variable A de tipo carácter contiene una letra mayúscula
		
		/*Scanner sc = new Scanner(System.in);
		System.out.printf("introduce 1 numero; ");
		
		char A = sc.nextLine().charAt(0);
		if (Character.isUpperCase(A)) {
			
			System.out.println("si, es una letra mayuscula");
			
		}*/
		
		//13. Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula
		
				/*Scanner sc = new Scanner(System.in);
				System.out.printf("introduce 1 numero; ");
				
				char A = sc.nextLine().charAt(0);
				if (A>='A' && A<='Z' || A>='a' && A<='z') {
					
					System.out.println("si, es una letra mayuscula");
			
				}*/
		
		//14. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula
		
		/*Scanner sc = new Scanner(System.in);
		System.out.printf("introduce 1 numero; ");
		
		char A = sc.nextLine().charAt(0);
		if (A>'a' && A<'z' ) {
			System.out.println("no, es una letra minuscula");
		}else {
			System.out.println("si, es una letra mayuscula");
		}*/
		
		
		//15. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula o minúscula

		/*Scanner sc = new Scanner(System.in);
		System.out.printf("introduce 1 numero; ");
		
		char A = sc.nextLine().charAt(0);
		if (A < 'A' || A > 'Z') && ( A < 'a' || A > 'z') {
			
			System.out.println("contiene");
	
		}else {
			System.out.println("no tiene nada");
		}*/
		
		/*int A = 0;
		
		while (A<100) {
			A++;
			System.out.println(A);*/
		
		//16. Comprobar si el contenido de la variable N termina en 0 ó en 7
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("escribe un numero:");
		
		int n = sc.nextInt();
		
		if (n%10== 0 || n%10==7) {
			System.out.println("el numero introducido termina en 0 o en 7");
			
		}else {
			System.out.println("tiene otra terminacion");
		}*/
		
		//17. Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce un precio");
		
		int precio = sc.nextInt();
		
		if (precio >=10 && precio<50 ) {
			
			System.out.println("precio mayor o igual a 10 y menos que 50");
		}else {
			System.out.println("precio no coincide");

			
		}*/
		
		//18. Modificar el valor de la variable entera N incrementándolo en 77. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 87.
		
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("inserte un numero");
		
		int numero = sc.nextInt()+77;
		
		System.out.println("tu numero es: "+numero);*/
		
		//Escribe un programa java que declare una variable A de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
		
	       /* int A = 14;
	        System.out.println(A + (A%2==0 ? " es par " : " es impar "));  */
		
		//Escribe un programa java que declare una variable B de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
		/*int A = -1;
        System.out.println(A + (A<0 ? " es negativo " : " es positivo "));  */
        
		/*System.out.println("introduce un numero ");
		
		Scanner sc = new Scanner(System.in);
		
        int A = sc.nextInt();
        System.out.println(A + (A<0 ? " es negativo " : " es positivo "));  
        System.out.println(A + (A%2==0 ? " es par " : " es impar ")); 
        System.out.println(A + (A%10==0 ? " es multiplo de 10 " : " no es multiplo de 10 "));
        System.out.println(A + (A%5==0 ? " es multiplo de 5 " : " no es multiplo de 5 "));
        System.out.println(A + (A<100 ? " es menor de 100 " : " es mayor de 100 "));*/
	
		//bucles for, while, do while, de 100 a 0 y de 0 a 100
		
		/*int a = 0;
		
		do {
			a++;
			System.out.println(a);
			
		} while (a<100);
		
		for (int i = 1; i < 100; i++) {
			System.out.println(i);
			
		}
		
		int c = 100;
		
		do {
			c--;
			System.out.println(c);
			
		} while (a<100);
		
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
			
		}
		
		int d = 100 ;
		
		while (d>0) {
			System.out.println(d);
			d--;
		}*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("inserte un numero mayor a 1");
		
		int s = sc.nextInt() ;
		sc.close();
		while (s>1) {
			System.out.println(s);
			s--;
		}*/
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("inserte un numero mayor a 1");
		int mayor = sc.nextInt() ;
		
		System.out.println("inserte un numero menor de 100");
		int menor = sc.nextInt() ;
				
		sc.close();
		while (menor<mayor) {
			System.out.println(menor);
			menor++;
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inserte un numero:");
		int numero1 = sc.nextInt() ;
		
		System.out.println("inserte un segundo numero;");
		int numero2 = sc.nextInt() ;
				
		sc.close();
		if (numero1 < numero2) {
			while (numero1<numero2) {
				if (numero1%2==0) {
					System.out.println(numero1);
					
				}	
				numero1++;
			}
			
		}else {
			while (numero1>numero2) {
				if (numero1%2==0) {
					System.out.println(numero1);
					
				}	
				numero1--;
			}
			
			
			
			
			
		}
		
		
		
					
	}	
	

				

}
