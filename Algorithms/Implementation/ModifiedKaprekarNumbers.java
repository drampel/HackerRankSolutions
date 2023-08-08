package Algorithms.Implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {
    static void kaprekarNumbers(int p, int q) {
        boolean foundKaprekarNumbers = false;
        for (int i = p; i <= q; i++) {
            String squareNum = Long.toString((long) i * i);
            String leftPart = squareNum.substring(0, squareNum.length() / 2);
            String rightPart = squareNum.substring(squareNum.length() / 2);
            int numLeftPart = !leftPart.isEmpty() ? Integer.parseInt(leftPart) : 0;
            int numRightPart = !(rightPart.isEmpty()) ? Integer.parseInt(rightPart) : 0;
            if (numLeftPart + numRightPart == i) {
                foundKaprekarNumbers = true;
                System.out.print(i + " ");
            }
        }
        if (!foundKaprekarNumbers) System.out.println("INVALID RANGE");
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            kaprekarNumbers(p, q);
        }
    }
}