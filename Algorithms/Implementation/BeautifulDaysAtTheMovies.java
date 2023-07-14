package Algorithms.Implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int number = i; 1 <= number && number <= j; number++) {
            int reverseNumber = Integer.parseInt(new StringBuilder(Integer.toString(number)).reverse().toString());
            if ((number - reverseNumber) % k == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int i = scan.nextInt();
            int j = scan.nextInt();
            int k = scan.nextInt();
            System.out.println(beautifulDays(i, j, k));
        }
    }
}