package Array;
import java.util.Scanner;
import java.util.Arrays;

public class Replace_Element {
	public static int[] replace_element(int[] arr, int element, int index) {
		for(int i = 0; i < arr.length; i++) {
			if(i == index) {
				arr[i] = element;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] a = new int[sc.nextInt()];
		System.out.println("Enter array elements:");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index need to be replaced");
		int index = sc.nextInt();
		System.out.println("Enter the new element");
		int element = sc.nextInt();
		int[] replaced = replace_element(a, element, index);
        System.out.println("After Replacing Element: " + Arrays.toString(replaced));
	}
}