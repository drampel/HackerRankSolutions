package Algorithms.Implementation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int i = 0;
        do {
            i = (i + k) % c.length;
            e -= 1 + 2 * c[i];
        } while (i != 0);
        return e;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] c = new int[n];
            for (int i = 0; i < n; i++) c[i] = scan.nextInt();
            System.out.println(jumpingOnClouds(c, k));
        }
    }
}