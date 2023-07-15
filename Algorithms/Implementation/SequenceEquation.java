package Algorithms.Implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SequenceEquation {
    static List<Integer> permutationEquation(List<Integer> p) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= p.size(); i++) map.put(p.get(i - 1), i);
        return IntStream.rangeClosed(1, map.size())
                .mapToObj(i -> map.get(map.get(i)))
                .collect(toList());
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> p = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            List<Integer> result = permutationEquation(p);
            for (Integer element : result) System.out.println(element);
        }
    }
}