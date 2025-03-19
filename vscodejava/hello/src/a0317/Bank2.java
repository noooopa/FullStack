package a0317;

import java.util.Scanner;

public class Bank2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        int balance = 0; // 잔고 변수 선언

        while (flag) {
            System.out.println("----------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------------");
            System.out.print("선택> ");
            int num = s.nextInt();

            switch (num) {
                case 1: // 예금 기능
                    System.out.print("예금액> ");
                    int deposit = s.nextInt();
                    balance += deposit; // 잔고에 누적
                    System.out.println("예금 완료!");
                    break;

                case 2: // 출금 기능
                    System.out.print("출금액> ");
                    int withdraw = s.nextInt();
                    if (withdraw > balance) { // 잔액 부족 체크
                        System.out.println("잔액이 부족합니다!");
                    } else {
                        balance -= withdraw; // 잔고에서 차감
                        System.out.println("출금 완료!");
                    }
                    break;

                case 3: // 잔고 조회
                    System.out.println("잔고> " + balance);
                    break;

                case 4: // 종료
                    System.out.println("\n프로그램 종료");
                    flag = false;
                    break;

                default:
                    System.out.println("올바른 메뉴를 선택하세요!");
                    break;
            }
        }
        s.close(); // Scanner 닫기
    }
}
