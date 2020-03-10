import java.math.BigInteger;


public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;

        int previous = 0, next = 1, sum;

        for (int i = 2; i <= n; i++) {
            sum = previous;
            previous = next;
            next = sum + previous;
        }

        return next;
    }

    public static BigInteger fib2(int n) {
        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger previous = BigInteger.ZERO, next = BigInteger.ONE, sum;

        for (int i = 2; i <= n; i++) {
            sum = previous;
            previous = next;
            next = sum.add(previous);
        }

        return next;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));
        }

        System.out.println("---");

        for (int i = 0; i < 10; i++) {
            System.out.println(fib2(i));
        }

        System.out.println("---");

        System.out.println(fib(100)); //overflow
        System.out.println(fib2(100));
    }
}
