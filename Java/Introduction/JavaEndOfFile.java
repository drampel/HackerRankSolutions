package Java.Introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0;
            while (sc.hasNext()) {
                String str = sc.nextLine();
                if (!str.isBlank()) {
                    if (str.strip().equalsIgnoreCase("eof")) break;
                    System.out.println(++count + " " + str);
                }
            }
        }
    }
}