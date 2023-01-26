package Java.ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class JavaInstanceOfKeyword {
    static String count(ArrayList<Object> myList) {
        int a = 0, b = 0, c = 0;
        for (Object element : myList) {
            /* For Java 7 and Java 8, just add the bottom six lines to existing code. */
            if (element instanceof Student)
                a++;
            else if (element instanceof Rockstar)
                b++;
            else if (element instanceof Hacker)
                c++;

        }
        return String.format("%d %d %d", a, b, c);
    }

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            switch (sc.next()) {
                case "Student" -> myList.add(new Student());
                case "Rockstar" -> myList.add(new Rockstar());
                case "Hacker" -> myList.add(new Hacker());
            }
        }
        System.out.println(count(myList));
    }
}