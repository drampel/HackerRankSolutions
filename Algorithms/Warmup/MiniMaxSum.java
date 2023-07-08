package Algorithms.Warmup;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {
    static void miniMaxSum(List<Integer> list) {
        System.out.printf("%d %d",
                list.stream().map(Integer::longValue).sorted(Comparator.reverseOrder()).skip(1).reduce(0L, Long::sum),
                list.stream().map(Integer::longValue).sorted(Comparator.naturalOrder()).skip(1).reduce(0L, Long::sum));
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> list = Stream.of(scan.nextLine().replaceAll("\\s+", " ").trim().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            miniMaxSum(list);
        }
    }
}