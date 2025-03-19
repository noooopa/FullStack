package a0318;

public class Method1_2 {
    public static void main(String[] args) {
        // 계산 1
        int sum1 = addAndPrint(5, 10);

        // 계산 2
        int sum2 = addAndPrint(10, 20);

        System.out.println("최종 결과 sum1: " + sum1);
        System.out.println("최종 결과 sum2: " + sum2);
    }

    // 두 정수를 더하고 출력하는 메서드
    public static int addAndPrint(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " 연산수행");
        int result = num1 + num2;
        System.out.println("결과 출력: " + result);
        return result;
    }
}
