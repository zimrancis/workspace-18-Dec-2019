package datastructure;
/**
 * This program is explicitly written 
 * by @Zobair Al-Imran 
 * Software Engineer
 * 8/22/2019 Thursday
 * @7:15am 
 * 
 * */
public class FibonacciSeries {
	int x = 0, y = 1, value = 0;

	void fivN(int f) {
		if (f <= 0)
			System.out.print("INVALID");
		for (int i = 0; i < f; i++) {
			if ((i >= 0) && (i < 2)) {
				System.out.print(i + " ");
			} else if (i > 1) {
				value = x + y;
				System.out.print(value + " ");
				x = y;
				y = value;
			}
		}
	}

	public static void main(String[] args) {
		FibonacciSeries f = new FibonacciSeries();
		f.fivN(15);
	}
}