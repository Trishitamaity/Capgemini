package DSA_Day_4;

public class Recursion_Example {
	public static void recursion_example(int[] arr, int index) {
		if(index == arr.length) {
			return;
		}
		System.out.print(arr[index] + " ");
        recursion_example(arr, index + 1);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		recursion_example(arr, 0);
	}
}