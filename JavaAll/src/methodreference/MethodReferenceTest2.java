package methodreference;

interface Interf {
	public int add(int v1, int v2);
}

public class MethodReferenceTest2 {

	public static int m1(int v1, int v2) {

		return v1 + v2;
	}
	
	public void m2(int v1, int v2) {

		System.out.println("Sum of: "+ (v1+v2));
	}

	public static void main(String[] args) {

		Interf i = (a, b) -> a + b;
		{
			System.out.println(i.add(40, 60));
		}
		;

		Interf i2 = MethodReferenceTest2::m1;
		System.out.println(i2.add(30, 20));
		
		MethodReferenceTest2 mrt = new MethodReferenceTest2();
		mrt.m2(40, 50);

	}
}
// If the implementation is available we should go for method reference
// If the implementation is not available we should go for Lambda Expression
