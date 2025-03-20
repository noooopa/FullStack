package a0319;

public class Ex_score_1 {
    public static void main(String[] args) {
        // 각 학생의 번호, 국어, 영어, 수학 점수를 배열로 저장
        int[] number = {1, 2, 3, 4};              // 학생 번호 배열
        int[] korean = {100, 20, 30, 40};         // 국어 점수 배열
        int[] english = {95, 20, 30, 40};         // 영어 점수 배열
        int[] math = {46, 20, 30, 40};            // 수학 점수 배열

        // 각 과목의 총점을 누적해서 저장할 변수
        int totalKorean = 0, totalEnglish = 0, totalMath = 0;

        // 표의 헤더 출력
        System.out.println("번호   국어   영어   수학   합계   평균");
        System.out.println("======================================");

        // 각 학생별 점수, 합계, 평균을 출력하는 반복문
        for (int i = 0; i < number.length; i++) {
            // 각 학생의 총점(합계) 계산
            int sum = korean[i] + english[i] + math[i];
            // 각 학생의 평균 계산 (소수점 출력 위해 3.0으로 나눔)
            double avg = sum / 3.0;

            // printf를 사용해서 정렬된 표 형태로 출력
            // %-5d 는 왼쪽 정렬 + 5칸 자리 확보, %-5.1f 는 소수점 첫째자리까지 출력
            System.out.printf("%-5d %-5d %-5d %-5d %-5d %-5.1f\n", 
                number[i], korean[i], english[i], math[i], sum, avg);

            // 각 과목의 총점 누적
            totalKorean += korean[i];
            totalEnglish += english[i];
            totalMath += math[i];
        }

        // 표 마무리 구분선 출력
        System.out.println("======================================");

        // 총점 출력 (국어 총점, 영어 총점, 수학 총점)
        System.out.printf("총점:   %-5d %-5d %-5d\n", totalKorean, totalEnglish, totalMath);
    }
}
