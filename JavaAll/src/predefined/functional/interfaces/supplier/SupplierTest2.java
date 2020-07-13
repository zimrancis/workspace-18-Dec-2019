package predefined.functional.interfaces.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest2 {

	public static void main(String[] args) {
		Supplier<Date> s = ()-> new Date();
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.print("\n");		
			
		
		Supplier<String> ss = ()-> {
			//otp means one time password
			String otp = "";
			for(int i=0; i<6; i++) { 
				otp=otp+(int) (Math.random()*10);
			} return otp;
		};

		System.out.println(ss.get());
		System.out.println(ss.get());
		System.out.println(ss.get());
		System.out.println(ss.get());
		System.out.println(ss.get());
		
		
		//String[] str = {"Sunny","Bunny","Chinny","Punny","Gunny"};
		
		Supplier<String> supply = () -> {
			String[] str = {"Sunny","Bunny","Chinny","Punny","Gunny"};
			int x = (int)(Math.random()*5);
			return str[x];
		};
		System.out.println(supply.get());
		System.out.println(supply.get());
		System.out.println(supply.get());
		System.out.println(supply.get());
		System.out.println(supply.get());
	}
}
