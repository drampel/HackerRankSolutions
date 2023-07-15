package Algorithms.Implementation;

import java.util.Scanner;

public class FindDigits {
    static int findDigits(int n) {
        int copyN = n;
        int count = 0;
        while (copyN > 0) {
            int remainder = copyN % 10;
            if (remainder != 0 && n % remainder == 0) count++;
            copyN /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) System.out.println(findDigits(scan.nextInt()));
        }
    }
}