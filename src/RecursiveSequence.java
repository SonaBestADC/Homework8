
public class RecursiveSequence extends Thread {
    private int n;

    public RecursiveSequence(int n) {
        this.n = n;
    }

    private int recursiveFibonacciSequence(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return recursiveFibonacciSequence(n - 1) + recursiveFibonacciSequence(n - 2);
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int result = recursiveFibonacciSequence(n);
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.out.println("Recursive Fibonacci(" + n + ") = " + result + " took " + elapsedTime + " ms");

    }

}
