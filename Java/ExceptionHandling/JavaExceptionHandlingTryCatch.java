package Java.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(sc.nextInt() / sc.nextInt());
        } catch (InputMismatchException | ArithmeticException e) {
            if (e instanceof InputMismatchException)
                System.out.println(e.getClass().getName());
            else System.out.println(e);
        }
    }
}