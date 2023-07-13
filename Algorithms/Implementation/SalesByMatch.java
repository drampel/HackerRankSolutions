package Algorithms.Implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SalesByMatch {
    static int sockMerchant(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : list) map.merge(element, 1, Integer::sum);
        int pairs = 0;
        for (Integer value : map.values()) pairs += value / 2;
        return pairs;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> list = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(sockMerchant(list));
        }
    }
}