package Algorithms.Implementation;

import java.util.Scanner;

public class NumberLineJumps {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        return (x1 == x2) || ((x1 - x2) * (v1 - v2) < 0 && (x1 - x2) % (v1 - v2) == 0) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x1 = scan.nextInt();
            int v1 = scan.nextInt();
            int x2 = scan.nextInt();
            int v2 = scan.nextInt();
            System.out.println(kangaroo(x1, v1, x2, v2));
        }
    }
}