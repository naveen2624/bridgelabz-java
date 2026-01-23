package sorting;

public class BubbleSort {
    static void bubbleSort(int[] marks){
        int n=marks.length;
        boolean swapped;
        for (int i=0;i<n-1;i++){
            swapped = false;
            for (int j=0;j<n-i-1;j++){
                if (marks[j]>marks[j+1]){
                    int temp = marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
    static void display(int[] arr){
        for (int m:arr){
            System.out.print(m+" ");
        }
    }
    public static void main(String[] args){
        int[] studentMarks = {78, 45, 90, 60, 88, 72};

        System.out.println("Before Sorting:");
        display(studentMarks);

        bubbleSort(studentMarks);

        System.out.println("\nAfter Sorting (Ascending Order):");
        display(studentMarks);
    }
}
