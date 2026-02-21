package DSA_Day_3;

public class Wave_Array {
	public static void wave_print(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			if(i % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		wave_print(arr);
		System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}