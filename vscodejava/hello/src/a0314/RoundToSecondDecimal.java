package a0314;

import java.util.Scanner;

public class RoundToSecondDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num = scanner.nextDouble();
        
        System.out.printf("%.2f", num);
        
        scanner.close();
    }
}
