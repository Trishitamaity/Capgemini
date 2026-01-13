package Day_2_Assignment;

public class Even_Odd {
	public static boolean Even_Odd_Digits(int num) {
	    int evenCount = 0;
	    int oddCount = 0;
	    while (num > 0) {
	        int digit = num % 10;
	        if (digit % 2 == 0) {
	            evenCount++;
	        } else {
	            oddCount++;
	        }
	        num = num / 10;
	    }
	    return evenCount == oddCount;
	}
	public static void main(String[] args) {
		int number = 123456;
		if(Even_Odd_Digits(number) == true) {
			System.out.println("Even and odd digits count are same");
		}else {
			System.out.println("Even and odd digits count are not same");
		}
	}
}
