package a0319;

public class TopScorer {
    public static void main(String[] args) {
        String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Sam"};
        int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};

        int maxScore = scores[0];
        int maxIndex = 0;

        // 최고 점수 찾기
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxIndex = i;
            }
        }

        System.out.printf("1등: %s(%d점)\n", names[maxIndex], maxScore);
    }
}