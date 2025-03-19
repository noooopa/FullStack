package a0318;

public class Ex_EvenOddChecker {
    public static String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(4)); // 출력: "Even"
        System.out.println(evenOrOdd(7)); // 출력: "Odd"
    }
}

