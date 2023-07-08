package Java.Advanced;

import java.util.Scanner;

public class CanYouAccess {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int num = scan.nextInt();
            Object o;
            /* For Java 7 and Java 8, just add one bottom line to existing code. */
            System.out.printf("%d is %s%n", num, ((Inner.Private) (o = new Inner().new Private())).powerof2(num));

            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        }
    }

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
}