package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ServiceLane {
    static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases) {
        List<Integer> minWidthList = new ArrayList<>();
        for (List<Integer> separateCase : cases) {
            List<Integer> widthSublist = width.subList(separateCase.get(0), separateCase.get(1) + 1);
            widthSublist.stream().reduce(Integer::min).ifPresent(minWidthList::add);
        }
        return minWidthList;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int t = scan.nextInt();
            List<Integer> width = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            List<List<Integer>> cases = new ArrayList<>();
            IntStream.range(0, t).forEach(i -> cases.add(IntStream.range(0, 2)
                    .mapToObj(j -> scan.nextInt())
                    .collect(toList())));
            List<Integer> minWidthList = serviceLane(width, cases);
            minWidthList.forEach(System.out::println);
        }
    }
}