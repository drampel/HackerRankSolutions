package Algorithms.Warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {
    static int diagonalDifference(List<List<Integer>> list) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < list.size(); i++) {
            primaryDiagonalSum += list.get(i).get(i);
            secondaryDiagonalSum += list.get(i).get(list.size() - i - 1);
        }
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.nextLine().trim());
            List<List<Integer>> list = new ArrayList<>();
            IntStream.range(0, n).forEach(i -> list.add(Stream.of(scan.nextLine().replaceAll("\\s+", " ").trim().split(" "))
                    .limit(n)
                    .map(Integer::parseInt)
                    .collect(toList())));
            System.out.println(diagonalDifference(list));
        }
    }
}