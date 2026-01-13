package Classwork;

public class Program {
	public static void palindrome(int a) {
		int original = a;
        int reverse = 0;
        while (a != 0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a / 10;
        }
        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is not a Palindrome Number");
        }
	}
	public static void prime(int a) {
		int number = a, count = 0;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}
	}
}