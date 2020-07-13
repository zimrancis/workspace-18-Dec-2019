package common;
import io.reactivex.Observable;
import java.util.List;
import java.util.ArrayList;

class StockServer {
	public static Observable<StockInfo> getFeed(List<String>  symbols) {
		System.out.println("create...");
		return null;
	}
}


class Sample {
	public static void main(String... args) {
		//List<String>  symbols = Arrays.asList("GOOG","AMZN","ITC");
		var  symbols = Arrays.asList("GOOG","AMZN","ITC");

		Observable<StockInfo> feed = StockServer.getFeed(symbols);
		System.out.println("got observable...");
	}
}