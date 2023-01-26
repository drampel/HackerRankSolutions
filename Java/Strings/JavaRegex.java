package Java.Strings;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(in.next().matches(new MyRegex().pattern));
        }
        in.close();
    }
}

/* For Java 7 and Java 8, just add the MyRegex class. */
class MyRegex {
    public final String pattern = "(([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
}