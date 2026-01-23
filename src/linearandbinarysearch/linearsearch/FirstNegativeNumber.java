package linearandbinarysearch.linearsearch;

public class FirstNegativeNumber {

    static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, -4, 9, -2};

        int index = findFirstNegative(arr);
        System.out.println("First Negative Index: " + index);
    }
}
