package Java.Advanced;

import java.util.Scanner;
import java.lang.reflect.Constructor;

/* This code uses the "Double-Checked Locking" design pattern.
   For Java 7 and Java 8, just add the Singleton class. */
class Singleton {
    private static volatile Singleton singleton;
    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) singleton = new Singleton();
            }
        }
        return singleton;
    }
}

/* For Java 15 also need to add below class. */
public class JavaSingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleInstance();
        try (Scanner scan = new Scanner(System.in)) {
            singleton.str = scan.nextLine();
            System.out.println("Hello I am a singleton! Let me say " + singleton.str + " to you");
        }
    }
}