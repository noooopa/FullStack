package a0318;

public class Method2 {
    public static void main(String[] args) {
        
        int sum1 = add(5,10);
        System.out.println("결과1 출력" + sum1);
        int sum2 = add(15,20);
        System.out.println("결과2 출력" + sum2);

        int subt1 = subtract(10,3);
        System.out.println("결과3 출력" + subt1);
        
        int mult1 = multiply(3,6);
        System.out.println("결과4 출력" + mult1);
                
        int div1 = divide(6,8);
        System.out.println("결과5 출력" + div1);
        
                }
                                
                        
                        
                        
                
                
                
                public static int divide(int i, int j) {
                System.out.println(i + "/" + j + "연산수행");
                int div = i / j;
                return div;
            }
        
        
        
        
        
        
        
                public static int add(int a, int b) {
        System.out.println(a + "+" + b + "연산수행");
        int sum = a + b;
        return sum;
    }

        public static int subtract(int x, int y) {
        System.out.println(x + "-" + y + "연산수행");
        int subt = x - y;
        return subt;
    }
        public static int multiply(int i, int j) {
        System.out.println(i + "*" + j + "연산수행");
        int mult = i * j;
        return mult;
    }

    // add +, subtract - , multiply *, divide %
}
