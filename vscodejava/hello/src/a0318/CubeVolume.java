package a0318;

public class CubeVolume {
    public static void main(String[] args) {
        int n = 5; // 한 변의 길이
        int volume = cubeVolume(n); // 메서드 호출해서 부피 구하기
        System.out.printf("한 변의 길이가 %d인 정육면체의 부피: %d\n", n, volume);
    }

    // 정육면체 부피를 구하는 메서드
    public static int cubeVolume(int length) {
        return length * length * length; // n³ 계산
    }
}
