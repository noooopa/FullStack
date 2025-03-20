package a0320;

public class Class1_1 {
    public static void main(String[] args) {
        // 객체 생성
        Cat c = new Cat();  

        // 객체에 속성 값 넣기
        c.name = "네로";
        c.breeds = "페르시안";
        c.weight = 4.37;  // double 타입으로 입력

        // 객체 상태 출력
        System.out.printf("이름: %s\n", c.name);
        System.out.printf("품종: %s\n", c.breeds);
        System.out.printf("체중: %.2fkg\n", c.weight);

        // 객체 행동 실행
        c.claw(); // 할퀴기 출력
        c.meow(); // 야옹 출력
    }
}

// Cat 클래스 (설계도)
class Cat {
    String name;     // 이름
    String breeds;   // 품종
    double weight;   // 체중

    // 메서드 (행동)
    void claw() {
        System.out.println("할퀴기");
    }
    void meow() {
        System.out.println("야옹");
    }
}
