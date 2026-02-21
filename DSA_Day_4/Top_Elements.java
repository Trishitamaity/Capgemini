package DSA_Day_4;
import java.util.*;

public class Top_Elements{
	public static List<Integer> top_elements(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<Integer> result = new ArrayList<>(minHeap);
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
	public static List<Integer> top_k_max(int[] arr, int k) {
        Arrays.sort(arr);
        List<Integer> result = new ArrayList<>();
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            result.add(arr[i]);
        }
        return result;
    }
	public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        System.out.println(top_elements(arr, k));
        System.out.println(top_k_max(arr, k));
    }
}