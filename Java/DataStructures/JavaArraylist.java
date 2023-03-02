package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class JavaArraylist {
    /* For Java 7, use the first or second version of the main() method. */
    public static void main(String[] args) {                                                                         //1
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            if (n > 0) {
                List<List<Integer>> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    int d = scan.nextInt();
                    if (d >= 0) {
                        List<Integer> internalList = new ArrayList<>();
                        for (int j = 0; j < d; j++) internalList.add(scan.nextInt());
                        list.add(internalList);
                    }
                }
                int q = scan.nextInt();
                if (q > 0) {
                    for (int i = 0; i < q; i++) {
                        try {
                            System.out.println(list.get(scan.nextInt() - 1).get(scan.nextInt() - 1));
                        } catch (IndexOutOfBoundsException ex) {
                            System.out.println("ERROR!");
                        }
                    }
                }
            }
        }
    }

//    public static void main(String[] args) {                                                                       //2
//        try (Scanner scan = new Scanner(System.in)) {
//            int n = Integer.parseInt(scan.nextLine().trim());
//            if (n > 0) {
//                List<List<Integer>> list = new ArrayList<>();
//                for (int i = 0; i < n; i++) {
//                    String[] line = scan.nextLine().trim().split(" ");
//                    int d = Integer.parseInt(line[0]);
//                    if (d >= 0) {
//                        list.add(new ArrayList<Integer>());
//                        for (int j = 1; j <= d; j++) list.get(i).add(Integer.parseInt(line[j]));
//                    }
//                }
//                StringBuilder builder = new StringBuilder();
//                int q = Integer.parseInt(scan.nextLine().trim());
//                if (q > 0) {
//                    for (int i = 0; i < q; i++) {
//                        String[] query = scan.nextLine().trim().split(" ");
//                        try {
//                            int x = Integer.parseInt(query[0]);
//                            int y = Integer.parseInt(query[1]);
//                            builder.append(list.get(x - 1).get(y - 1)).append('\n');
//                        } catch (IndexOutOfBoundsException ex) {
//                            builder.append("ERROR!\n");
//                        }
//                    }
//                }
//                System.out.print(builder);
//            }
//        }
//    }

    /* For Java 8 and Java 15, it's also possible to use the third version of the main() method. */

//    public static void main(String[] args) {                                                                       //3
//        try (Scanner scan = new Scanner(System.in)) {
//            List<List<Integer>> list = new ArrayList<>();
//            Stream.iterate(0, i -> i + 1).limit(scan.nextInt()).forEach(i -> {
//                List<Integer> internalList = new ArrayList<>();
//                Stream.iterate(0, j -> j + 1).limit(scan.nextInt()).forEach(j -> internalList.add(scan.nextInt()));
//                list.add(internalList);
//            });
//            Stream.iterate(0, q -> q + 1).limit(scan.nextInt()).forEach(q -> {
//                try {
//                    System.out.println(list.get(scan.nextInt() - 1).get(scan.nextInt() - 1));
//                } catch (IndexOutOfBoundsException ex) {
//                    System.out.println("ERROR!");
//                }
//            });
//        }
//    }
}