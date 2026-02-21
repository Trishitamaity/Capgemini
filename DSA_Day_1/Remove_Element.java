package DSA_Day_1;
import java.util.Arrays;

public class Remove_Element {
	public static void Remove_duplicate(int element) {
		int[][] arr = {
				{1, 2}, {3, 4, 5, 6, 7, 8, 9}, {12, 23, 45, 67, 89}
		};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == element) {
					arr[i][j] = Integer.MIN_VALUE;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] != Integer.MIN_VALUE) {
					System.out.println(arr[i][j] + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int element = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		for(int a : arr) {
			if(a != Integer.MIN_VALUE) {
				System.out.println(a + " ");
			}
		}
		Remove_duplicate(element);
	}
}