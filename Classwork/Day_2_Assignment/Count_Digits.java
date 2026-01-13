package Day_2_Assignment;

public class Count_Digits {
	public static int digits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
	}
	public static void main(String[] args) {
		System.out.print("Number of digits: ");
		System.out.println(digits(2531));
	}
}
