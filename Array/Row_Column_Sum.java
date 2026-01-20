package Array;

import java.util.Scanner;

public class Row_Column_Sum {
    public static int[] RowWiseSum(int[][] arr) {
        int[] rowSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            rowSum[i] = sum;
        }
        return rowSum;
    }
    public static int[] ColumnWiseSum(int[][] arr) {
        int cols = arr[0].length;
        int[] colSum = new int[cols];
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            colSum[j] = sum;
        }
        return colSum;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the no of rows");
        int r1 = sc.nextInt();
        System.out.println("Enter the no of columns");
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        System.out.println("Enter the matrix");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                arr[i][j] = sc.nextInt();
        int[] rowResult = RowWiseSum(arr);
        int[] colResult = ColumnWiseSum(arr);
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < rowResult.length; i++) {
            System.out.println(rowResult[i]);
        }
        System.out.println("Column-wise Sum:");
        for (int i = 0; i < colResult.length; i++) {
            System.out.println(colResult[i]);
        }
    }
}