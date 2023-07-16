package Algorithms.Implementation;

import java.util.Scanner;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        int startingFrequency = 0;
        int residualFrequency = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') startingFrequency++;
            if (i < n % s.length() && s.charAt(i) == 'a') residualFrequency++;
        }
        return n / s.length() * startingFrequency + residualFrequency;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String s = scan.next();
            long n = scan.nextLong();
            System.out.println(repeatedString(s, n));
        }
    }
}