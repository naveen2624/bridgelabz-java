package runtimeanalysisandbigonotation;
import java.util.*;

public class DataStructureSearchComparison {

    public static void main(String[] args) {

        int N = 1_000_000;
        int target = N - 1;

        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array Search
        long startArray = System.nanoTime();
        for (int i = 0; i < N; i++) {
            if (array[i] == target) break;
        }
        long endArray = System.nanoTime();

        // HashSet Search
        long startHash = System.nanoTime();
        hashSet.contains(target);
        long endHash = System.nanoTime();

        // TreeSet Search
        long startTree = System.nanoTime();
        treeSet.contains(target);
        long endTree = System.nanoTime();

        System.out.println("Dataset Size: " + N);
        System.out.println("Array Search Time (ms): " +
                (endArray - startArray) / 1_000_000);
        System.out.println("HashSet Search Time (ms): " +
                (endHash - startHash) / 1_000_000);
        System.out.println("TreeSet Search Time (ms): " +
                (endTree - startTree) / 1_000_000);
    }
}
