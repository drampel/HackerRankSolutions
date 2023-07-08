package Algorithms.Warmup;

import java.util.Scanner;

public class SolveMeFirst {
    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(solveMeFirst(scan.nextInt(), scan.nextInt()));
        }
    }
}