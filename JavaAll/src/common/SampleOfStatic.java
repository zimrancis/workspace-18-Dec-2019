package common;
public interface SampleOfStatic {
	public static void main(String... args) {
	 	Runnable r = () -> {for(int i=0; i<10; i++) {System.out.println("Child Thread!");}};
		Thread t = new Thread(r);
		 t.start();
	}
}