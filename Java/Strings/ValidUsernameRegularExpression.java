package Java.Strings;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            System.out.println(scan.nextLine().matches(UsernameValidator.regularExpression) ? "Valid" : "Invalid");
        }
        scan.close();
    }
}

/* For Java 7 and Java 8, just add the UsernameValidator class. */
class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}