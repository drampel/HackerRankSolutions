package Algorithms.Implementation;

import java.util.Scanner;

public class CatsAndAMouse {
    static String catAndMouse(int x, int y, int z) {
        int distanceA = Math.abs(z - x);
        int distanceB = Math.abs(z - y);
        return distanceA < distanceB ? "Cat A" : (distanceA > distanceB ? "Cat B" : "Mouse C");
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int q = scan.nextInt();
            while (q-- > 0) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                int z = scan.nextInt();
                System.out.println(catAndMouse(x, y, z));
            }
        }
    }
}