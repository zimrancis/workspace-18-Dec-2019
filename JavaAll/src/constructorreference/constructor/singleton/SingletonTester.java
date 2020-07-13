package constructorreference.constructor.singleton;

import constructorreference.constructor.singleton.eagerinitialization.SingletonEI;
import constructorreference.constructor.singleton.lazyinitialization.SingletonLI;

public class SingletonTester {

	   public static void main(String[] args) {
	        SingletonEI instance1 = SingletonEI.getInstance();
	        SingletonEI instance2 = SingletonEI.getInstance();
	        System.out.println("Instance 1 hash:" + instance1.hashCode());
	        System.out.println("Instance 2 hash:" + instance2.hashCode());

	        System.out.println("\n\n");

	        SingletonLI instance3 = SingletonLI.getInstance();
	        SingletonLI instance4 = SingletonLI.getInstance();
	        System.out.println("Instance 3 hash:" + instance3.hashCode());
	        System.out.println("Instance 4 hash:" + instance4.hashCode());

	   }

	}