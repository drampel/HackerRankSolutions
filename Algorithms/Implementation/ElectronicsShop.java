package Algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int maxSum = -1;
        for (int i = 0, j = drives.length - 1; i < keyboards.length && j >= 0; ) {
            int sum = keyboards[i] + drives[j];
            if (sum > b) j--;
            else {
                if (maxSum < sum) maxSum = sum;
                i++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int b = scan.nextInt();
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] keyboards = new int[n];
            for (int i = 0; i < n; i++) keyboards[i] = scan.nextInt();
            int[] drives = new int[m];
            for (int i = 0; i < m; i++) drives[i] = scan.nextInt();
            System.out.println(getMoneySpent(keyboards, drives, b));
        }
    }
}