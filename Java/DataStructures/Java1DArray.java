package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Java1DArray {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            /* For Java 7 and Java 8, just add the bottom two lines to existing code. */
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) a[i] = scan.nextInt();

            for (int arr : a) System.out.println(arr);
        }
    }

    /* For Java 15, it's also possible to use the version of the main() method below. */

//    public static void main(String[] args) {
//        try (Scanner scan = new Scanner(System.in)) {
//            List<Integer> list = new ArrayList<>();
//            IntStream.range(0, scan.nextInt()).forEach(i -> list.add(scan.nextInt()));
//            list.forEach(System.out::println);
//        }
//    }
}