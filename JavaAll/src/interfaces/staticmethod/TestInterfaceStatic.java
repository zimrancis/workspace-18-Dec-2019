package interfaces.staticmethod;

interface Drawable {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}

	static int square(int x) {
		return x * x;
	}

	static int squareRoot(int x) {
		return (int) Math.sqrt(x);
	}

}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceStatic {
	public static void main(String args[]) {
		Drawable d = new Rectangle();
		d.draw();
		System.out.println(Drawable.cube(3));
		System.out.println(Drawable.square(6));
		System.out.println(Drawable.squareRoot(9));
	}
}
