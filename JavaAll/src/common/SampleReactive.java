package common;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;

public class SampleReactive {

	public static void main(String... args) {
		Flowable.<Integer>create(emitter -> emit(emitter), BackpressureStrategy.BUFFER)
		.map(data -> data*1)
		.subscribe(data -> System.out.println(data));

		System.out.println("got the flowable");
	}

	private static void emit(FlowableEmitter<Integer> emitter) {
		System.out.println("starting to emit");

	}
}