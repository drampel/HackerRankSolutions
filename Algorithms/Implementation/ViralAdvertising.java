package Algorithms.Implementation;

import java.util.Scanner;

public class ViralAdvertising {
    static int viralAdvertising(int n) {
        if (n <= 0) return 0;
        int liked = 2;
        int cumulative = 2;
        for (int i = 2; i <= n; i++) {
            liked = liked * 3 / 2;
            cumulative += liked;
        }
        return cumulative;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(viralAdvertising(scan.nextInt()));
        }
    }
}