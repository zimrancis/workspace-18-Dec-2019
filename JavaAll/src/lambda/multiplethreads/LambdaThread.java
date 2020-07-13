package lambda.multiplethreads;

/*class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {			
			try {
				System.out.println("I'm from Thread class");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
*/
public class LambdaThread {
	
	public static void main(String[] args) throws InterruptedException {
/*		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("I'm from Main class");
			Thread.sleep(1000);			
		}		
	}*/
		Runnable r =() -> {
			try {
				for(int i=0; i<10; i++) {
					System.out.println("Child Thread-1");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
			Thread t = new Thread(r);
			t.start();
			for(int i=0; i<10; i++) {
				System.out.println("main Thread-1");
				Thread.sleep(1000);			
			}
		}
}
