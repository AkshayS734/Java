public class FibonacciUsingIteration {
    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println(result);
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b; // a = 1
            b = c; // b = 1
        }
        return c;
    }
}