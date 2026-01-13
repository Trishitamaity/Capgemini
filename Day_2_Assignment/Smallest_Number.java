package Day_2_Assignment;

public class Smallest_Number {
	public static void smallest(int a, int b, int c) {
		if(a < b && a < c) {
			System.out.println("The smallest number is: " +a);
		}else if(b < c) {
			System.out.println("The smallest number is: " +b);
		}else {
			System.out.println("The smallest number is: " +c);
		}
	}
	public static void smallest1(int a, int b, int c) {
		int small = (a < b) ? a : b;
		small = (small < c) ? small : c;
		System.out.println("The smallest number is: " + small);
	}
	public static void main(String[] args) {
		smallest(10, 20, 30);
		smallest1(40, 50, 60);
	}
}
