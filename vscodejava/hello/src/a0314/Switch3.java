package a0314;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 등급을 작성하세요.");
        int grade = scan.nextInt();
        // 자바 14버젼이상상
        //grade 1:1000, 2:3000(변경), 3:3000, 나머지: 500

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        
        };

        System.out.println("발급 받은쿠폰" + coupon);
        scan.close();
    }
}
