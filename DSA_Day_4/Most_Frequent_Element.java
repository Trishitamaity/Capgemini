package DSA_Day_4;
import java.util.*;

public class Most_Frequent_Element {
	public static List<Integer> most_frequent_element(int[] arr, int k){
		HashMap<Integer, Integer> frequency = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			frequency.put(arr[i], frequency.getOrDefault(arr[i], 0) + 1);
		}
		 PriorityQueue<Integer> queue = new PriorityQueue<>((Integer a, Integer b) -> frequency.get(a) - frequency.get(b));
		 Set<Integer> key = frequency.keySet();
		 for(Integer element : key) {
			 queue.add(element);
			 if(queue.size() > k) {
				 queue.poll();
			 }
		 }
		 return new ArrayList<>(queue);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 2, 4, 2, 2, 1, 2, 1, 4, 1, 4, 6, 4};
		System.out.println(most_frequent_element(arr, 3));
	}
}