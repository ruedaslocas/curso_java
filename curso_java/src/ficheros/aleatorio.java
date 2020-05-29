package ficheros;

import java.util.Date;
public class aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Date d = new Date();
		System.out.println(d);
		int Dado = (int)(Math.random() *6)+1;
		System.out.println(Dado);

	}
	
	
	
	
	private static int dado (int caras) {
		//ponemos un return
		return (int)(Math.random()*6)+1;
	}

}
