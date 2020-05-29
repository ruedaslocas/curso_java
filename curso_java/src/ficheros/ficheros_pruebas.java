package ficheros;

import java.io.*;

public class ficheros_pruebas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//flujo de escrituras hacia archivos... con true añade nueva linea
		FileWriter fw = new FileWriter("prueba.txt");
		//
		PrintWriter pw = new PrintWriter(fw);
		
		String cadena = "quiero comer una pechuga de pollo por que tengo mucha hambre y soy deportsta";
		
		pw.println(cadena);
		pw.println("112122134433422511234123412314");

		
		//para lanzar y limpiar el buffer
		//pw.flush();
		pw.close();
		fw.close();
		
		//para leer ficheros
		
		FileReader fr =new FileReader("prueba.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		String linea ;
	
		while ((linea = br.readLine()) !=null) {
			System.out.println(linea);
		}
		
		br.close();
		fr.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
