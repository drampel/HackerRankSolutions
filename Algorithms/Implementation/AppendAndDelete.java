package Algorithms.Implementation;

import java.util.Scanner;

public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {
        if (k >= s.length() + t.length()) return "Yes";
        int i = 0;
        while (i < Math.min(s.length(), t.length()) && s.charAt(i) == t.charAt(i)) i++;
        int count = s.length() + t.length() - i * 2;
        return k >= count && (k - count) % 2 == 0 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String s = scan.next();
            String t = scan.next();
            int k = scan.nextInt();
            System.out.println(appendAndDelete(s, t, k));
        }
    }
}