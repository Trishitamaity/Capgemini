package Capgemini;

public class Conditional_Operator {
	public static void main(String[] args) {
		int n = 5;
		String res = (n % 2 == 0) ? "Even" : "Odd";
		System.out.println(res);
		int a = 3, b = 5, c = 7, d = 10;
		int big1 = (a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println(big1);
		int big2 = (a > b && a > c && a > d) ? a : (b > c && b > d) ? b : (c > d) ? c : d;
		System.out.println(big2);
		int big3 = (a > b) ? a : b;
		big3 = (big3 > c) ? big3 : c;
		big3 = (big3 > d) ? big3 : d;
		System.out.println(big3);
	}
}
