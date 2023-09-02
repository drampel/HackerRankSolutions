package Algorithms.Implementation;

import java.util.Scanner;

public class ChocolateFeast {
    /* One of two versions of the chocolateFeast() method can be used here. */
    static int chocolateFeast(int n, int c, int m) {                                                                 //1
        int chocolateCount = n / c;
        int wrapperCount = chocolateCount;
        while (wrapperCount >= m) {
            chocolateCount += wrapperCount / m;
            wrapperCount = wrapperCount / m + wrapperCount % m;
        }
        return chocolateCount;
    }

//    static int chocolateFeast(int n, int c, int m) {                                                               //2
//        return n / c + (n / c - 1) / (m - 1);
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                int n = scan.nextInt();
                int c = scan.nextInt();
                int m = scan.nextInt();
                System.out.println(chocolateFeast(n, c, m));
            }
        }
    }
}