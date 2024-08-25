public class Main {
    public static void main(String[] args) {
        int n = 40;
        RecursiveSequence recursive = new RecursiveSequence(n);
        DynamicSequence dynamic = new DynamicSequence(n);

        recursive.start();
        dynamic.start();
    }
}