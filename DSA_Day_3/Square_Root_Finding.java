package DSA_Day_3;
import java.util.Scanner;

public class Square_Root_Finding {
	public static long Square_root(long number) {
		long square_root = 0;
		if(number < 0) {
			return -1;
		}
		if(number == 0 || number == 1) {
			return number;
		}
		for(int i = 1; i <= number/2; i++) {
			if(i * i <= number) {
				square_root = i;
			}else {
				break;
			}
		}
		return square_root;
	}
	public static long binary_search(long number) {
		if(number < 0) {
			return -1;
		}
		if(number == 0 || number == 1) {
			return number;
		}
	    long low = 1, high = number / 2, ans = 0;
	    while (low <= high) {
	        long mid = low + (high - low) / 2;
	        if (mid * mid <= number) {
	            ans = mid;
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		long number = sc.nextLong();
		long square_root = Square_root(number);
		if (square_root != -1) {
            System.out.println("Square root is : " + square_root);
        }
		long answer = binary_search(number);
		System.out.println("Square root is : " + answer);
	}
}