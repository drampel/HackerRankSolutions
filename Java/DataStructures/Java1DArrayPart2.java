package Java.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Java1DArrayPart2 {
    /* It's possible to simultaneously use overloaded canWin() methods under points 1 and 2. */
    public static boolean canWin(int leap, int[] game) {                                                             //1
        return canWin(leap, game, 0);
    }

    public static boolean canWin(int leap, int[] game, int i) {                                                      //2
        if (i < 0 || game[i] == 1) return false;
        else if (i + leap >= game.length || i == game.length - 1) return true;
        game[i] = 1;
        return canWin(leap, game, i + leap) || canWin(leap, game, i + 1) || canWin(leap, game, i - 1);
    }

    /* Alternatively, it's possible to use the canWin() method using Deque under point 3. */

//    public static boolean canWin(int leap, int[] game) {                                                           //3
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.push(0);
//        while (!deque.isEmpty()) {
//            int i = deque.pop();
//            if (i >= game.length) return true;
//            if (i < 0 || game[i] == 1) continue;
//            game[i] = 1;
//            deque.push(i + 1);
//            deque.push(i - 1);
//            deque.push(i + leap);
//        }
//        return false;
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int q = scan.nextInt();
            while (q-- > 0) {
                int[] game = new int[scan.nextInt()];
                int leap = scan.nextInt();
                for (int i = 0; i < game.length; i++) game[i] = scan.nextInt();
                System.out.println(canWin(leap, game) ? "YES" : "NO");
            }
        }
    }
}