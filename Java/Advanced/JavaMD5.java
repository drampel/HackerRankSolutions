package Java.Advanced;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String s = scan.next();
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(s.getBytes(StandardCharsets.UTF_8));

            /* One of three variants can be used here. */
            for (byte b : digest) System.out.format("%02x", b);                                                      //1
//            System.out.format("%032x", new BigInteger(1, digest));                                                 //2
//            System.out.println(new BigInteger(1, digest).toString(16));                                            //3

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}