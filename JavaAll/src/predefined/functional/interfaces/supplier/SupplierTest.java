package predefined.functional.interfaces.supplier;

/*@64 !33 $36 %37 &38 (40 )41 048
_95 -45 —196 #35 ?63; [91 ]93
{123 }125 |124 "34 <60 >62 =61
^94  /47 \92 ~126 */

import java.util.Arrays;
import java.util.List;

/*class SupplierTest implements Supplier<String>{

	public String get() {
		return "This is Zobair";
	}

	public static void main(String [] args) {
		Supplier<String> pd = new SupplierTest();
		System.out.println(pd.get());
	}
}*/

class SupplierTest {

	public static void main(String [] args) {
		//Supplier<String> supplier = () -> "This is Zobair";
		//System.out.println(supplier.get());

		List<String> list = Arrays.asList("i", "s");
		//List<String> list = Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(() -> "This is Zobair"));


	}
}
