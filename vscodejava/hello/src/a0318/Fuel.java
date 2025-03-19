package a0318;

public class Fuel {
    public static void main(String[] args) {
        double fuel = 8.86;           // 사용한 휘발유 (L)
        double distance = 182.736;    // 주행 거리 (km)
        
        double efficiency = calculateEfficiency(distance, fuel);  // 연비 계산 메서드 호출
        System.out.printf("휘발유 %.2fL로 %.3fkm를 주행한 차량의 연비는 %.2f km/L입니다.\n", fuel, distance, efficiency);
    }

    // 연비 계산 메서드 정의 (주행 거리 ÷ 연료 사용량)
    public static double calculateEfficiency(double distance, double fuel) {
        return distance / fuel;
    }
}