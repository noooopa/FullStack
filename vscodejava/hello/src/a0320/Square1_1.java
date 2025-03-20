package a0320;

public class Square1_1 {
    private double length;

    public Square1_1(double length) {
        this.length = length;
    }

    public double area() {
        return length * length;
    }

    public static void main(String[] args) {
        Square1_1 square = new Square1_1(4.0);

        System.out.println("한 변의 길이: " + square.length);
        System.out.println("정사각형의 넓이: " + square.area());
    }
}
