package sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n= arr.length;
        for (int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void displayArray(int[] array){
        int n= array.length;
        for (int id : array) {
            System.out.print(id + " ");
        }
    }
    public static void main(String[] args){
        int[] arr={54,65,47,87,32,14,52};
        System.out.println("Unsorted Array");
        displayArray(arr);
        insertionSort(arr);
        System.out.println("\nSorted Array");
        displayArray(arr);
    }
}
