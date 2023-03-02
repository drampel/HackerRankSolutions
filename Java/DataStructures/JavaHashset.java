package Java.DataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        /* For Java 7 and Java 8, just add the bottom six lines to existing code. */
        s.close();
        Set<List<String>> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            set.add(Arrays.asList(pair_left[i], pair_right[i]));
            System.out.println(set.size());
        }

    }

    /* For Java 15, it's also possible to use the version of the main() method below. */

//    public static void main(String[] args) {
//        try (Scanner scan = new Scanner(System.in)) {
//            int t = Integer.parseInt(scan.nextLine());
//            Set<String> set = new HashSet<>();
//            while (t-- > 0) {
//                set.add(scan.nextLine().replaceAll("\\s+", " ").strip());
//                System.out.println(set.size());
//            }
//        }
//    }
}