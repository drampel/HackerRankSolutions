package Java.Introduction;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        /* For Java 7 and Java 8, just add one of the four lines to your existing code. */
        String s = String.format("%d", n);
//        String s = Integer.toString(n);
//        String s = String.valueOf(n);
//        String s = n + "";

        if (n == Integer.parseInt(s)) System.out.println("Good job");
        else System.out.println("Wrong answer.");
    }
}