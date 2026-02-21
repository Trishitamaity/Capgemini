package DSA_Day_3;
import java.util.Scanner;

public class Linear_Search {
	public static int Found_index(int[] arr, int element) {
		for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == element) {
        		return i;
        	}
        }
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.print("Enter element to search: ");
        int element = sc.nextInt();
        int answer = Found_index(arr, element);
        if(answer > 0) {
        	System.out.println("Element found at: " + answer);
        }else {
        	System.out.println("Element not found");
        }
	}
}