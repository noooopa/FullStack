package a0313;

public class Operator2 {
    public static void main(String[] args) {
        String str1 = "hello" + "world"; // 문자열 연결
        System.out.println(str1);

        String a1 = "string1";
        String a2 = "string2";
        String str2 = a1 + a2;
        System.out.println(str2);

        String str3 = "a + b = " + 20; // 문자열과 숫자 연결
        System.out.println(str3);

        int num = 50;
        String str4 = "a + b = " + num; // 문자열과 숫자 연결
        System.out.println(str4);
    }
}
