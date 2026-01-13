package Day_2_Assignment;

public class Check_Power {
	public static int power(int a, int b) {
		int pow = 1;
		while(b > 0) {
			pow = pow * a;
			b--;
		}
		return pow;
	}
	public static void main(String[] args) {
		System.out.println(power(2, 4));
	}
}
