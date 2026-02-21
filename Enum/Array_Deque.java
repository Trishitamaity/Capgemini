package Enum;
import java.util.Deque;
import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
    	ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.offerFirst(5);
        dq.addLast(20);
        dq.offerLast(25);
        System.out.println("Deque after insertion: " + dq);
        System.out.println("Front element (getFirst): " + dq.getFirst());
        System.out.println("Front element (peekFirst): " + dq.peekFirst());
        System.out.println("Rear element (getLast): " + dq.getLast());
        System.out.println("Rear element (peekLast): " + dq.peekLast());
        System.out.println("Removed front (removeFirst): " + dq.removeFirst());
        System.out.println("Removed front (pollFirst): " + dq.pollFirst());
        System.out.println("Removed rear (removeLast): " + dq.removeLast());
        System.out.println("Removed rear (pollLast): " + dq.pollLast());
        System.out.println("Final Deque: " + dq);
    }
}