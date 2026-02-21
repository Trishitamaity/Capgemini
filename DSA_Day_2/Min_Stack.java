package DSA_Day_2;
import java.util.Stack;

public class Min_Stack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    Min_Stack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }
    int top() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.peek();
    }
    int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return minStack.peek();
    }
    public static void main(String[] args) {
        Min_Stack ms = new Min_Stack();
        ms.push(5);
        ms.push(2);
        ms.push(10);
        ms.push(1);
        System.out.println("Minimum: " + ms.getMin());
        ms.pop();
        System.out.println("Minimum: " + ms.getMin());
    }
}