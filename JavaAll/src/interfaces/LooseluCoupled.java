package interfaces;
/*
 * This program is designed and developed by Zobair
 * Software Engineer in JAVA
 * University of Derby
 * 
 * */

import java.util.Scanner;

interface Database {
	public abstract void myDatabase();
}

class Oracle implements Database {
	@Override
	public void myDatabase() {
		System.out.println("Oracle Database is connected");

	}
}

class MySQL implements Database {
	@Override
	public void myDatabase() {
		System.out.println("MySQL Database is connected");

	}
}

class NoDriverClassFound implements Database {
	@Override
	public void myDatabase() {
		System.out.println("NoDriverClassFound...!");

	}
}

class Input {

	static Database db;

	public static Database yourInput(String adb) {

		if (adb.equals("MySQL")) {
			db = new MySQL();
			db.myDatabase();
			return db;
		} else if (adb.equals("Oracle")) {
			db = new Oracle();
			db.myDatabase();
			return db;
		} else {
			db = new NoDriverClassFound();
			db.myDatabase();
			return db;
		}

	}

}

public class LooseluCoupled {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Database name you want to get connect with: ");
		String str = scan.nextLine();
		Input.yourInput(str);

	}

}
