package predefined.functional.interfaces.consumer;

import java.util.Arrays;
import java.util.List;

/*class ConsumerTest implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Printing: " +t);
	}

	public static void main(String [] args) {
		Consumer<Integer> pd = new ConsumerTest();
			pd.accept(10);
	}
}*/

/*class ConsumerTest {

	public static void main(String [] args) {
		Consumer<Integer> consumer = t -> System.out.println("Printing: " +t);
		consumer.accept(10);
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().forEach(consumer);
	}
}*/
class ConsumerTest {
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().forEach(t -> System.out.println("Printing: " +t));
	}
}
