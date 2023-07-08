package Java.Advanced;

import java.util.Scanner;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return a -> a % 2 == 1;
    }

    public static PerformOperation isPrime() {
        return a -> {
            if (a == 2) return true;
            else if (a < 2 || a % 2 == 0) return false;
            for (int i = 3; i <= (int) Math.sqrt(a); i += 2) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return a -> {
            String str = Integer.toString(a);
            return str.equals(new StringBuilder(str).reverse().toString());
        };
    }
}

public class JavaLambdaExpressions {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = Integer.parseInt(scan.nextLine());
            PerformOperation op;
            while (t-- > 0) {
                String s = scan.nextLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                String ans = switch (ch) {
                    case 1 -> {
                        op = MyMath.isOdd();
                        yield MyMath.checker(op, num) ? "ODD" : "EVEN";
                    }
                    case 2 -> {
                        op = MyMath.isPrime();
                        yield MyMath.checker(op, num) ? "PRIME" : "COMPOSITE";
                    }
                    case 3 -> {
                        op = MyMath.isPalindrome();
                        yield MyMath.checker(op, num) ? "PALINDROME" : "NOT PALINDROME";
                    }
                    default -> "An invalid validation condition was entered.";
                };
                System.out.println(ans);
            }
        }
    }
}