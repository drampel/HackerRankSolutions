package Algorithms.Warmup;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    static void plusMinus(List<Integer> list) {
        int positiveValuesCount = 0;
        int negativeValuesCount = 0;
        int zerosCount = 0;
        for (Integer value : list) {
            if (value > 0) positiveValuesCount++;
            else if (value < 0) negativeValuesCount++;
            else zerosCount++;
        }
        System.out.printf("%f%n%f%n%f%n",
                (float) positiveValuesCount / list.size(),
                (float) negativeValuesCount / list.size(),
                (float) zerosCount / list.size());
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.nextLine().trim());
            List<Integer> list = Stream.of(scan.nextLine().replaceAll("\\s+", " ").trim().split(" "))
                    .limit(n)
                    .map(Integer::parseInt)
                    .collect(toList());
            plusMinus(list);
        }
    }
}