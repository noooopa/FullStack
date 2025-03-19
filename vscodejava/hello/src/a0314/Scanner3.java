package a0314;

import java.util.Scanner;

public class Scanner3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("숫자를 입력하세요: ");
        int i = scanner.nextInt();
        System.out.print("한번 더 숫자를 입력하세요: ");
        int ie = scanner.nextInt();

        System.out.println(i +" "+ ie);
        System.out.println(i);
        System.out.println(ie);
        scanner.close();
        }
}
