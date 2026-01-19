package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Add_Element_in_Index {
	public static int[] add_element(int[] arr, int element, int index) {
		int j = 0;
		int i = 0;
		int[] b = new int[arr.length + 1];
		for(i = 0; i < index; i++) {
			b[j] = arr[i];
			j++;
		}
		if(i == index) {
			b[j] = element;
			j++;
		}
		for(int k = i; k < arr.length; k++) {
			b[j] = arr[k];
			j++;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] a = new int[sc.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index need to be added");
		int index = sc.nextInt();
		System.out.println("Enter the new element");
		int element = sc.nextInt();
		int[] new_array = add_element(a, element, index);
        System.out.println("After Replacing Element: " + Arrays.toString(new_array));
	}
}