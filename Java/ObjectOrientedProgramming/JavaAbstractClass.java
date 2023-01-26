package Java.ObjectOrientedProgramming;

import java.util.Scanner;

public class JavaAbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBook newNovel = new MyBook();
        newNovel.setTitle(sc.nextLine());
        sc.close();
        System.out.println("The title is: " + newNovel.getTitle());
    }
}

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return this.title;
    }
}

/* For Java 7 and Java 8, just add the MyBook class. */
class MyBook extends Book {
    @Override
    void setTitle(String s) {
        super.title = s;
    }
}