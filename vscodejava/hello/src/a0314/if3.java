package a0314;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        // int price = 10000; // 아이템가격
        // int age = 10; // 나이
        // scanner 아이템가격과 나이를 입력받고
        // 총 할인금액과 결제금액을 출력하시오.
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이템 가격을 입력하세요.");
        int price = scanner.nextInt();
        System.out.print("나이를 입력하세요.");
        int age = scanner.nextInt();
        int discount = 0;
        

        if(price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }if(age <= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }
        int sum = price - discount;
        System.out.println("총 할인 금액 : " + discount + "원");
        System.out.printf("%d원에서 %d원 할인된 %d원입니다.",price,discount,sum);

        scanner.close();
    }
}
