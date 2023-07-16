package Algorithms.Implementation;

import java.util.Scanner;

public class LibraryFine {
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) return 10000;
        else if (y1 == y2 && m1 > m2) return 500 * (m1 - m2);
        else if (y1 == y2 && m1 == m2 && d1 > d2) return 15 * (d1 - d2);
        else return 0;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int d1 = scan.nextInt();
            int m1 = scan.nextInt();
            int y1 = scan.nextInt();
            int d2 = scan.nextInt();
            int m2 = scan.nextInt();
            int y2 = scan.nextInt();
            System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
        }
    }
}