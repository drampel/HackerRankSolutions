package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class AppleAndOrange {
    static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int applesCount = (int) apples.stream()
                .filter(appleDistance -> a + appleDistance >= s && a + appleDistance <= t)
                .count();
        int orangesCount = (int) oranges.stream()
                .filter(orangeDistance -> b + orangeDistance >= s && b + orangeDistance <= t)
                .count();
        System.out.printf("%d%n%d", applesCount, orangesCount);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int s = scan.nextInt();
            int t = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int m = scan.nextInt();
            int n = scan.nextInt();
            List<Integer> apples = IntStream.range(0, m)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            List<Integer> oranges = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            countApplesAndOranges(s, t, a, b, apples, oranges);
        }
    }
}