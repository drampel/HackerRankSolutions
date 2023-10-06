package Algorithms.Implementation;

import java.util.Scanner;

public class StrangeCounter {
    static long strangeCounter(long t) {
        long upperLevelTime = 4;
        while (t >= upperLevelTime) upperLevelTime = upperLevelTime * 2 + 2;
        return upperLevelTime - t;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            long t = scan.nextLong();
            System.out.println(strangeCounter(t));
        }
    }
}