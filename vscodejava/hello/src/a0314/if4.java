package a0314;

import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 작성하세요.");
        int grade = scanner.nextInt();
        int coupon;

        if(grade == 1){
            coupon = 1000;
        }else if(grade == 2){
            coupon = 2000;
        }else if(grade == 3){
            coupon = 3000;
        }else{
            coupon = 500;
        }

        System.out.println("발급 받은쿠폰" + coupon);

        scanner.close();
    }
    
}
