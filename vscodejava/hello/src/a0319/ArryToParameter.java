package a0319;

public class ArryToParameter {
    public static void main(String[] args) {
        int [] evens = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18}; // 짝수
        int [] primes = {2, 3, 5, 7, 11, 13, 17, 19}; // 소수배열

        int evenSum = sum (evens);
        int primeSum = sum (primes);

        System.out.println("짝수 배열의 합 : %d\n, evenSum");
        System.out.println("소수 배열의 합 : %d\n, primeSum");
    }
        
            private static int sum(int[] arr){
                int sum = 0;
                for(int i=0; i < arr.length;i++){
                    sum += arr[i];
                }
                return sum;
            }
}
