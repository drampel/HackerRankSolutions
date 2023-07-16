package Algorithms.Implementation;

import java.util.Scanner;

public class SherlockAndSquares {
    static int squares(int a, int b) {
        return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int q = scan.nextInt();
            while (q-- > 0) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println(squares(a, b));
            }
        }
    }
}