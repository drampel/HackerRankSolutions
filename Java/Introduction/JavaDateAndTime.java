package Java.Introduction;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        int year = scan.nextInt();
        scan.close();
        System.out.println(Result.findDay(month, day, year));
    }
}

/* For Java 7 and Java 8, simply add one of the Result class variants. */
class Result {
    public static String findDay(int month, int day, int year) {
        if (year > 2000 && year < 3000) return LocalDate.of(year, month, day).getDayOfWeek().toString();
        else return "Constraints: 2000 < year < 3000";
    }
}

//class Result {
//    public static String findDay(int month, int day, int year) {
//        if (year > 2000 && year < 3000) {
//            Calendar calendar = Calendar.getInstance();
//            calendar.set(Calendar.YEAR, year);
//            calendar.set(Calendar.MONTH, month - 1);
//            calendar.set(Calendar.DAY_OF_MONTH, day);
//            return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase(Locale.ROOT);
//        } else return "Constraints: 2000 < year < 3000";
//    }
//}