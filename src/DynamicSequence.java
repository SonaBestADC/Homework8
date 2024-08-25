
public class DynamicSequence extends Thread{
    private int n;

    public DynamicSequence(int n){
        this.n = n;
    }

    private int dynamicFibonacciSequence(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int v1 = 0, v2 = 1, v3 = 0;
        for (int i = 2; i <= n; i++) {
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
        }
        return v2;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int result = dynamicFibonacciSequence(n);
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.out.println("Dynamic Fibonacci(" + n + ") = " + result + " took " + elapsedTime + " ms");
    }

}
