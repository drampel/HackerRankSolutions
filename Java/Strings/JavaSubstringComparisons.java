package Java.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSubstringComparisons {
    /* For Java 7 and Java 8, just add the first version of the getSmallestAndLargest() method to existing code. */
    public static String getSmallestAndLargest(String s, int k) {                          //1
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            if (sub.compareTo(smallest) < 0) smallest = sub;
            if (sub.compareTo(largest) > 0) largest = sub;
        }
        return String.format("%s%n%s", smallest, largest);
    }

    /* For Java 15, it's also possible to use the second or third version of the getSmallestAndLargest() method. */

//    public static String getSmallestAndLargest(String s, int k) {                        //2
//        SortedSet<String> set = new TreeSet<>();
//        for (int i = 0; i <= s.length() - k; i++) set.add(s.substring(i, i + k));
//        return String.format("%s%n%s", set.first(), set.last());
//    }

//    public static String getSmallestAndLargest(String s, int k) {                        //3
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i <= s.length() - k; i++) list.add(s.substring(i, i + k));
//        Collections.sort(list);
//        return String.format("%s%n%s", list.get(0), list.get(list.size() - 1));
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(getSmallestAndLargest(scan.next(), scan.nextInt()));
        scan.close();
    }
}