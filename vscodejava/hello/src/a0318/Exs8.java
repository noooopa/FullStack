package a0318;

public class Exs8 {
    

    public static void main(String[] args) {
        System.out.println(max(10, 20)); // 출력: 20
        System.out.println(max(5, 3));   // 출력: 5
        System.out.println(evenOrOdd(4));
        System.out.println(evenOrOdd(7));
        System.out.println(reverseString("hello")); // 출력: "olleh"
        System.out.println(reverseString("Java"));  // 출력: "avaJ"
    }

    public static int max(int a, int b) {
            // if (a > b) {
            //     return a;
            // } else {
            //     return b;
            // }
            return (a > b) ? a : b;
        }

    public static String evenOrOdd(int num){
        // if(num % 2 == 0){
        //     return "Even";
        // }else{
        //     return "Odd";
        // }
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static String reverseString(String str){
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    
}

