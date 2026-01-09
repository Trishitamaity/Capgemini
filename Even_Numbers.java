package Capgemini;

public class Even_Numbers {
	public static void main(String[] args) {
		int result = 0;
		System.out.println("All the even numbers are: ");
		while(result <= 30) {
			System.out.println(result);
			result = result + 2;
		}
		while(result >= 0) {
			if(result % 2 == 0) {
				System.out.println(result);
			}
			result--;
		}
	}
}