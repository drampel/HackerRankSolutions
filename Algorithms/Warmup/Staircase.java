package Algorithms.Warmup;

import java.util.Scanner;

public class Staircase {
    static void staircase(int n) {
        StringBuilder builder = new StringBuilder();
        builder.append(" ".repeat(Math.max(0, n)));
        for (int i = 0; i < n; i++) {
            builder.setCharAt(n - i - 1, '#');
            System.out.println(builder);
        }
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            staircase(scan.nextInt());
        }
    }
}