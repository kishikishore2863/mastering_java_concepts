package TCS_NQT;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this value for more terms
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}