package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BeautifulTriplets {
    /* One of two versions of the beautifulTriplets() method can be used here. */
    static int beautifulTriplets(int d, List<Integer> list) {                                                        //1
        int count = 0;
        for (Integer element : list) {
            if (list.contains(element + d) && list.contains(element + d * 2)) count++;
        }
        return count;
    }

//    static int beautifulTriplets(int d, List<Integer> list) {                                                      //2
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (Integer element : list) map.merge(element, 1, Integer::sum);
//        int count = 0;
//        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
//            int j = entrySet.getKey() + d;
//            int k = j + d;
//            if (map.containsKey(j) && map.containsKey(k)) {
//                count += entrySet.getValue() * map.get(j) * map.get(k);
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int d = scan.nextInt();
            List<Integer> list = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(beautifulTriplets(d, list));
        }
    }
}