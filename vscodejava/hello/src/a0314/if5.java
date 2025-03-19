package a0314;

import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade = scan.nextInt();
        int coupon;

        switch (grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2 :
                coupon = 2000;
                break;
            case 3 :
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }

        System.out.println("발급 받은쿠폰" + coupon);
        scan.close();
    }
}
