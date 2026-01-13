package Day_2_Assignment;

public class Palindrome {
	public static String Check_Palindrome(int num) {
	    int original = num;
	    int reverse = 0;
	    while (num > 0) {
	        int digit = num % 10;
	        reverse = reverse * 10 + digit;
	        num = num / 10;
	    }
	    if (reverse == original) {
	        return "good";
	    } else {
	        return "bad";
	    }
	}
	public static void main(String[] args) {
		int number = 1234321;
		if(Check_Palindrome(number) == "good") {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}
}