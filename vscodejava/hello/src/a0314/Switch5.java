package a0314;

import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("지금 몇 월인지 입력하세요");
        int season = scan.nextInt();

        // switch (season) {
        //     case 12,1,2 :
        //         System.out.println("winter");
        //         break;
        //     case 3,4,5 :
        //         System.out.println("spring");
        //         break;
        //     case 6,7,8 :
        //         System.out.println("summer");
        //         break;
        //     case 9,10,11 :
        //         System.out.println("fall");
        //         break;
        //     default:
        //         System.out.println("잘못입력하셨습니다.");
        //         break;
        // }
        switch (season) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("winter");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("fall");
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
                break;
        }
        
        System.out.println(season);
        scan.close();
    }
    
}
