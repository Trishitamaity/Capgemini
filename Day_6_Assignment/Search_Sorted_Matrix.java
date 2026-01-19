package Day_6_Assignment;
import java.util.Scanner;

public class Search_Sorted_Matrix {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r = sc.nextInt();
        System.out.println("Enter the no of columns");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter the matrix");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter the element need to be searched");
        int key = sc.nextInt();
        int i = 0, j = c - 1;
        boolean found = false;
        while (i < r && j >= 0) {
            if (a[i][j] == key) {
                found = true;
                break;
            } else if (a[i][j] > key)
                j--;
            else
                i++;
        }
        System.out.println(found ? "Element Found" : "Element Not Found");
    }
}