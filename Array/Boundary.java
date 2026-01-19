package Array;
import java.util.Scanner;

class Boundary {
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
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}