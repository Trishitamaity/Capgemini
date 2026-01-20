package Array;
import java.util.Scanner;

public class Merge_Array {
	public static void pattern(int[] arr1, int[] arr2) {
		int j = 0;
		int k = 0;
		int[] b = new int[arr1.length + arr2.length];
		for(int i = 0; i < arr1.length + arr2.length;) {
			if(j < arr1.length && k < arr2.length) {
				if(arr1[j] < arr2[k]) {
					b[i] = arr1[j];
					i++; j++;
				}else {
					b[i] = arr2[k];
					i++; k++;
				}
			}else if(j == arr1.length) {
				b[i] = arr2[k];
				i++; k++;
			}else {
				b[i] = arr1[j];
				i++; j++;
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
		System.out.println("Enter array elements:");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the size of the array");
		int[] b = new int[sc.nextInt()];
		System.out.println("Enter array elements:");
		for(int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		pattern(a, b);
	}
}