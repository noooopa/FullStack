package a0317;

import java.util.Scanner;

public class Bank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            // 메뉴 출력
            System.out.println("===============================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("===============================");
            System.out.print("선택> ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("예금액> ");
                    int deposit = Integer.parseInt(scanner.nextLine());
                    balance += deposit;
                    System.out.println("예금액>" + deposit);
                    break;

                case "2":
                    System.out.print("출금액> ");
                    int withdraw = Integer.parseInt(scanner.nextLine());
                    if (withdraw > balance) {
                        System.out.println("잔액이 부족합니다.");
                    } else {
                        balance -= withdraw;
                        System.out.println("출금액>" + withdraw);
                    }
                    break;

                case "3":
                    System.out.println("잔고>" + balance);
                    break;

                case "4":
                    System.out.println("\n프로그램 종료");
                    scanner.close();
                    return;

                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
                    break;
            }
        }
    }
}
