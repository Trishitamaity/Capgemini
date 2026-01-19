package Array;
import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		int even_sum = 0;
		int odd_sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] a = new int[sc.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				even_sum = even_sum + a[i];
			}else {
				odd_sum = odd_sum + a[i];
			}
		}
		System.out.println("The even sum is " + even_sum);
		System.out.println("The odd sum is " + odd_sum);
	}
}