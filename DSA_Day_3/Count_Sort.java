package DSA_Day_3;

public class Count_Sort {
    public static void count_sort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] hash = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < hash.length; i++) {
            while (hash[i] > 0) {
                arr[index++] = i;
                hash[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        count_sort(arr);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}