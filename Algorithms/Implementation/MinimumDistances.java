package Algorithms.Implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MinimumDistances {
    static int minimumDistances(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < a.size(); i++) {
            int currentElement = a.get(i);
            if (map.containsKey(currentElement)) {
                int previousIndex = map.get(currentElement);
                minDistance = Math.min(minDistance, i - previousIndex);
            }
            map.put(currentElement, i);
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> a = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(minimumDistances(a));
        }
    }
}