package Algorithms.Implementation;

import java.util.Scanner;

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        return ((s - 1) + (m - 1)) % n + 1;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                int n = scan.nextInt();
                int m = scan.nextInt();
                int s = scan.nextInt();
                System.out.println(saveThePrisoner(n, m, s));
            }
        }
    }
}