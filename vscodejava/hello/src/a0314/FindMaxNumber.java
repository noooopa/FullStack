package a0314;

import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.print(max);

        scanner.close();
    }
}

