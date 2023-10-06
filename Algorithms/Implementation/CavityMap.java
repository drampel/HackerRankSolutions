package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CavityMap {
    static void cavityMap(List<String> grid) {
        for (int i = 1; i < grid.size() - 1; i++) {
            StringBuilder currentRow = new StringBuilder(grid.get(i));
            for (int j = 1; j < currentRow.length() - 1; j++) {
                char currentDepth = currentRow.charAt(j);
                char leftDepth = currentRow.charAt(j - 1);
                char rightDepth = currentRow.charAt(j + 1);
                char topDepth = grid.get(i - 1).charAt(j);
                char bottomDepth = grid.get(i + 1).charAt(j);
                if (currentDepth > leftDepth && currentDepth > rightDepth
                        && currentDepth > topDepth && currentDepth > bottomDepth) {
                    currentRow.setCharAt(j, 'X');
                }
            }
            grid.set(i, currentRow.toString());
        }
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            List<String> grid = IntStream.range(0, n)
                    .mapToObj(i -> scan.next())
                    .filter(i -> i.length() == n)
                    .collect(toList());
            cavityMap(grid);
            grid.forEach(System.out::println);
        }
    }
}