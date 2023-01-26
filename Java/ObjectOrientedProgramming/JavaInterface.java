package Java.ObjectOrientedProgramming;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaInterface {
    public static void main(String[] args) {
        AdvancedArithmetic myCalculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        Scanner sc = new Scanner(System.in);
        System.out.print(myCalculator.divisor_sum(sc.nextInt()));
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o) {
        Class<?>[] theInterfaces = o.getClass().getInterfaces();
        for (Class<?> theInterface : theInterfaces) {
            System.out.println(theInterface.getName());
        }
    }
}

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

/* For Java 7 and Java 8, just add the first version of the MyCalculator class to the existing code. */
class MyCalculator implements AdvancedArithmetic {                               //1
    @Override
    public int divisor_sum(int n) {
        int sum = n;
        for (int i = 1; i <= (int) Math.floor(n / 2.0); i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }
}

/* For Java 15, it's also possible to use the second version of the MyCalculator class. */

//class MyCalculator implements AdvancedArithmetic {                             //2
//    @Override
//    public int divisor_sum(int n) {
//        return IntStream.rangeClosed(1, n / 2)
//                .filter(i -> n % i == 0)
//                .sum() + n;
//    }
//}