package a0318;

public class Method1_5 {
    public static void main(String[] args) {

        Calculator2 calc2 = new Calculator2();
        int num1 = 10, num2 = 5;

        calc2.add(num1, num2);
        System.out.println("뺄셈: " + Calculator2.subtract(num1,num2));
        System.out.println("곱셈: " + Calculator2.multiply(num1,num2));
        System.out.println("나눗셈: " + Calculator2.divide(num1,num2));
    }
}

class Calculator2 {
    // 객체를 만들경우 static을 빼도됨, 객체 없이 호출가능
    // return 할 필요가 없으면 타입(int,String) void를 써야된다.
    public void add(int a, int b){
        System.out.println("덧셈: " + (a+b));
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("0으로 나눌수 없습니다.");
        }
        return (double) a / b;
    }
    
}