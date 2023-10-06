package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FairRations {
    /* One of two versions of the fairRations() method can be used here. */
    static String fairRations(List<Integer> breads) {                                                                //1
        int minCount = 0;
        int currentNum = breads.get(0);
        for (int i = 0; i < breads.size() - 1; i++) {
            int nextNum = breads.get(i + 1);
            if (currentNum % 2 == 0) currentNum = nextNum;
            else {
                currentNum = nextNum + 1;
                minCount += 2;
            }
        }
        return currentNum % 2 == 0 ? Integer.toString(minCount) : "NO";
    }

//    static String fairRations(List<Integer> breads) {                                                              //2
//        int minCount = 0;
//        int indexPreviousOddNum = -1;
//        for (int i = 0; i < breads.size(); i++) {
//            if (breads.get(i) % 2 != 0) {
//                if (indexPreviousOddNum == -1) indexPreviousOddNum = i;
//                else {
//                    minCount += (i - indexPreviousOddNum) * 2;
//                    indexPreviousOddNum = -1;
//                }
//            }
//        }
//        return indexPreviousOddNum == -1 ? Integer.toString(minCount) : "NO";
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> breads = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(fairRations(breads));
        }
    }
}