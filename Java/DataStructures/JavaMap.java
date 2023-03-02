package Java.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] argh) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = Integer.parseInt(scan.nextLine().trim());
            if (n > 0) {
                Map<String, Integer> map = new HashMap<>();
                for (int i = 0; i < n; i++)
                    map.put(scan.nextLine().replaceAll("\\s+", " ").trim(),
                            Integer.parseInt(scan.nextLine().trim()));
                while (scan.hasNext()) {
                    String s = scan.nextLine().replaceAll("\\s+", " ").trim();
                    System.out.println(map.containsKey(s) ? (s + "=" + map.get(s)) : "Not found");
                }
            }
        }
    }
}