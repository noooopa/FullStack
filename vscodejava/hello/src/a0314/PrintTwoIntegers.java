package a0314;

import java.util.Scanner;

public class PrintTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();

            if (scanner.hasNextInt()) {
                int num2 = scanner.nextInt();

                System.out.println(num1 + " " + num2);
            } else {
                System.out.println("두 번째 입력이 정수가 아닙니다.");
            }
        } else {
            System.out.println("첫 번째 입력이 정수가 아닙니다.");
        }

        scanner.close();
    }
}
