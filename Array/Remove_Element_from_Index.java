package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_Element_from_Index {
	public static int[] remove_element(int[] arr, int index) {
		int j = 0;
		int[] b = new int[arr.length - 1];
		for(int i = 0; i < index; i++) {
			b[j] = arr[i];
			j++;
		}
		for(int k = index + 1; k < arr.length; k++) {
			b[j] = arr[k];
			j++;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] a = new int[sc.nextInt()];
		System.out.println("Enter array elements:");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index need to be removed");
		int index = sc.nextInt();
		int[] new_array = remove_element(a, index);
        System.out.println("After Replacing Element: " + Arrays.toString(new_array));
	}
}