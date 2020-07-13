package common;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.List;
import java.util.Date;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;

class Movie {

	String name;

	Movie(String name) {
		this.name=name;
	}
}

interface SampleOfConsumerChainning {
	public static void main(String... args) {

		Consumer<Movie> c1 = m -> {System.out.println(m.name+" ready to release");};
	  	Consumer<Movie> c2 = m -> {System.out.println(m.name+" released but it is bigger flop!!!");};
	  	Consumer<Movie> c3 = m -> {System.out.println(m.name+" storing information in database");};
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		//.andThen() is available in both Function as well as Consumer also
		//but .compose()is not available in Consumer but Function only!

	  Movie m = new Movie("Spider");
	  cc.accept(m);


	  Supplier<Date> s = () -> new Date();
      System.out.println("\n"+s.get());

      Supplier<String> r = () -> {
		  String otp="";
		  for(int i=0; i<6; i++) {
			  otp = otp+(int)(Math.random() *10);
		  }
		  return otp;
	  };

	for(int i=0; i<10; i++) {
		System.out.println("\n"+r.get());
	}
  }

}