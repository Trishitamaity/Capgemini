package Exception;
import java.util.Scanner;

public class Array_Index_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        try {
        	System.out.println(arr[n + 2]);
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Array index out of bounds exception caught");
        }
        System.out.println("Program continues normally");
	}
}