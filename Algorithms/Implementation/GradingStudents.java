package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class GradingStudents {
    static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38 && grades.get(i) % 5 >= 3) grades.set(i, (grades.get(i) / 5 + 1) * 5);
        }
        return grades;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int gradesCount = scan.nextInt();
            List<Integer> grades = IntStream.range(0, gradesCount)
                    .mapToObj(i -> scan.nextInt())
                    .filter(i -> i >= 0 && i <= 100)
                    .collect(toList());
            List<Integer> result = gradingStudents(grades);
            for (Integer element : result) System.out.println(element);
        }
    }
}