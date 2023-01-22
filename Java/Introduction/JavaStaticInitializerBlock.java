package Java.Introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    private static final Scanner sc;
    private static final int B;
    private static final int H;
    private static boolean flag;

    static {
        sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        try {
            if (B <= 0 || H <= 0) throw new Exception("Breadth and height must be positive");
            else flag = true;
        } catch (Exception e) {
            System.out.println(e);
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}