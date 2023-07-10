package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SubarrayDivision {
    static int birthday(List<Integer> list, int d, int m) {
        int sum = 0, count = 0;
        for (int i = 0; i < m; i++) sum += list.get(i);
        for (int i = 0; i <= list.size() - m; i++) {
            if (sum == d) count++;
            if (i + m < list.size()) sum += list.get(i + m) - list.get(i);
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> list = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            int d = scan.nextInt();
            int m = scan.nextInt();
            System.out.println(birthday(list, d, m));
        }
    }
}