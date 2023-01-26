package Java.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JavaAnagrams {
    /* For Java 7 and Java 8, just add the first version of the isAnagram() method to existing code. */
    public static boolean isAnagram(String a, String b) {                          //1
        if (a.length() != b.length()) return false;
        int sum = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.toLowerCase().charAt(i) == ch) sum++;
                if (b.toLowerCase().charAt(i) == ch) sum--;
            }
            if (sum != 0) return false;
        }
        return true;
    }

    /* For Java 15, it's also possible to use the second or third version of the isAnagram() method. */

//    public static boolean isAnagram(String a, String b) {                         //2
//        if (a.length() != b.length()) return false;
//        char[] charsA = a.toLowerCase().toCharArray();
//        char[] charsB = b.toLowerCase().toCharArray();
//        Arrays.sort(charsA);
//        Arrays.sort(charsB);
//        return Arrays.equals(charsA, charsB);
//    }

//    public static boolean isAnagram(String a, String b) {                         //3
//        if (a.length() != b.length()) return false;
//        ArrayList<Character> charactersA = new ArrayList<>();
//        ArrayList<Character> charactersB = new ArrayList<>();
//        for (int i = 0; i < a.length(); i++) {
//            charactersA.add(a.toLowerCase().charAt(i));
//            charactersB.add(b.toLowerCase().charAt(i));
//        }
//        Collections.sort(charactersA);
//        Collections.sort(charactersB);
//        return charactersA.equals(charactersB);
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(isAnagram(scan.next(), scan.next()) ? "Anagrams" : "Not Anagrams");
        scan.close();
    }
}