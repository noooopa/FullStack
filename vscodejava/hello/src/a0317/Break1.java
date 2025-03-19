package a0317;

public class Break1 {
    // 1부터 시작해서 숫자를 계속 누적해서 더하다가
    // 10보다 처음 으로 큰값
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){
            sum += i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료 : i =" + i + " sum =" + sum);
                break;
            }
            i++;
        }
    }
    // 조건식을 보면 true라고 되어있음 조건이 항상 참이기 떄문에
    // 이렇게 두면 while은 무한 반복이 됨
    // break 문이 있기 떄문에 중간에 빠져나올 수 있음
    // 만약 sum > 10 조건에 만족하면 결과 출력 후, break 를 사용해서 빠져나간다
}
