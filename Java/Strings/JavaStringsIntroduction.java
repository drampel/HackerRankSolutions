package Java.Strings;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        System.out.printf("%d%n%s%n%s%s %s%s",
                a.length() + b.length(),
                a.compareTo(b) > 0 ? "Yes" : "No",
                a.substring(0, 1).toUpperCase(),
                a.substring(1),
                b.substring(0, 1).toUpperCase(),
                b.substring(1));
    }
}