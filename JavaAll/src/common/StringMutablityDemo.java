package common;
public class StringMutablityDemo {
	public static void main(String []args) {

		String string_immutable = new String("Zobair");
		String s2 = string_immutable.concat(" Soft");

		System.out.println(s2);
		System.out.println("");
		System.out.println("String is immutable " +string_immutable);
		System.out.println("");

		StringBuffer string_mutable = new StringBuffer("Zobair");
		string_mutable.append("Soft");
		System.out.println("StringBuffer is mutable " + string_mutable);
		System.out.println("");


		String s3 = new String("Zobair");
		String s4 = new String("Zobair");
		String s5 = s4;
		String s6 = s4;

		System.out.print(s5==s6);
		System.out.print("\t");
		System.out.print(s3==s4);
		System.out.print("\t");
		System.out.print(s5==s3);
		System.out.print("\t");
		System.out.println(s3.equals(s4));
		System.out.println("\n");


	}
}