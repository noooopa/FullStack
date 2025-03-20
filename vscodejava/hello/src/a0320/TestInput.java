package a0320;

import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("한 줄 입력: ");
        String line = sc.nextLine();
        System.out.println("입력값 확인: [" + line + "]");
        sc.close();
    }
}

