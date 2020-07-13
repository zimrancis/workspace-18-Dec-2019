package anonymous;

class AnonymousThread {
	public static void main(String... ar) {

		Thread t = new Thread() { // Creating an object of Anonymous class which extends Thread class and passing
									// this object to the reference of Thread class.
			public void run() { // Anonymous class overriding run() method of Thread class
				
				setName("Anonymous Thread");
				System.out.println("Name of the other thread - " + getName());
				
				for (int i = 0; i < 3; i++) {
					System.out.println(getName() + " " + i);
				}
			}
			
		}; // Anonymous class ends here

//Starting anonymous thread
		t.start();

//Gets the name of main thead
		System.out.println("Name of main thread - " + Thread.currentThread().getName());
	}
}
