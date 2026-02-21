package DSA_Day_1;
import java.util.Arrays;

public class Smallest_Element {
	public static void Smallest_element(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("The smallest element is: " + min);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("The smallest element is: " + min);
		Smallest_element(arr);
	}
}