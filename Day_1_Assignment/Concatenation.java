package Capgemini;

public class Concatenation {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String result = s1 + " " + s2;
		System.out.println(result);

		int a1 = 10;
		String s3 = "Value: " + a1;
		System.out.println(s3);

		int x = 5;
		String s4 = x + " is a number";
		System.out.println(s4);

		int a2 = 10, b2 = 20;
		String s5 = "Sum = " + a2 + b2;
		System.out.println(s5);

		int a3 = 10, b3 = 20;
		String s = "Sum = " + (a3 + b3);
		System.out.println(s);

		char c = 'A';
		String s6 = c + " Grade";
		System.out.println(s6);
	}
}