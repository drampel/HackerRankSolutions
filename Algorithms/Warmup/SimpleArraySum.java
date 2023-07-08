package Algorithms.Warmup;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SimpleArraySum {
    static int simpleArraySum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.nextLine().trim());
            List<Integer> list = Stream.of(scan.nextLine().replaceAll("\\s+", " ").trim().split(" "))
                    .limit(n)
                    .map(Integer::parseInt)
                    .collect(toList());
            System.out.println(simpleArraySum(list));
        }
    }
}