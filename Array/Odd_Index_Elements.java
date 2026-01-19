package Array;
import java.util.Scanner;

public class Odd_Index_Elements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Odd index elements:");
        for (int i = 1; i < n; i += 2)
            System.out.print(arr[i] + " ");
    }
}