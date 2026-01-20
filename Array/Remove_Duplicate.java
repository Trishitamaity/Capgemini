package Array;
import java.util.Scanner;

public class Remove_Duplicate {
    public static void remove_duplicate(int[] arr) {
        int j = 0;
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    arr[k] = Integer.MIN_VALUE;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                b[j++] = arr[i];
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(b[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int[] a = new int[sc.nextInt()];
        System.out.println("Enter array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        remove_duplicate(a);
    }
}