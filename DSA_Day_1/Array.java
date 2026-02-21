package DSA_Day_1;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr2 = new int[4];
		arr2[0] = 23;
		arr2[1] = 32;
		arr2[2] = 23;
		arr2[3] = 32;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for(int element: arr2) {
			System.out.println(element);
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}