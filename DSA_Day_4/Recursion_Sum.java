package DSA_Day_4;

public class Recursion_Sum {
	public static int recursion_sum(int sum) {
		if(sum == 0) {
			return 0;
		}
		if(sum == 1) {
			return 1;
		}
		return sum + recursion_sum(sum - 1);
	}
	public static void main(String[] args) {
		System.out.println(recursion_sum(9));
	}
}