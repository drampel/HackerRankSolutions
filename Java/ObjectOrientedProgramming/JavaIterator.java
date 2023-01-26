package Java.ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {
    static Iterator<Object> func(ArrayList<Object> myList) {
        Iterator<Object> it = myList.iterator();
        while (it.hasNext()) {
            /* For Java 7 and Java 8, just add the bottom two lines to existing code. */
            Object element = it.next();
            if (element.equals("###"))

                break;
        }
        return it;
    }

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            myList.add(sc.nextInt());
        }
        myList.add("###");
        for (int i = 0; i < m; i++) {
            myList.add(sc.next());
        }
        Iterator<Object> it = func(myList);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}