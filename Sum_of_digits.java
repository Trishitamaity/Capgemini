package Capgemini;

public class Sum_of_digits {
	public static void main(String[] args) {
		int n = 123;
		int result = 0;
		int digit = 0;
		while(n > 0) {
			digit = n % 10;
			result = result + digit;
			n = n / 10;
		}
		System.out.println("Sum of digits: " + result);
	}
}
