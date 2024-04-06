import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println(result);
        sc.close();
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        return fib(n - 1) + fib(n - 2);
    }
}
