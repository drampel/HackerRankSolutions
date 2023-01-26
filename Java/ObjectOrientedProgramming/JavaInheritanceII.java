package Java.ObjectOrientedProgramming;

public class JavaInheritanceII {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}

/* For Java 7 and Java 8, just add the Arithmetic and Adder classes. */
class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}