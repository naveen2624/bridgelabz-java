package linearandbinarysearch.stringbuffer;

public class StringBufferVsStringBuilder {

    public static void main(String[] args) {

        int count = 1_000_000;

        // StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sbuilder.append("hello");
        }
        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sbuffer.append("hello");
        }
        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        System.out.println("StringBuilder Time (ns): " + builderTime);
        System.out.println("StringBuffer Time (ns): " + bufferTime);
    }
}
