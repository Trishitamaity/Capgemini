package Array;
import java.util.Scanner;

public class Reverse_Array {
	public static void reverse_array(int[] arr) {
		int j = 0;
		int[] b = new int[arr.length];
		for(int i = arr.length - 1; i >= 0; i--) {
			b[j] = arr[i];
			j++;
		}
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] a = new int[sc.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		reverse_array(a);
	}
}