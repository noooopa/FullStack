package a0314;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 등급을 작성하세요.");
        int grade = scan.nextInt();
        int coupon;
        //grade 1:1000, 2:3000(변경), 3:3000, 나머지: 500

        switch (grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2 :
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
