package common;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSortExample {

    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i=0;i<10;i++) {
            list.add((int) (Math.random() * 100));
        }

        System.out.println("Initial List: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted List: "+list);

    }
}