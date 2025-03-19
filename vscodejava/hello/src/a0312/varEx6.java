package a0312;

public class varEx6 {
    public static void main(String[] args) {
        double f = 77.0; // 화씨 온도
        double c = (f - 32.0) / 1.8; // 화씨 -> 섭씨 변환 공식

        System.out.printf("화씨 %.1f도는 섭씨로 %.1f도입니다.", f, c);
    }
}
