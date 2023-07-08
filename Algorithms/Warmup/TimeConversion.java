package Algorithms.Warmup;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {
    /* One of two versions of the timeConversion() method can be used here. */
    static String timeConversion(String s) {                                                                         //1
        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));
        String meridiem = s.substring(8, 10);
        hours = meridiem.equalsIgnoreCase("PM") && hours < 12 ? hours + 12
                : (meridiem.equals("AM") && hours == 12 ? 0 : hours);
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

//    static String timeConversion(String s) {                                                                       //2
//        return String.format("%tT", LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa")));
//    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(timeConversion(scan.next()));
        }
    }
}