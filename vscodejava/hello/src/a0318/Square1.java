package a0318;

public class Square1 {
    public static void main(String[] args) {
        int n = 4;
        int s = SquareUtil.square(n);
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d", n, s);
    
    }
        
   
   
}
// 분리를 해서 쓰는 경우 메인 public과 분리 후 public은 공존할 수 없다. 분리하는 경우 밑에와 같이 class를 부여해서 사용한다.
class SquareUtil{
 public static int square(int length) {
        // public - 접근 제한자
        //static 객체 생성없이 square 함수를 부르려면 ..
        int result = length * length;
        return result;
    }
}
