package a0313;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b; // 덧셈 연산자

        int sub = a - b; // 뺄셈 

        int mul = a * b; // 곱셈

        int div = a / b; // 나눗셈

        int mod = a % b; // 나머지

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n%d %% %d = %d%n", a, b, sum, a, b, sub, a, b, mul, a, b, div, a, b, mod);
    }
}