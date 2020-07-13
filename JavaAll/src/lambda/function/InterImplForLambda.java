package lambda.function;

/*
 * interface IntrF { public void m1(); }
 * 
 * class IntrFImpl implements IntrF {
 * 
 * @Override public void m1() { System.out.println("Hello...");
 * 
 * }
 * 
 * }
 * 
 * public class InterImplForLambda {
 * 
 * public static void main(String[] args) { //IntrFImpl ii = new IntrFImpl(); OR
 * IntrF ii = new IntrFImpl(); ii.m1(); }
 * 
 * }
 */
interface IntrF {
	public void m1();
}

interface IntrF2 {
	public void m1(int a, int b);	
}

public class InterImplForLambda {	
	public static void main(String[] args) {
		IntrF ii = () -> System.out.println("Hello...");
		ii.m1();
		ii.m1();
		ii.m1();
		
		IntrF2 ii2 =(a,b) -> System.out.println("The Sum: "+(a+b));
		ii2.m1(10,20);
		ii2.m1(100,200);
		ii2.m1(1000,2000);
		
	}
	
	/*
	 * 
	 * condition==> if(x>10) {
	 * 				}
	 * Functionality==> like increment or decrement like x=x+1;
	 *  Accept some object and doing 
	 *  something with object like==> accept(Object) {
	 *                                }
	 * I want some connection object like==> getConnection()
	 * 
	 * for all these requirements happily we can go with LambdaE
	 */

}