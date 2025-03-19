package a0313;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";
        System.out.println(str1==str2);

        boolean result = "hello".equals("hello");
        //리터럴 비교 대소문자 구분함
        System.out.println(result);

        boolean result1 = str1.equals("문자열1");
        System.out.println(result1);
        boolean result2 = str1.equals(str2);
        System.out.println(result2);
    }
}
