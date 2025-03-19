package a0319;

import java.util.Random;

public class lotto1_2 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // 1부터 45까지 배열에 채우기
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        // 배열 섞기 (셔플)
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int r = rand.nextInt(45);
            int temp = ball[0];
            ball[0] = ball[r];
            ball[r] = temp;
        }

        // 섞인 배열에서 앞의 6개 출력
        System.out.print("이번 주 로또 번호는: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(ball[i] + " ");
        }
        System.out.println();
    }
}
