package a0318;

public class Ex_StringReverser {
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello")); // 출력: "olleh"
        System.out.println(reverseString("Java"));  // 출력: "avaJ"
    }
}

