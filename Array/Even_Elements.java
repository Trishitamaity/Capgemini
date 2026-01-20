package Array;
import java.util.Scanner;

public class Even_Elements {
	public static void even(int[] arr) {
		int even_sum = 0;
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even_sum++;
			}
		}
		int[] b = new int[even_sum];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				b[j] = arr[i];
				j++;
			}
		}
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] a = new int[sc.nextInt()];
		System.out.println("Enter the array");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		even(a);
	}
}