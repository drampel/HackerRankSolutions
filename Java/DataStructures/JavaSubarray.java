package Java.DataStructures;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] arr = new int[scan.nextInt()];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
                int sum = arr[i];
                if (sum < 0) count++;
                for (int j = i - 1; j >= 0; j--) {
                    sum += arr[j];
                    if (sum < 0) count++;
                }
            }
            System.out.println(count);
        }
    }
}