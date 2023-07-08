package Java.Advanced;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* For Java 7, just add the bottom import line and the first or second version
   of the Prime class to the existing code. */
import static java.lang.System.in;

class Prime {
    public void checkPrime(int... numbers) {                                                                         //1
        for (int num : numbers) {
            if (num == 2) {
                System.out.print(num + " ");
                continue;
            } else if (num < 2 || num % 2 == 0) continue;
            boolean prime = true;
            for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.print(num + " ");
        }
        System.out.println();
    }
}

//class Prime {                                                                                                      //2
//    public void checkPrime(int... numbers) {
//        for (int num : numbers) {
//            if (BigInteger.valueOf(num).isProbablePrime(10)) System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}

/* For Java 8 and Java 15, it's also possible to use the third version of the Prime class. */

//class Prime {                                                                                                      //3
//    public void checkPrime(int... numbers) {
//        Arrays.stream(numbers).filter(num -> {
//            if (num == 2) return true;
//            else if (num < 2 || num % 2 == 0) return false;
//            for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
//                if (num % i == 0) return false;
//            }
//            return true;
//        }).forEach(num -> System.out.print(num + " "));
//        System.out.println();
//    }
//}

public class PrimeChecker {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(in)) {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            int n3 = scan.nextInt();
            int n4 = scan.nextInt();
            int n5 = scan.nextInt();
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());
            }
            if (overload) throw new Exception("Overloading not allowed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}