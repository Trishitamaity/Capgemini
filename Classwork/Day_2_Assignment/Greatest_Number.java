package Day_2_Assignment;

public class Greatest_Number {
	public static void greatest(int a, int b, int c) {
		if(a > b && a > c) {
			System.out.println("The greatest number is: " +a);
		}else if(b > c) {
			System.out.println("The greatest number is: " +b);
		}else {
			System.out.println("The greatest number is: " +c);
		}
	}
	public static void greatest1(int a, int b, int c) {
		int great = (a > b) ? a : b;
		great = (great > c) ? great : c;
		System.out.println("The greatest number is: " +great);
	}
	public static void main(String[] args) {
		greatest(10, 20, 30);
		greatest1(40, 50, 60);
	}
}
