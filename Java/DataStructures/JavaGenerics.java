package Java.DataStructures;

/* For Java 7, just add the Printer class. */
class Printer {
    public <T> void printArray(T[] array) {
        for (T element : array) System.out.println(element);
    }
}

public class JavaGenerics {
    public static void main(String[] args) {
        new Printer().printArray(new Object[]{1, 2, 3, "Hello", "World"});
    }
}