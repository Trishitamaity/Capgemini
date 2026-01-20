package Array;
import java.util.Scanner;

public class Print_Array {
	static void Int_Array(int[] a) {
        System.out.println("Integer Array Elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    static void Float_Array(float[] a) {
        System.out.println("Float Array Elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Choose array type:");
        System.out.println("1. Integer Array");
        System.out.println("2. Float Array");
    	Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter size of int array:");
                int[] intArr = new int[sc.nextInt()];
                System.out.println("Enter elements:");
                for (int i = 0; i < intArr.length; i++) {
                    intArr[i] = sc.nextInt();
                }
                Int_Array(intArr);
                break;
            case 2:
                System.out.println("Enter size of float array:");
                float[] floatArr = new float[sc.nextInt()];
                System.out.println("Enter elements:");
                for (int i = 0; i < floatArr.length; i++) {
                    floatArr[i] = sc.nextFloat();
                }
                Float_Array(floatArr);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}