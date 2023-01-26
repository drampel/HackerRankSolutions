package Java.BigNumber;

import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in)
                .nextBigInteger()
                .isProbablePrime(100) ? "prime" : "not prime");
    }
}