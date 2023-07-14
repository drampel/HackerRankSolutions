package Algorithms.Implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DesignerPDFViewer {
    static int designerPdfViewer(List<Integer> heightList, String word) {
        int maxLetterHeight = 0;
        for (int i = 0; i < word.length(); i++)
            maxLetterHeight = Math.max(maxLetterHeight, heightList.get(word.charAt(i) - 'a'));
        return maxLetterHeight * word.length();
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Integer> heightList = Stream.of(scan.nextLine().replaceAll("\\s+", " ").trim().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            String word = scan.next().toLowerCase();
            System.out.println(designerPdfViewer(heightList, word));
        }
    }
}