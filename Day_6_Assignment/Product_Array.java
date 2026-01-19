package Day_6_Assignment;
import java.util.Scanner;

public class Product_Array {
	public static int sum() {
		int product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] a = new int[sc.nextInt()];
		System.out.println("Enter the array");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			product = product * a[i];
		}
		return product;
	}
	public static void main(String[] args) {
		System.out.println(sum());
	}
}