package DSA_Day_2;
import java.util.Deque;
import java.util.ArrayDeque;

public class Stack_Using_Deque {
    Deque<Integer> stack = new ArrayDeque<>();
    public void push(int x) {
        stack.push(x);
        System.out.println(x + " pushed into stack");
    }
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.pop();
    }
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.peek();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Stack_Using_Deque s = new Stack_Using_Deque();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Top element after pop: " + s.peek());
    }
}