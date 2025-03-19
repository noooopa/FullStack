package a0318;

public class Ex_FactorialCalculator {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 출력: 120
        System.out.println(factorial(3)); // 출력: 6
    }
}

