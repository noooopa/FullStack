package a0317;

public class Ex04 {
    public static void main(String[] args) {
        while (true) { 
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice1 + dice2;
            
            System.out.println("(" + dice1 + ", " + dice2 + ")");
            
            if (sum == 5) {
                break;
            }
        }
    }
}
