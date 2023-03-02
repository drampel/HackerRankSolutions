package Java.DataStructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/* For Java 7 and Java 8, just add the first version of the Checker class to the existing code. */
class Checker implements Comparator<Player> {                                                                        //1
    @Override
    public int compare(Player player1, Player player2) {
        return player1.score != player2.score
                ? player2.score - player1.score
                : player1.name.compareTo(player2.name);
    }
}

/* For Java 15, it's also possible to use the second version of the Checker class. */

//class Checker implements Comparator<Player> {                                                                      //2
//    @Override
//    public int compare(Player player1, Player player2) {
//        return Comparator
//                .comparingInt(Player::getScore)
//                .reversed()
//                .thenComparing(Player::getName)
//                .compare(player1, player2);
//    }
//}

class Player {
    public String name;
    public int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Player[] players = new Player[scan.nextInt()];
            for (int i = 0; i < players.length; i++) players[i] = new Player(scan.next(), scan.nextInt());
            Arrays.sort(players, new Checker());
            for (Player player : players) System.out.printf("%s %d\n", player.getName(), player.getScore());
        }
    }
}