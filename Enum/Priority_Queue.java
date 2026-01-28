package Enum;
import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peek element: " + pq.peek());
        System.out.println("Polled element: " + pq.poll());
        System.out.println("After poll: " + pq);
        pq.remove(30);
        System.out.println("After removing 30: " + pq);
        System.out.println("Size: " + pq.size());
        System.out.println("Is empty? " + pq.isEmpty());
        System.out.println("Contains 20? " + pq.contains(20));
        pq.clear();
        System.out.println("After clear: " + pq);
    }
}