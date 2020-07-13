package common;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaListSort {

    /**
     * This class shows how to sort ArrayList in java
     * @param args
     */
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        //using Collections.sort() to sort ArrayList
        Collections.sort(strList);
        for(String str: strList) System.out.print(" "+str);


        List<Data> dl = new ArrayList<>();
				dl.add(new Data(2));
				dl.add(new Data(3));
				dl.add(new Data(1));
				System.out.println("Original List::"+dl);
				Collections.sort(dl);
				System.out.println("Naturally Sorted List::"+dl);

			}

		}

		class Data implements Comparable<Data> {

			private int id;

			public Data(int i) {
				this.id = i;
			}

			@Override
			public int compareTo(Data d) {
				return this.id - d.getId();
			}

			public int getId() {
				return id;
			}

			@Override
			public String toString() {
				return "Data{"+this.id+"}";
			}
}
