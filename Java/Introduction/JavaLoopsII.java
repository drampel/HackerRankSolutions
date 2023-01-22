package Java.Introduction;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int k = 1;
            int x = a + k * b;
            for (int j = 0; j < n; j++) {
                System.out.print(x + " ");
                k *= 2;
                x += k * b;
            }
            System.out.println();
        }
        in.close();
    }
}