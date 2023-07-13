package Algorithms.Implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class DivisibleSumPairs {
    static int divisibleSumPairs(int k, List<Integer> list) {
        Map<Integer, Integer> bucketMap = new HashMap<>();
        for (int i = 0; i < k; i++) bucketMap.put(i, 0);
        int count = 0;
        for (int element : list) {
            int modValue = element % k;
            count += bucketMap.get((k - modValue) % k);
            bucketMap.merge(modValue, 1, Integer::sum);
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            List<Integer> list = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(divisibleSumPairs(k, list));
        }
    }
}