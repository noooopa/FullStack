package a0314;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 월 입력받기
        int month = scanner.nextInt();
        String season = "";

        // switch 문을 사용하여 계절 구분
        switch (month) {
            case 12: case 1: case 2:
                season = "winter";
                break;
            case 3: case 4: case 5:
                season = "spring";
                break;
            case 6: case 7: case 8:
                season = "summer";
                break;
            case 9: case 10: case 11:
                season = "fall";
                break;
            default:
                season = "Invalid month"; // 1~12 외의 값이 들어오면 오류 메시지
        }

        // 결과 출력
        System.out.println(season);

        scanner.close();
    }
}
