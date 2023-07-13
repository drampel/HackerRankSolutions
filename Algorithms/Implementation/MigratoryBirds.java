package Algorithms.Implementation;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> list) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer element : list) map.merge(element, 1, Integer::sum);
        int lowestTypeId = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            if (maxFrequency < entrySet.getValue()) {
                maxFrequency = entrySet.getValue();
                lowestTypeId = entrySet.getKey();
            }
        }
        return lowestTypeId;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> list = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(migratoryBirds(list));
        }
    }
}