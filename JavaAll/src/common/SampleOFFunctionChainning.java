package common;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;

public interface SampleOFFunctionChainning {

	public static void main(String... args) {

			Function<Integer,Integer> f1 = i->2*i;
			Function<Integer,Integer> f2 = i->i*i*i;
			Function<Integer,Integer> f3 = i->i*i;

			System.out.println(f1.andThen(f2).apply(2));
			System.out.println(f1.compose(f2).apply(2));
			System.out.println(f1.andThen(f2).andThen(f3).apply(2));

 }
}