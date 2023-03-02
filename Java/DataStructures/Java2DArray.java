package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java2DArray {
    /* For Java 7, use the first version of the main() method. */
    public static void main(String[] args) {                                                                         //1
        int[][] arr = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    arr[i][j] = scan.nextInt();
                    if (i >= 2 && j >= 2) {
                        int sum = arr[i][j] + arr[i][j - 1] + arr[i][j - 2] +
                                arr[i - 1][j - 1] +
                                arr[i - 2][j] + arr[i - 2][j - 1] + arr[i - 2][j - 2];
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
            System.out.println(maxSum);
        }
    }

    /* For Java 8 and Java 15, it's also possible to use the second version of the main() method. */

//    public static void main(String[] args) {                                                                       //2
//        try (Scanner scan = new Scanner(System.in)) {
//            List<List<Integer>> list = new ArrayList<>();
//            IntStream.range(0, 6).forEach(i -> list.add(Stream.of(scan.nextLine().trim().split(" "))
//                    .map(Integer::parseInt)
//                    .collect(Collectors.toList())));
//            int maxSum = Integer.MIN_VALUE;
//            for (int i = 0; i < list.size() - 2; i++) {
//                for (int j = 0; j < list.get(i).size() - 2; j++) {
//                    int sum = list.get(i).get(j) + list.get(i).get(j + 1) + list.get(i).get(j + 2) +
//                            list.get(i + 1).get(j + 1) +
//                            list.get(i + 2).get(j) + list.get(i + 2).get(j + 1) + list.get(i + 2).get(j + 2);
//                    maxSum = Math.max(maxSum, sum);
//                }
//            }
//            System.out.println(maxSum);
//        }
//    }
}