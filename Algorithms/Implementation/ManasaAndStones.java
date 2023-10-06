package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManasaAndStones {
    static List<Integer> stones(int n, int a, int b) {
        List<Integer> lastStoneValues = new ArrayList<>();
        if (a == b) lastStoneValues.add(a * (n - 1));
        else {
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            for (int i = 0; i < n; i++) lastStoneValues.add(a * (n - 1 - i) + b * i);
        }
        return lastStoneValues;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            while (t-- > 0) {
                int n = scan.nextInt();
                int a = scan.nextInt();
                int b = scan.nextInt();
                List<Integer> lastStoneValues = stones(n, a, b);
                lastStoneValues.forEach(i -> System.out.print(i + " "));
                System.out.println();
            }
        }
    }
}