package DSA_Day_1;
import java.util.Arrays;
import java.util.Scanner;

public class Two_Dimensional_Array {
	public static void Two_dimensional_Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int column = sc.nextInt();
		int[][] arr = new int[row][column];
		System.out.println("Enter the elements: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr1 = {
				{1, 2}, {3, 4, 5, 6, 7, 8, 9}, {12, 23, 45, 67, 89}
		};
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		Two_dimensional_Array();
	}
}