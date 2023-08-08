package Algorithms.Implementation;

import java.util.Scanner;

public class TaumAndBday {
    static long taumBday(int b, int w, int bc, int wc, int z) {
        long minPriceB = Math.min(bc, wc + z);
        long minPriceW = Math.min(wc, bc + z);
        return b * minPriceB + w * minPriceW;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                int b = scan.nextInt();
                int w = scan.nextInt();
                int bc = scan.nextInt();
                int wc = scan.nextInt();
                int z = scan.nextInt();
                System.out.println(taumBday(b, w, bc, wc, z));
            }
        }
    }
}