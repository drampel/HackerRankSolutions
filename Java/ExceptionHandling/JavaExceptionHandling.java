package Java.ExceptionHandling;

import java.util.Scanner;

public class JavaExceptionHandling {
    public static final MyCalculator myCalculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            try {
                System.out.println(myCalculator.power(in.nextInt(), in.nextInt()));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        in.close();
    }
}

/* For Java 7 and Java 8, just add the MyCalculator class. */
class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) throw new Exception("n or p should not be negative.");
        else if (n == 0 && p == 0) throw new Exception("n and p should not be zero.");
        else return (long) Math.pow(n, p);
    }
}