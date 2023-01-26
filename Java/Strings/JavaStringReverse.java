package Java.Strings;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        System.out.println(a.equalsIgnoreCase(new StringBuilder(a).reverse().toString()) ? "Yes" : "No");
    }
}