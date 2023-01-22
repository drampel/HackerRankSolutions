package Java.Introduction;

import java.util.Scanner;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.close();
        String str;
        if (n >= 1 && n <= 100) {
            if (n % 2 != 0) str = "Weird";
            else {
                if (n < 6 || n > 20) str = "Not Weird";
                else str = "Weird";
            }
        } else str = "Constraints: 1<=n<=100";
        System.out.println(str);
    }
}