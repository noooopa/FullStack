package a0313;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a == b);
        //거짓
        System.out.println(a != b);
        //참
        System.out.println(a > b);
        //거짓
        System.out.println(a < b);
        //참
        System.out.println(a >= b);
        //거짓
        System.out.println(a <= b);
        //참
        boolean result = a == b;
        System.out.println(result);
    }
}
