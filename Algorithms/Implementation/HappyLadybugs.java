package Algorithms.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HappyLadybugs {
    static String happyLadybugs(String b) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (ch != '_') map.merge(ch, 1, Integer::sum);
        }
        if (b.contains("_")) {
            for (Map.Entry<Character, Integer> entrySet : map.entrySet()) {
                if (entrySet.getValue() == 1) return "NO";
            }
        } else {
            for (int i = 0; i < b.length(); i++) {
                int ch = b.charAt(i);
                if (!((i > 0 && ch == b.charAt(i - 1)) || (i < b.length() - 1 && ch == b.charAt(i + 1)))) return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int g = scan.nextInt();
            while (g-- > 0) {
                int n = scan.nextInt();
                String b = scan.next();
                if (n == b.length()) System.out.println(happyLadybugs(b));
            }
        }
    }
}