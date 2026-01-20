package Array;
import java.util.Scanner;

public class Zig_Zag_Pattern {
	public static void pattern(int[] arr1, int[] arr2) {
		int j = 0;
		int k = 0;
		int[] b = new int[arr1.length + arr2.length];
		for(int i = 0; i < arr1.length + arr2.length; i++) {
			if(j < arr1.length) {
				b[i] = arr1[j];
				i++; j++;
			}
			if(k < arr2.length) {
				b[i] = arr2[k];
				k++;
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
		System.out.println("Enter the size of the array");
		int[] b = new int[sc.nextInt()];
		System.out.println("Enter the array");
		for(int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		pattern(a, b);
	}
}