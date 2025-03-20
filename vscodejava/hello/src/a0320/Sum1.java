package a0320;

public class Sum1 {
    public static void main(String[] args) {
        int[][] score = {
            {100, 95, 46},
            {20, 20, 20},
            {30, 30, 30},
            {40, 40, 40}
        };
        int kor = 0;
        int eng = 0;
        int math = 0;

        System.out.println("번호  국어  영어  수학  합계  평균");
        System.out.println("======================================");
        // int k = score.length; // 행의 갯수
        // System.out.println(k);

        // int m = score[0].length; // 열의 갯수
        // System.out.println(m);
        for(int i = 0; i < score.length; i++){
            int sum = 0;
            float avg = 0.0f;

            // 과목별 총점
            kor = kor + score[i][0]; // 국어 총점
            eng = eng + score[i][1]; // 영어 총점
            math += score[i][2]; // 수학 총점 (위와 같지만 다른 방식으로 표현)
            System.out.printf("%d", i+1);

            for(int j = 0; j < score[i].length; j++){
                // 가로 합계
                sum += score[i][j];
                //과목별 점수 출력
                System.out.printf("%5d", score[i][j]);
            }
            // 가로 평균 구한 후, 가로 합계와 평균 출력
            avg = sum / (float)score[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }
        System.out.println("======================================");
        System.out.printf("총점: %4d %4d %4d", kor, eng, math);
    }
}
