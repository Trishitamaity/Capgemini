package DSA_Day_3;
import java.util.ArrayList;

public class Arraylist_Binary_Search {
	public static int binarysearch(ArrayList<Integer> list, int target) {
	    int low = 0;
	    int high = list.size() - 1;
	    while (low <= high) {
	        int mid = low + (high - low) / 2;
	        if (list.get(mid) == target) {
	            return mid;
	        } 
	        else if (list.get(mid) < target) {
	            low = mid + 1;
	        } 
	        else {
	            high = mid - 1;
	        }
	    }
	    return -1;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int index = binarysearch(list, 30);
		if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
	}
}