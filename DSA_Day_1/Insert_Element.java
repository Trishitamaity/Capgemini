package DSA_Day_1;
import java.util.Scanner;

public class Insert_Element {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int n = 5;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position");
            return;
        }
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = element;
        n++;
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}