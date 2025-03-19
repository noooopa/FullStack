package a0318;

public class Method1_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = add(a, b);
        int diff = subtract(a, b);
        int product = multiply(a, b);
        double quotient = divide(a, b);

        System.out.println("+ 더하기 결과: " + sum);
        System.out.println("- 빼기 결과: " + diff);
        System.out.println("* 곱하기 결과: " + product);
        System.out.println("/ 나누기 결과: " + quotient);
    }

    // 더하기
    public static int add(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " 연산 수행");
        return num1 + num2;
    }

    // 빼기
    public static int subtract(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " 연산 수행");
        return num1 - num2;
    }

    // 곱하기
    public static int multiply(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " 연산 수행");
        return num1 * num2;
    }

    // 나누기 (0으로 나누기 예외 처리)
    public static double divide(int num1, int num2) {
        System.out.println(num1 + " ÷ " + num2 + " 연산 수행");
        if (num2 == 0) {
            System.out.println("⚠️ 0으로는 나눌 수 없습니다!");
            return 0;
        }
        return (double) num1 / num2;
    }
}
