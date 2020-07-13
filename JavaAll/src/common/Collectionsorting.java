package common;
import java.util.*;

public class Collectionsorting
{
    public static void main(String[] args)
    {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");
        Collections.sort(al);
        System.out.println(" :\n" + al);

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al, Collections.reverseOrder());

        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + al);

        ArrayList<Integer> intl = new ArrayList<>();
        intl.add(68);
        intl.add(25);
        intl.add(17);
        intl.add(83);
        intl.add(32);
        Collections.sort(intl);
        System.out.println(" :\n" + intl);

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(intl, Collections.reverseOrder());

        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + intl);

    }
}