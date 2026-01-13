package Day_2_Assignment;

public class Armstrong_Number {
	public static int digits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
	}
	public static int power(int a, int b) {
		int pow = 1;
		while(b > 0) {
			pow = pow * a;
			b--;
		}
		return pow;
	}
	public static void main(String[] args) {
		int number = 153;
		int pow = digits(number);
		int rem = 0, result = 0, n = number;
		while(number != 0) {
			rem = number % 10;
			result = result + power(rem, pow);
			number = number / 10;
		}
		if(n == result) {
			System.out.println("It's an armstrong number");
		}else {
			System.out.println("It's not an armstrong number");
		}
	}
}
