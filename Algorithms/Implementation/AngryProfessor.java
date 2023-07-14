package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class AngryProfessor {
    static String angryProfessor(int k, List<Integer> list) {
        return k > list.size() || (int) list.stream().filter(i -> i <= 0).count() < k ? "YES" : "NO";
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            IntStream.range(0, t).forEach(i -> {
                int n = scan.nextInt();
                int k = scan.nextInt();
                List<Integer> list = IntStream.range(0, n)
                        .mapToObj(j -> scan.nextInt())
                        .collect(toList());
                System.out.println(angryProfessor(k, list));
            });
        }
    }
}