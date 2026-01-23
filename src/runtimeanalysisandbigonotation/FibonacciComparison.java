package runtimeanalysisandbigonotation;

public class FibonacciComparison {

    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static int fibonacciIterative(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int n = 30; // try 10 / 30 / 50

        long startRec = System.nanoTime();
        fibonacciRecursive(n);
        long endRec = System.nanoTime();

        long startItr = System.nanoTime();
        fibonacciIterative(n);
        long endItr = System.nanoTime();

        System.out.println("Fibonacci N: " + n);
        System.out.println("Recursive Time (ms): " +
                (endRec - startRec) / 1_000_000);
        System.out.println("Iterative Time (ms): " +
                (endItr - startItr) / 1_000_000);
    }
}
