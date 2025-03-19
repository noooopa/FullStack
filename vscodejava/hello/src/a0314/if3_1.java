package a0314;

import java.util.Scanner;

public class if3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("아이템 가격을 입력하세요: ");
        int price = scanner.nextInt();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매, 1,000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 1,000원 할인");
        }

        int totalPrice = price - discount;

        System.out.println("총 할인 금액: " + discount + "원");
        System.out.println("최종 결제 금액: " + totalPrice + "원");

        scanner.close();
    }
}
