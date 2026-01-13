package Day_2_Assignment;

public class Strong_Number {
	public static boolean Check_Strong_Number(int num) {
	    int original = num;
	    int sum = 0;
	    while (num > 0) {
	        int digit = num % 10;
	        sum += factorial(digit);
	        num = num / 10;
	    }
	    return sum == original;
	}
	private static int factorial(int n) {
	    int fact = 1;
	    for (int i = 1; i <= n; i++) {
	        fact *= i;
	    }
	    return fact;
	}
	public static void main(String[] args) {
		int number = 145;
		if(Check_Strong_Number(number) == true) {
			System.out.println(number + " is a strong number");
		}else {
			System.out.println(number + " is not a strong number");
		}
	}
}