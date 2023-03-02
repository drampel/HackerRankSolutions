package Java.DataStructures;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaStack {
    /* Use one of the three versions of the isBalanced() method. */
    private static boolean isBalanced(String str) {                                                                  //1
        if (str.length() % 2 != 0) return false;
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') deque.push(ch);
            else if (!deque.isEmpty() && ((ch == ']' && deque.peek() == '[')
                    || (ch == '}' && deque.peek() == '{')
                    || (ch == ')' && deque.peek() == '('))) deque.pop();
            else return false;
        }
        return deque.isEmpty();
    }

//    private static boolean isBalanced(String str) {                                                                //2
//        Map<Character, Character> map = new HashMap<>();
//        map.put('(', ')');
//        map.put('[', ']');
//        map.put('{', '}');
//        if (str.length() % 2 != 0) return false;
//        ArrayDeque<Character> deque = new ArrayDeque<>();
//        for (int i = 0; i < str.length(); i++) {
//            Character ch = str.charAt(i);
//            if (map.containsKey(ch)) deque.push(ch);
//            else if (deque.isEmpty() || ch != map.get(deque.pop())) return false;
//        }
//        return deque.isEmpty();
//    }

//    private static boolean isBalanced(String str) {                                                                //3
//        while (str.length() != (str = str.replaceAll("\\(\\)|\\[]|\\{}", "")).length()) ;
//        return str.isEmpty();
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) System.out.println(isBalanced(scan.next()));
        }
    }
}