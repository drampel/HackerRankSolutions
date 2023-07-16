package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FormingAMagicSquare {
    static int formingMagicSquare(List<List<Integer>> inputSquare) {
        List<List<List<Integer>>> magicSquareCombinations = List.of(
                List.of(List.of(8, 1, 6), List.of(3, 5, 7), List.of(4, 9, 2)),
                List.of(List.of(6, 1, 8), List.of(7, 5, 3), List.of(2, 9, 4)),
                List.of(List.of(4, 9, 2), List.of(3, 5, 7), List.of(8, 1, 6)),
                List.of(List.of(2, 9, 4), List.of(7, 5, 3), List.of(6, 1, 8)),
                List.of(List.of(8, 3, 4), List.of(1, 5, 9), List.of(6, 7, 2)),
                List.of(List.of(4, 3, 8), List.of(9, 5, 1), List.of(2, 7, 6)),
                List.of(List.of(6, 7, 2), List.of(1, 5, 9), List.of(8, 3, 4)),
                List.of(List.of(2, 7, 6), List.of(9, 5, 1), List.of(4, 3, 8)));
        int minPossibleCost = Integer.MAX_VALUE;
        for (int i = 0; i < magicSquareCombinations.size(); i++) {
            int permutationCost = 0;
            for (int j = 0; j < magicSquareCombinations.get(i).size(); j++) {
                for (int k = 0; k < magicSquareCombinations.get(i).get(j).size(); k++) {
                    permutationCost += Math.abs(inputSquare.get(j).get(k) - magicSquareCombinations.get(i).get(j).get(k));
                }
            }
            minPossibleCost = Math.min(minPossibleCost, permutationCost);
        }
        return minPossibleCost;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<List<Integer>> inputSquare = new ArrayList<>();
            IntStream.range(0, 3).forEach(i -> inputSquare.add(IntStream.range(0, 3)
                    .mapToObj(j -> scan.nextInt())
                    .collect(toList())));
            System.out.println(formingMagicSquare(inputSquare));
        }
    }
}