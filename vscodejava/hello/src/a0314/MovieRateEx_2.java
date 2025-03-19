package a0314;

import java.util.Scanner;

public class MovieRateEx_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("영화 평점을 입력하세요: ");
        
        double rating = scanner.nextDouble();
        
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }

        scanner.close();
    }
}
