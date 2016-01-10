public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Answer: " + findSumEvenFibonacci());
    }

    static int findSumEvenFibonacci() {
        int sum = 0;
        int fib1 = 1;
        int fib2 = 2;
        int fibonacci = 0;

        for (int i = 3; i <= 33; i++) {
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
            if (fibonacci % 2 == 0) {
                sum = sum + fibonacci;
            }
        }
        return sum + 2;
    }
}