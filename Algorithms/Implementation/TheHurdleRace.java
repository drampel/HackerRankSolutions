package Algorithms.Implementation;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class TheHurdleRace {
    static int hurdleRace(int k, List<Integer> list) {
        return Math.max(Collections.max(list) - k, 0);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            List<Integer> list = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(hurdleRace(k, list));
        }
    }
}