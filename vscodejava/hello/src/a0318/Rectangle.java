package a0318;

public class Rectangle {
    public static void main(String[] args) {
        drawRectangle();
    }

    // 사각형 전체를 그리는 메서드
    public static void drawRectangle() {
        drawLine();  // 윗줄 출력
        drawEdge();  // 옆면 출력
        drawLine();  // 아랫줄 출력
    }

    // 별과 공백으로 윗줄과 아랫줄 출력
    public static void drawLine() {
        System.out.println("* * * * *");
    }

    // 별로 된 양 옆과 공백으로 이루어진 중간 라인 출력
    public static void drawEdge() {
        System.out.println("*       *");
    }
}
