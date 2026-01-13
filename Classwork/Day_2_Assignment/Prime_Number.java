package Day_2_Assignment;

public class Prime_Number {
	public static boolean isPrime(int n) {
		for(int i =2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		if(isPrime(20)) {
			System.out.println("It's a prime number");
		}else {
			System.out.println("Not a prime number");
		}
		int n = 2;
		for(int i =2; i <= n/2; i++) {
			if(n % i == 0) {
				System.out.println("Not a prime number");
				return;
			}
		}
		System.out.println("It's a prime number");
	}
}
