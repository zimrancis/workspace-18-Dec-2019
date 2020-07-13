package methodreference;

public class MethodReferenceTest {

	// In the case of method reference different  return types are allowed
	// but only restriction-> argument type must be matched
	private static int m() { 
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread-1");
		} return 10;
	}

	public static void main(String[] args) {
//
//		Runnable r = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Child Thread-1");
//			}
//		};
		Runnable r = MethodReferenceTest::m;
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread-1");
		}

	}

}
