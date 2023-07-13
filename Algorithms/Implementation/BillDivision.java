package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BillDivision {
    static void bonAppetit(List<Integer> list, int k, int b) {
        int actual = (list.stream().reduce(0, Integer::sum) - list.get(k)) / 2;
        System.out.println(b == actual ? "Bon Appetit" : b - actual);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            List<Integer> list = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            int b = scan.nextInt();
            bonAppetit(list, k, b);
        }
    }
}