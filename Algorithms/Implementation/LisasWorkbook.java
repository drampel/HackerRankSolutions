package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class LisasWorkbook {
    static int workbook(int k, List<Integer> chapterProblemsList) {
        int pageNumber = 1;
        int specialProblems = 0;
        for (Integer chapterProblems : chapterProblemsList) {
            int problemsPerPage = k;
            for (int j = 1; j <= chapterProblems; j += k) {
                if (j + k - 1 > chapterProblems) problemsPerPage = chapterProblems % k;
                if (j <= pageNumber && pageNumber < j + problemsPerPage) specialProblems++;
                pageNumber++;
            }
        }
        return specialProblems;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            List<Integer> chapterProblemsList = IntStream.range(0, n)
                    .mapToObj(i -> scan.nextInt())
                    .collect(toList());
            System.out.println(workbook(k, chapterProblemsList));
        }
    }
}