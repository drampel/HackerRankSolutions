package Algorithms.Implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class EqualizeTheArray {
    static int equalizeArray(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : list) map.merge(element, 1, Integer::sum);
        int maxFrequency = map.values().stream().reduce(Integer::max).orElseThrow();
        return list.size() - maxFrequency;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> list = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(equalizeArray(list));
        }
    }
}