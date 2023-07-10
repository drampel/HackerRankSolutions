package Algorithms.Implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BreakingTheRecords {
    static Map<Integer, Integer> breakingRecords(List<Integer> scores) {
        Map<Integer, Integer> records = new HashMap<>();
        records.put(0, 0);
        records.put(1, 0);
        int maxRecord = scores.get(0);
        int minRecord = scores.get(0);
        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);
            if (maxRecord < score) {
                maxRecord = score;
                records.merge(0, 1, Integer::sum);
            } else if (minRecord > score) {
                minRecord = score;
                records.merge(1, 1, Integer::sum);
            }
        }
        return records;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> scores = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            Map<Integer, Integer> records = breakingRecords(scores);
            for (Integer value : records.values()) System.out.print(value + " ");
        }
    }
}