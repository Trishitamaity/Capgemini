package Capgemini;

public class Biggest_Number_Finding {
	public static void main(String[] args) {
		int a =10 , b = 20, c = 30;
		if(a < b) {
			System.out.println("Biggest number is: " + b);
		}else {
			System.out.println("Biggest number is: " + a);
		}
		if(a > b && a > c) {
			System.out.println("Biggest number is: " + a);
		}else {
			if(b > c) {
				System.out.println("Biggest number is: " + b);
			}else {
				System.out.println("Biggest number is: " + c);
			}
		}
		int d = 34, e = 45, f = 56, g = 67;
		int big = d;
		if(e > big) {
			big = e;
		}
		if(f > big) {
			big = f;
		}
		if(g > big) {
			big = g;
		}
		System.out.println("Biggest number is: " + big);
	}
}
