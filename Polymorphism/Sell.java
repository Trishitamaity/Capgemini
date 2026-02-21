package Polymorphism;

public class Sell {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 6, 7, 3, 5, 2, 4};
		int j = 0;
		int k = arr.length - 1;
		int count_small = 0;
		int max = arr[arr.length - 1];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < max) {
				count_small++;
			}
		}
		while(j < count_small) {
			if(arr[j] < max) {
				j++;
			}else {
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				k--;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == max) {
				int temp = arr[count_small];
				arr[count_small] = arr[i];
				arr[i] = temp;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}