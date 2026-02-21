package DSA_Day_1;

public class Reverse_Array {
	public static void reverse() {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int i = 0;
		int j = arr1.length - 1;
		while(i <= j) {
			int temp = arr1[i];
			arr1[i++] = arr1[j];
			arr1[j--] = temp;
		}
		System.out.println("The elements of the array are: ");
		for(int k = 0; k < arr1.length; k++) {
			System.out.println(arr1[k]);
		}
	}
	public static void reverse_array() {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr2 = new int[arr1.length];
		int j = 0;
		for(int i = arr1.length - 1; i >= 0; i--) {
			arr2[j++] = arr1[i];
		}
		System.out.println("The elements of the array are: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("The elements of the array are: ");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		reverse_array();
		reverse();
	}
}