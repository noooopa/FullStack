package a0318;

public class Pork{
    public static void main(String[] args) {
        int n = 3; // 인분 수
        double totalCalorie = calculateCalorie(n); // 메서드 호출
        System.out.printf("삼겹살 %d인분의 칼로리: %.2f kcal\n", n, totalCalorie);
    }

    // 칼로리를 계산하는 메서드
    public static double calculateCalorie(int portions) {
        double gramPerPortion = 180.0;
        double caloriePerGram = 5.179;
        return portions * gramPerPortion * caloriePerGram;
    }
}
