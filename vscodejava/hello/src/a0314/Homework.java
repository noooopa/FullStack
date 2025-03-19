package a0314;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int a = scan.nextInt();
        System.out.println("숫자를 입력해주세요");
        int b = scan.nextInt();
        System.out.println("숫자를 입력해주세요");
        int c = scan.nextInt();
        
        int pass = a; // 기본값을 a로 설정

        if (b > pass) { 
            pass = b; 
        }
        
        if (c > pass) { 
            pass = c; 
        }

        System.out.println("가장 큰 숫자: " + pass);
        
        scan.close();
    }
}

