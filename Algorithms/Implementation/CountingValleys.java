package Algorithms.Implementation;

import java.util.Scanner;

public class CountingValleys {
    static int countingValleys(int n, String path) {
        int seaLevel = 0;
        int countValleys = 0;
        for (int i = 0; i < n; i++) {
            char ch = path.charAt(i);
            if (ch == 'U') {
                seaLevel++;
                if (seaLevel == 0) countValleys++;
            } else if (ch == 'D') seaLevel--;
        }
        return countValleys;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            String path = scan.next();
            System.out.println(countingValleys(n, path.toUpperCase()));
        }
    }
}