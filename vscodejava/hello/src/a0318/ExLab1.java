package a0318;

public class ExLab1 {
    public static void main(String[] args) {
        double n = 5;
        double v = volume(n);
                    System.out.printf("반지름이 %.1f인 정육면체의 부피는 %.1f이다.",n,v);
        
            }
        
            public static double volume(double n) {
                return n * n * n;
            }
}
