package Algorithms.Implementation;

import java.util.Scanner;

public class HalloweenSale {
    /* One of two versions of the howManyGames() method can be used here. */
    static int howManyGames(int p, int d, int m, int s) {                                                            //1
        int count = 0;
        for (; s >= p; s -= p, p = Math.max(p - d, m)) count++;
        return count;
    }

//    static int howManyGames(int p, int d, int m, int s) {                                                          //2
//        return s < p ? 0 : howManyGames(Math.max(p - d, m), d, m, s - p) + 1;
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int p = scan.nextInt();
            int d = scan.nextInt();
            int m = scan.nextInt();
            int s = scan.nextInt();
            System.out.println(howManyGames(p, d, m, s));
        }
    }
}