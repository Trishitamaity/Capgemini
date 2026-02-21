package DSA_Day_3;

public class Bubble_Sort {
	public static void bubble_sort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			boolean flag = false;
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
	            break;
	        }
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 8, 6, 5, 7, 9, 10};
		bubble_sort(arr);
		System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}