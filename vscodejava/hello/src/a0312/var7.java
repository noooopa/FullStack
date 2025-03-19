package a0312;

public class var7 {
    public static void main(String[] args) {

        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767 
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)
        // 정수형의 대표는 int

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        float f = 10.0f;
        double d = 10.0;
        // 실수형의 대표는 double

        // 변수명
        // int 1num = 10; 변수 이름은 숫자로 시작할 수 없음 (num1은 가능)

        // int int = 20; 자바의 예약어를 변수 이름으로 사용할 수 없음 (int, class, publc)

        // 변수명에는 영문자, 숫자, 달러기호($) 또는 언더바 만 사용

        // 변수명은 소문자로 시작하는것이 일반적이다.
        // 소문자로 시작해서 그 이후의 각 단어는 대문자로 시작 
        // (카멜 표기법, camel case) ex) orderDetail, myAccount

        // 자바 정리
        // 자바에서 클래스 이름의 첫 글자는 대문자로 시작한다. 
        // 그리고 나머지는 모두 소문자로 시작하고 카멜 표기법을 사용한다.
        // 클래스 : Person, OrderDetail
        // 변수를 포함한 나머지 : firstName, userAccount
        // 예외 2가지
        // 상수 모두 대문자를 사용하고 언더바를 구분 
        // USER_LIMIT
        // 패키지는 모두 소문자
        // org.spring.boot
    }

}
