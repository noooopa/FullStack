package a0313;

public class Ex01 {
    // 세자리 정수의 각 자릿수 총합을 출력하려 한다.
    // num = 374
    // 정수 374의 각 자릿수의 총합 : 14
    // 힌트1 : 3 + 7 + 4 = 14
    // 힌트2 : % 나머지와 / 나누기를 적절히 이용
    // 힌트3 : 100으로 나누고 10으로 나누고 나머지 이용
    public static void main(String[] args) {
        int num = 374;
        int hundreds = num / 100; 
        int tens = (num % 100) / 10;
        int ones = num % 10;
        
        int sum = hundreds + tens + ones;

        System.out.println("정수 " + num + "의 각 자릿수의 총합 : " + sum);
    }
}
