package runtimeanalysisandbigonotation;

import java.util.Arrays;
import java.util.Random;

public class SearchPerformanceComparison {

    // Linear Search
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int N = 1_000_000;   // change to 1_000 / 10_000 / 1_000_000
        int[] data = new int[N];
        Random rand = new Random();

        for (int i = 0; i < N; i++)
            data[i] = rand.nextInt(N);

        int target = data[N - 1]; // worst-case for linear search

        // Linear Search Time
        long startLinear = System.nanoTime();
        linearSearch(data, target);
        long endLinear = System.nanoTime();

        // Binary Search (sort first)
        Arrays.sort(data);
        long startBinary = System.nanoTime();
        binarySearch(data, target);
        long endBinary = System.nanoTime();

        System.out.println("Dataset Size: " + N);
        System.out.println("Linear Search Time (ms): " +
                (endLinear - startLinear) / 1_000_000);
        System.out.println("Binary Search Time (ms): " +
                (endBinary - startBinary) / 1_000_000);
    }
}
