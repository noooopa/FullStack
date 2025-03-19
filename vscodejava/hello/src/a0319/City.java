package a0319;

public class City {
    public static void main(String[] args) {
        String[] citys = {"서울", "부산", "인천", "대전", "대구"};
        int[] counts = {599, 51, 46, 43, 27};

        for (int i = 0; i < citys.length; i++) {
            System.out.printf("%s: %d명\n", citys[i], counts[i]);
        }
    }
}