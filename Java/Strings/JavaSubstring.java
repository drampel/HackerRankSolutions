package Java.Strings;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.length() >= 1 && s.length() <= 100) {
            int start = in.nextInt();
            int end = in.nextInt();
            if (0 <= start && start < end && end <= s.length()) System.out.println(s.substring(start, end));
            else System.out.println("Constraints: 0 <= start < end <= s.length()");
        } else System.out.println("Constraints: 1 <= s <= 100");
        in.close();
    }
}