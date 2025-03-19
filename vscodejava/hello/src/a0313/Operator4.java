package a0313;

public class Operator4 {
    public static void main(String[] args) {
        int c = 2*2+3*3; // 연산자 우선순위 (2*2)+(3*3)
        System.out.println(c); // 13
        int d = (2*2)+(3*3); // 괄호를 사용하여 연산자 우선순위를 변경
        System.out.println(d); // 13
    }
}
