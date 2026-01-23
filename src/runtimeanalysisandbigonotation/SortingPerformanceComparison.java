package runtimeanalysisandbigonotation;

import java.util.Random;

public class SortingPerformanceComparison {

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2)
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int N = 10_000; // Bubble Sort not feasible for 1,000,000
        Random rand = new Random();

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        int[] arr3 = new int[N];

        for (int i = 0; i < N; i++) {
            int val = rand.nextInt(N);
            arr1[i] = val;
            arr2[i] = val;
            arr3[i] = val;
        }

        long startBubble = System.nanoTime();
        bubbleSort(arr1);
        long endBubble = System.nanoTime();

        long startMerge = System.nanoTime();
        mergeSort(arr2, 0, arr2.length - 1);
        long endMerge = System.nanoTime();

        long startQuick = System.nanoTime();
        quickSort(arr3, 0, arr3.length - 1);
        long endQuick = System.nanoTime();

        System.out.println("Dataset Size: " + N);
        System.out.println("Bubble Sort Time (ms): " +
                (endBubble - startBubble) / 1_000_000);
        System.out.println("Merge Sort Time  (ms): " +
                (endMerge - startMerge) / 1_000_000);
        System.out.println("Quick Sort Time  (ms): " +
                (endQuick - startQuick) / 1_000_000);
    }
}
