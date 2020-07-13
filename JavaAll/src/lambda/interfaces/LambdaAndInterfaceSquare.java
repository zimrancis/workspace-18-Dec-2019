package lambda.interfaces;

interface SquareInterF {
	public void squareIt(int n);
}
interface SquareInterF2 {
	public int squareIt(int n);
}

class LambdaAndInterfaceSquare {

	public static void main(String [] args) {

		SquareInterF sif = n-> System.out.println("Sqre of: "+n+" is:"+ (n*n));
		sif.squareIt(5);

		SquareInterF2 sif2 = n-> {return n*n;};
		System.out.println("Sqre of: "+sif2.squareIt(5));
	}

}