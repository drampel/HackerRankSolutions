package Algorithms.Implementation;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BetweenTwoSets {
    static int getTotalX(List<Integer> listA, List<Integer> listB) {
        int maxNumberListA = Collections.max(listA);
        int minNumberListB = Collections.min(listB);
        int count = 0;
        outerLoop:
        for (int i = maxNumberListA; i <= minNumberListB; i += maxNumberListA) {
            for (int element : listA) {
                if (i % element != 0) continue outerLoop;
            }
            for (int element : listB) {
                if (element % i != 0) continue outerLoop;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            List<Integer> listA = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            List<Integer> listB = IntStream.range(0, m)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(getTotalX(listA, listB));
        }
    }
}