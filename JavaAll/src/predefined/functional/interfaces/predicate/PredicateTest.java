package predefined.functional.interfaces.predicate;

import java.util.function.Predicate;

class LengthTest {

}

public class PredicateTest {

	public static void main(String[] args) {

		Predicate<Integer> p1 = I -> I % 2 == 0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(15));

		Predicate<String> s1 = I -> I.length() > 5;
		System.out.println(s1.test("Zobair"));
		System.out.println(s1.test("Imran"));

		Predicate<String> s2 = s -> {
			int b = 5;
			if (s.length() < b) {
				System.out.println(s + " is lesser length then " + b);
				return true;
			} else {
				System.out.println(s + " is greater length then " + b);
				return false;
			}
		};
		s2.test("ouygeg ge");

		// Print the String values of the array which are greater in length than 5

		String[] string = { "abddh", "tryrteeed", "rty", "ertert", "uyty", "uiyu", "yetutyutyuy" };
		int temp = 5;
		Predicate<String> p4 = s -> s.length() > temp && s.length() % 2 == 0;

		for (String s3 : string) {
			if (p4.test(s3)) {
				System.out.println("ss1: " + s3);
			}
		}

		int[] x = { 0, 5, 10, 15, 20, 25, 30, 35 };
		int temp3 = 2;
		int temp4 = 10;
		Predicate<Integer> p5 = i1 -> i1 % temp3 == 0;
		Predicate<Integer> p6 = i2 -> i2 > temp4;

		System.out.println("\nWhich are Even and > than 10");
		for (int f : x) {
			if (p5.and(p6).test(f)) {
				System.out.println(f);
			}
		}
		System.out.println("\nWhich are Even or > than 10");
		for (int f : x) {
			if (p5.or(p6).test(f)) {
				System.out.println(f);
			}
		}
		System.out.println("\n Which are negate of Even");
		for (int f : x) {
			if (p5.negate().test(f)) {
				System.out.println(f);
			}
		}

	}

}
