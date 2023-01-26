package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.next());
        BigInteger b = new BigInteger(scan.next());
        scan.close();
        System.out.printf("%d%n%d", a.add(b), a.multiply(b));
    }
}