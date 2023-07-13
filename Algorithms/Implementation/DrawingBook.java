package Algorithms.Implementation;

import java.util.Scanner;

public class DrawingBook {
    static int pageCount(int n, int p) {
        int pagesFromBeginning = p / 2;
        int pagesFromEnd = n / 2 - pagesFromBeginning;
        return Math.min(pagesFromBeginning, pagesFromEnd);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            if (p >= 1 && p <= n) System.out.println(pageCount(n, p));
        }
    }
}