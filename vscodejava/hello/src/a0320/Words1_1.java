package a0320;

import java.util.Scanner;

public class Words1_1 {
    public static void main(String[] args) {
        // 2차원 배열: 영어 단어 - 한국어 뜻
        String[][] words = {
            {"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);

        // 문제 내기 시작
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. '%s'의 뜻은? ", i + 1, words[i][0]);

            String tmp = scanner.nextLine(); // 사용자 입력 받기

            // 정답 비교
            if (tmp.equals(words[i][1])) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("틀렸어요! 정답은 '" + words[i][1] + "'입니다.");
            }
        }

        scanner.close();
    }
}
