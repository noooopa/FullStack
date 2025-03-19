package a0318;

public class Method1_4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int diff = subtract(a, b);
        int product = multiply(a, b);
        double quotient = divide(a, b);

        System.out.println("- 빼기 결과: " + diff);
        System.out.println("* 곱하기 결과: " + product);
        System.out.println("/ 나누기 결과: " + quotient);
    }

    // 더하기
    public static void add(int num1, int num2) {
        // return 필요없을때 void사용
        System.out.println(num1 + " + " + num2 + " 연산 수행");
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
    // 리턴을 할 필요가 없을때 void를 사용함, 
}
