package DSA_Day_3;

public class Peak_Element {
	public static int peak_element(int[] arr) {
		int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
            	high = mid;
            } else {
            	low = mid + 1;
            }
        }
        return arr[low];
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 8, 6, 3, 0};
		int peak = peak_element(arr);
		System.out.println("Peak is: " + peak);
	}
}