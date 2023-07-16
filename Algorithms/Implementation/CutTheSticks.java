package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CutTheSticks {
    static List<Integer> cutTheSticks(List<Integer> list) {
        Collections.sort(list);
        List<Integer> result = new ArrayList<>();
        result.add(list.size());
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) result.add(list.size() - i);
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<Integer> list = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            List<Integer> result = cutTheSticks(list);
            result.forEach(System.out::println);
        }
    }
}