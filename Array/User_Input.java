package Array;
import java.util.Scanner;

public class User_Input {
	public static void Int_Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] a = new int[sc.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void Float_Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		float[] a = new float[sc.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextFloat();
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void Char_Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		char[] a = new char[sc.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void Double_Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		double[] a = new double[sc.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void Boolean_Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		boolean[] a = new boolean[sc.nextInt()];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextBoolean();
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Int_Array();
		Float_Array();
		Char_Array();
		Double_Array();
		Boolean_Array();
	}
}