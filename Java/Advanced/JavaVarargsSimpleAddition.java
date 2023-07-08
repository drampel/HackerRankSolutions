package Java.Advanced;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* For Java 7 and Java 8, just add the Add class. */
class Add {
    public void add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(i < numbers.length - 1 ? numbers[i] + "+" : numbers[i] + "=");
        }
        System.out.println(sum);
    }
}

public class JavaVarargsSimpleAddition {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            int n3 = scan.nextInt();
            int n4 = scan.nextInt();
            int n5 = scan.nextInt();
            int n6 = scan.nextInt();
            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
            Method[] methods = Add.class.getDeclaredMethods();
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
            e.printStackTrace();
        }
    }
}