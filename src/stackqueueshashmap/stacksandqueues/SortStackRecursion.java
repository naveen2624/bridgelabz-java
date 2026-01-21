package stackqueueshashmap.stacksandqueues;

import java.util.Stack;

class SortStackRecursion {

    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack, temp);
        }
    }

    static void insertSorted(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        insertSorted(stack, x);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(10);
        s.push(20);

        sortStack(s);

        while (!s.isEmpty())
            System.out.println(s.pop());
    }
}
