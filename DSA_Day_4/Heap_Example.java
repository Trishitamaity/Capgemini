package DSA_Day_4;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
 
public class Heap_Example {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.offer(1);
		q.offer(6);
		q.offer(8);
		q.offer(9);
		q.offer(2);
		q.offer(0);
		System.out.println(q);
		List<Integer> list = new ArrayList<>(q.size());
		while(!q.isEmpty())
		{
			list.add(q.poll());	
		}
		System.out.println(list);
	}
}
@java.lang.FunctionalInterface
interface FunctionalInterface
{
	void add();
	boolean equals(Object o);	
}