package a0318;

public class Ex7 {
    public static void main(String[] args) {
        // 휘발유 8.86리터(L)를 충전한 자동차의 총 주행거리가 182.736km일 때, 해당 자동차의 연비를 
        // 계산하는 프로그램을 작성하시오. 단, 연비 계산 과정은 메소드의 호출과 정의를 통해 구한다.
        //  연비 = 이동거리 / 사용량
        double l = 8.86;
        double distance = 182.736;
        double dusql = calcdusql(l,distance);
                    System.out.printf("연비 : %.2f로 km/L",dusql);
            }
        
            public static double calcdusql(double l, double distance) {
                return distance / l;
            }
}

// calcdusql - 메소드 이름
// double l, double distance 매개변수 , 입력변수 , 파라미터
// return distance / l; 반환값
// 반환타입 
