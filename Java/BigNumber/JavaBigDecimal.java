package Java.BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = sc.next();
        sc.close();

        /* For Java 7 and Java 8, just add one of the four variants to existing code. */
        Arrays.sort(s, 0, n, (s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)));             //1

//        Arrays.sort(s, 0, n, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));        //2

//        Arrays.sort(s, Collections.reverseOrder((s1, s2) -> {                                         //3
//            if (s1 == null || s2 == null) return 0;
//            return new BigDecimal(s1).compareTo(new BigDecimal(s2));
//        }));

//        boolean sorted = false;                                                                       //4
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < n - 1; i++) {
//                if (new BigDecimal(s[i + 1]).compareTo(new BigDecimal(s[i])) > 0) {
//                    String temp = s[i + 1];
//                    s[i + 1] = s[i];
//                    s[i] = temp;
//                    sorted = false;
//                }
//            }
//        }

        for (String str : s) System.out.println(str);
    }
}