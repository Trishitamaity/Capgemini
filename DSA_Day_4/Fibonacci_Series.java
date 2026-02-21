package DSA_Day_4;
import java.util.Scanner;

public class Fibonacci_Series {
	public static long fibonacci_number(int number) {
		long first = 0;
		long second = 1;
		long result = 0;
		if(number == 0) {
			return 0;
		}
		if(number == 1) {
			return 1;
		}
		for(int i = 2; i <= number; i++) {
			result = first + second;
			first = second;
			second = result;
		}
		return result;
	}
	public static long fibonacci(int number) {
		if(number <= 1) {
			return number;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		System.out.println("Iterative Fibonacci: " + fibonacci_number(number));
        System.out.println("Recursive Fibonacci: " + fibonacci(number));
	}
}