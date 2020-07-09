package poo;

public class excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5, b = 0, div;
		try {
			// div = a / b;

			// System.out.println(div);

			String prueba = null;

			System.out.println(prueba.toString());

		} catch (ArithmeticException e) {
			System.out.println("la division da un error");

		} catch (NullPointerException e) {
			System.out.println("puntero nulo");
		} catch (Exception e) {
			System.out.println("error no esperado");
		e.printStackTrace();
		}finally {
			System.out.println("me ejecuto siempre");
		}
		System.out.println("fin");

	}

}
