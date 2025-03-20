package a0320;

public class Bicycle {
    String name;   // 이름
    double weight; // 무게
    int price;     // 가격

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();

        // 인스턴스 변수 초기화
        b1.name = "로드형 자전거";
        b1.weight = 7.25;
        b1.price = 326000;

        System.out.printf("b1=>{%s, %.2f, %d}\n", b1.name, b1.weight, b1.price);
    }
}

