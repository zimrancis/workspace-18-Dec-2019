package gc;

public class GcTest {

	   public static void main(String[] args) {

	      Runtime runtime = Runtime.getRuntime();

	      Object[] obj = new Object[500];
	      for (int j = 0; j < 5; j++) {
	         System.out.println("Free Memory="
	         + runtime.freeMemory());
	         for (int i = 0; i < 500; i++) {
	            obj[i] = new Object();
	         }
	         System.out.println("Iteration: "+j
	         + " Free Memory is " + runtime.freeMemory());
	         System.gc();
	         System.out.println("gc called, free Memory now is "
	         + runtime.freeMemory());
	         System.out.println("--------------------------");

	      }
	   }
	}