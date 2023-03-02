package Java.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (m >= 1 && m <= n) {
                Deque<Integer> deque = new ArrayDeque<>();
                Set<Integer> set = new HashSet<>();
                int maxCount = 0;
                for (int i = 0; i < n; i++) {
                    int num = scan.nextInt();
                    deque.addLast(num);
                    set.add(num);
                    if (deque.size() == m) {
                        maxCount = Math.max(set.size(), maxCount);
                        if (maxCount == m) break;
                        int element = deque.removeFirst();
                        if (!deque.contains(element)) set.remove(element);
                    }
                }
                System.out.println(maxCount);
            }
        }
    }
}