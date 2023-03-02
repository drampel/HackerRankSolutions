package Java.DataStructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

enum Query {
    INSERT, DELETE
}

public class JavaList {
    /* For Java 7 and Java 8, use the first version of the main() method. */
    public static void main(String[] args) {                                                                         //1
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            if (n > 0) {
                List<Integer> list = new LinkedList<>();
                for (int i = 0; i < n; i++) list.add(scan.nextInt());
                int q = scan.nextInt();
                if (q > 0) {
                    while (q-- > 0) {
                        try {
                            switch (Query.valueOf(scan.next().toUpperCase())) {
                                case INSERT:
                                    list.add(scan.nextInt(), scan.nextInt());
                                    break;
                                case DELETE:
                                    list.remove(scan.nextInt());
                                    break;
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid query name entered.");
                        }
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if (i != list.size() - 1) System.out.print(" ");
                }
            }
        }
    }

    /* For Java 15, it's also possible to use the second version of the main() method. */

//    public static void main(String[] args) {                                                                       //2
//        try (Scanner scan = new Scanner(System.in)) {
//            List<Integer> list = new LinkedList<>();
//            IntStream.range(0, scan.nextInt()).forEach(i -> list.add(scan.nextInt()));
//            IntStream.range(0, scan.nextInt()).forEach(i -> {
//                try {
//                    switch (Query.valueOf(scan.next().toUpperCase())) {
//                        case INSERT -> list.add(scan.nextInt(), scan.nextInt());
//                        case DELETE -> list.remove(scan.nextInt());
//                    }
//                } catch (IllegalArgumentException e) {
//                    System.out.println("Invalid query name entered.");
//                }
//            });
//            System.out.println(list.stream().map(Object::toString).collect(Collectors.joining(" ")));
//        }
//    }
}