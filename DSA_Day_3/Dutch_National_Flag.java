package DSA_Day_3;

public class Dutch_National_Flag {
    public static void main(String[] args) {
        int[] arr = {2, 2, 0, 0, 1, 0, 0, 1, 2};
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        while (mid <= end) {
            if (arr[mid] == 0) {
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else {
                int temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}