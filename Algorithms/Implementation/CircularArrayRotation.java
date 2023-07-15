package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CircularArrayRotation {
    static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> result = new ArrayList<>();
        int size = a.size();
        for (Integer query : queries) result.add(a.get((query - k % size + size) % size));
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int q = scan.nextInt();
            List<Integer> a = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            List<Integer> queries = IntStream.range(0, q)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            List<Integer> result = circularArrayRotation(a, k, queries);
            for (Integer element : result) System.out.println(element);
        }
    }
}