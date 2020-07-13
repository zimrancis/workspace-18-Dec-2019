package lambda.interfaces;

class LambdaAndInterface {
	public static void main(String[] args) {
		LambdaAndInterface li = new LambdaAndInterface();
		MathInterface addition = (int a, int b) -> a + b;
		MathInterface subtraction = (int a, int b) -> a - b;

		System.out.println("10 + 5 = " + li.methodForInterface(10, 5, addition));
		System.out.println("10 - 5 = " + li.methodForInterface(10, 5, subtraction));

	}

	interface MathInterface {
		public int operate(int a, int b);
	}

	public int methodForInterface(int a, int b, MathInterface mathInterface) {
		return mathInterface.operate(a, b);
	}

}