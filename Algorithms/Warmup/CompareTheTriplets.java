package Algorithms.Warmup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {
    static Map<Integer, Integer> compareTriplets(List<Integer> listA, List<Integer> listB) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        for (int i = 0; i < listA.size() && i < listB.size(); i++) {
            if (listA.get(i) > listB.get(i)) map.merge(0, 1, Integer::sum);
            else if (listA.get(i) < listB.get(i)) map.merge(1, 1, Integer::sum);
        }
        return map;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> listA = Stream.of(scan.nextLine().replaceAll("\\s+", " ").trim().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            List<Integer> listB = Stream.of(scan.nextLine().replaceAll("\\s+", " ").trim().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            Map<Integer, Integer> map = compareTriplets(listA, listB);
            for (Integer value : map.values()) System.out.print(value + " ");
        }
    }
}