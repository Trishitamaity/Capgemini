package Array;
import java.util.Scanner;

public class Sum_of_Digits {
	public static void Sum_of_Digits(int[] arr) {
		int j = 0;
		int[] b = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 10) {
				b[j] = arr[i];
				j++;
			}else {
				int result = 0;
				int digit = 0;
				while(arr[i] > 0) {
					digit = arr[i] % 10;
					result = result + digit;
					arr[i] = arr[i] / 10;
				}
				b[j] = result;
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
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Sum_of_Digits(a);
	}
}