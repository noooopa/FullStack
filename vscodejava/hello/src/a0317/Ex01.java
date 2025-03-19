package a0317;

public class Ex01 {
    public static void main(String[] args) {
        // while문을 사용한 1부터 10까지 자연수 출력
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        System.out.println("-"); // 구분선

        // for문을 사용한 1부터 10까지 자연수 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
