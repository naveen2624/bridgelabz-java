package runtimeanalysisandbigonotation;

public class StringConcatenationPerformance {

    public static void main(String[] args) {

        int N = 1_000_000; // change to 1_000 / 10_000 / 1_000_000

        // String (Immutable)
        long startString = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) {
            s = s + "hello";
        }
        long endString = System.nanoTime();

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("hello");
        }
        long endBuilder = System.nanoTime();

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("hello");
        }
        long endBuffer = System.nanoTime();

        System.out.println("Operations: " + N);
        System.out.println("String Time (ms): " +
                (endString - startString) / 1_000_000);
        System.out.println("StringBuilder Time (ms): " +
                (endBuilder - startBuilder) / 1_000_000);
        System.out.println("StringBuffer Time (ms): " +
                (endBuffer - startBuffer) / 1_000_000);
    }
}
