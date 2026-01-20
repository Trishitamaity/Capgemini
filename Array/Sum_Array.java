package Array;
import java.util.Scanner;

public class Sum_Array {
	public static int sum() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] a = new int[sc.nextInt()];
		System.out.println("Enter the array");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum());
	}
}