package Algorithms.Implementation;

import java.util.Scanner;

public class DayOfTheProgrammer {
    static String dayOfProgrammer(int year) {
        if (year % 4 == 0 && (year < 1917 || year % 100 != 0) || year % 400 == 0)
            return String.format("%s%d", "12.09.", year);
        else if (year == 1918) return String.format("%s%d", "26.09.", year);
        else return String.format("%s%d", "13.09.", year);
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int year = scan.nextInt();
            System.out.println(dayOfProgrammer(year));
        }
    }
}