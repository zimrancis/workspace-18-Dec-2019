package common;
interface Drawable {
	void draw();

	default void msg() {
			System.out.println("default method");
	}

	default void msg2() {
			System.out.println("default method2");
	}

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
interface Musics {

	default void info() {
		System.out.println("default music");
	}
}
interface Dances {

	default void info() {
		System.out.println("default dance");
	}
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
		msg();
	}
}

class Performanec implements Musics, Dances {
	public void info() {
		System.out.println("The Particular methods are called From myOwn:");
		Musics.super.info();
		Dances.super.info();
	}
}

class TestInterfaceDefault {
	public static void main(String args[]) {
		Drawable draw = new Rectangle();
		draw.draw();
		draw.msg();
		Performanec p=new Performanec();
		p.info();
		Musics m=new Performanec();
		m.info();
		Dances d=new Performanec();
		d.info();
	}
}
