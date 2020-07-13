package multithreading;

class RandomNumberGen {
	
	int random;
	
	public int toInt() {
		random = (int)(Math.random() * 1000 + 1);
		//String s = Integer.toString(random);
		return random;
	}
}

abstract class Bank {

	public void deposite() {
		System.out.println("Deposite method accross all Banks");
	}

	public void withdraw() {
		System.out.println("Withdraw method accross all Banks");
	}

	public abstract int celculateInterest();
}

class DBBL extends Bank {

	@Override
	public int celculateInterest() {
		System.out.println("DBBL-Bank calculate interest Implementation");
		return 0;
	}
}

class IFIC extends Bank {

	public void withdraw() {
		System.out.println("Common Withdraw method implementation accross all IFIC-Banks");
	}

	@Override
	public int celculateInterest() {
		System.out.println("IFICBank calculate interest Implementation");
		return 0;
	}
}



public class AccountAutoUpdate {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(new RandomNumberGen());
		}
		
	}

}
