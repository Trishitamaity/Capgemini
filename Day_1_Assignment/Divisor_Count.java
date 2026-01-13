package Capgemini;

public class Divisor_Count {
	public static void main(String[] args) {
		int number = 30, count = 0;
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
