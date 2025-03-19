package a0319;

public class Array2 {
    public static void main(String[] args) {
        // 2차원 배열 선언 및 초기화
        int[][] numbers = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0},
            {10, 20, 30, 40, 50}
        };

        // 2차원 배열 출력
        for (int i = 0; i < numbers.length; i++) {          // 행 반복
            for (int j = 0; j < numbers[i].length; j++) {   // 열 반복
                System.out.print(numbers[i][j] + "\t");     // 탭으로 정렬해서 출력
            }
            System.out.println(); // 한 행 끝나면 줄 바꿈
        }
    }
}

