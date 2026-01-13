package Day_2_Assignment;

public class Happy_Number {
	public static boolean Happy_Number_Check(int num) {
	    int sum;
	    while (num != 1 && num != 4) {
	        sum = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit * digit;
	            num = num / 10;
	        }
	        num = sum;
	    }
	    return num == 1;
	}
	public static void main(String[] args) {
		int number = 13;
		if(Happy_Number_Check(number) == true) {
			System.out.println("It's a happy number");
		}else {
			System.out.println("It's not a happy number");
		}
	}
}
