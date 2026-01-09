package Capgemini;

public class Prime_Number_Checking {
	public static void main(String[] args) {
		int number = 30, count = 0;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("It's a prime number");
		}else {
			System.out.println("Not a prime number");
		}
	}
}
