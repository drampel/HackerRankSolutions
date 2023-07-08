package Algorithms.Warmup;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(List<Integer> list) {
        int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow(NoSuchElementException::new);
        return (int) list.stream().filter(i -> i == max).count();
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.nextLine().trim());
            List<Integer> list = Stream.of(scan.nextLine().replaceAll("\\s+", " ").trim().split(" "))
                    .limit(n)
                    .map(Integer::parseInt)
                    .collect(toList());
            System.out.println(birthdayCakeCandles(list));
        }
    }
}