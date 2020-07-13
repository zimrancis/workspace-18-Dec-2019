package constructorreference.constructor.prototype;

class Const {

	public Const(){
		System.out.println("OneTime Execution");
   	}

   	public void show(int i) {
		String objname = "instance"+i;
		System.out.println(objname + " hash:" + objname.hashCode());
		//return "In show";
    }
}

public class ConstructorTest {
	public static void main(String[] args) {
		Const ct1 = new Const();
		Const ct2 = new Const();
		ct1.show(1);
		ct2.show(2);
	}
}