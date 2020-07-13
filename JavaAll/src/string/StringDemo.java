package string;

public class StringDemo {

	static String s0 = "Zobair";

	public static void main(String[] args) {
		StringDemo.s0 = s0 + " Imran";
		System.out.println("s0: " + StringDemo.s0/* =" Imran" */);

		String s1 = new String("Zobair");
		System.out.println("s1: before: " + s1);
		s1.concat("Imran");
		System.out.println("s1: after: " + s1);
		String s2 = new String("Zobair");
		String s01 = s2.concat("Imran");
		System.out.println("s2: " + s01);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s01);

		StringBuffer sb1 = new StringBuffer("Zobair");
		sb1.append("-Imran");
		StringBuffer sb2 = new StringBuffer("Zobair");
		sb1.append("-Imran");
		System.out.println("s3: " + sb1);
		StringBuilder sbd = new StringBuilder("Zobair_");
		sbd.append("Imran");
		System.out.println("s4: " + sbd);
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		//System.out.println(sb1.equals(sbd));
		System.out.println("");

	}
}
