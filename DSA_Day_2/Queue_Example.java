package DSA_Day_2;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_Example {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue);
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}