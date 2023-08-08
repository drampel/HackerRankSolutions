package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class JumpingOnTheClouds {
    static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        for (int i = 0; i < c.size() - 1; i++, jumps++) {
            if (i + 2 < c.size() && c.get(i + 2) == 0) i++;
        }
        return jumps;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> c = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(jumpingOnClouds(c));
        }
    }
}