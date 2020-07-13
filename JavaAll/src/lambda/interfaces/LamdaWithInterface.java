package lambda.interfaces;

public class LamdaWithInterface {

	interface calCulation {
		public int execute(int a, int b);

	}

	public static int calCulator(int a, int b, calCulation calculation) {

		return calculation.execute(a, b);
	}

	public static void main(String[] args) {

		calCulation addition = (int a, int b) -> a + b;
		calCulation subtraction = (int a, int b) -> a - b;

		System.out.println("10 + 5 = " + calCulator(10, 5, addition));
		System.out.println("10 - 5 = " + calCulator(10, 5, subtraction));
	}

}
