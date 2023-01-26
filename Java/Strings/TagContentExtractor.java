package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases-- > 0) {
            boolean found = false;
            Matcher matcher = Pattern.compile("<(.+)>([^<>]+)</\\1>").matcher(in.nextLine());
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            if (!found) System.out.println("None");
        }
        in.close();
    }
}