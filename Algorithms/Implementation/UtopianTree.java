package Algorithms.Implementation;

import java.util.Scanner;

public class UtopianTree {
    static int utopianTree(int n) {
        return (int) Math.pow(2, (double) ((n + 1) / 2) + 1) - 1 - (n % 2);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) System.out.println(utopianTree(scan.nextInt()));
        }
    }
}