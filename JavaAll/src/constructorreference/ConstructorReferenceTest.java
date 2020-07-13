package constructorreference;

class Sample {

	public Sample() {
		System.out.println("Sample class onstructor Reference...");
	}
	
	public Sample(String s) {
		System.out.println("Sample class onstructor Reference..."+s);
	}
}

interface Interf {
	public Sample get();
}
interface Interf2 {
	public Sample get(String s);
}

public class ConstructorReferenceTest {

	public static void main(String[] args) {

		Interf i = Sample::new;
		/* Sample s1 = */ i.get();
		/* Sample s2 = */ i.get();
		/* Sample s3 = */ i.get();
		/* Sample s4 = */ i.get();
		Interf2 i2 = Sample::new;
		/* Sample s5 = */ i2.get("Zobair");
		/* Sample s6 = */ i2.get("Imran");
		
		
	}
}
// If the implementation is available we should go for method reference
// If the implementation is not available we should go for Lambda Expression
