package Day_2_Assignment;

public class Disarium_Number {
	public static boolean Check_Disarium_Number(int num) {
	    int original = num;
	    num = (num < 0) ? -num : num;
	    int count = 0;
	    int temp = num;
	    while (temp > 0) {
	        count++;
	        temp = temp / 10;
	    }
	    int sum = 0;
	    temp = num;
	    while (temp > 0) {
	        int digit = temp % 10;
	        sum += power(digit, count);
	        count--;
	        temp = temp / 10;
	    }
	    return sum == original;
	}
	public static int power(int base, int exp) {
	    int result = 1;
	    for (int i = 1; i <= exp; i++) {
	        result = result * base;
	    }
	    return result;
	}
	public static void main(String[] args) {
		int number = 135;
		if(Check_Disarium_Number(number) == true) {
			System.out.println("It's a disarium number");
		}else {
			System.out.println("It's not a disarium number");
		}
	}
}