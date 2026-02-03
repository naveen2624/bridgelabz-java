package collections.listinterface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ReverseAString {
    public static void reverseArrayList(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }
    public static void reverse(LinkedList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    public static void ArrayListImp(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        reverseArrayList(list);
        System.out.println("Array List");
        System.out.println(list);
    }
    public static void LinkedListImp(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Linked List");
        reverse(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayListImp();
        LinkedListImp();
    }
}
