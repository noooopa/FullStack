package a0319;

public class ch5_11 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4};
        int[] korean = {100, 20, 30, 40};
        int[] english = {95, 20, 30, 40};
        int[] math = {46, 20, 30, 40};

        int totalKorean = 0, totalEnglish = 0, totalMath = 0;

        System.out.println("번호   국어   영어   수학   합계   평균");
        System.out.println("======================================");

        for (int i = 0; i < number.length; i++) {
            int sum = korean[i] + english[i] + math[i];
            double avg = sum / 3.0;

            System.out.printf("%-5d %-5d %-5d %-5d %-5d %-5.1f\n", 
                number[i], korean[i], english[i], math[i], sum, avg);

            totalKorean += korean[i];
            totalEnglish += english[i];
            totalMath += math[i];
        }

        System.out.println("======================================");

        System.out.printf("총점:   %-5d %-5d %-5d\n", totalKorean, totalEnglish, totalMath);
    }
}