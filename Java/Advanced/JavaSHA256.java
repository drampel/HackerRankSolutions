package Java.Advanced;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String s = scan.next();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(s.getBytes(StandardCharsets.UTF_8));

            /* One of two variants can be used here. */
            for (byte b : digest) System.out.format("%02x", b);                                                      //1
//            System.out.format("%064x", new BigInteger(1, digest));                                                 //2

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}