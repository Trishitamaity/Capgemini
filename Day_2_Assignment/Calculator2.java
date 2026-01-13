package Day_2_Assignment;

public class Calculator2 {
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	public static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}
	public static int sub(int a, int b) {
		int result = a - b;
		return result;
	}
	public static void main(String[] args) {
		switch('*') {
		case '+': {
			System.out.println(add(20, 10));
		}
		break;
		case '-': {
			System.out.println(sub(20, 10));
		}
		break;
		case '*': {
			System.out.println(multiply(20, 10));
		}
		break;
		case '/': {
			System.out.println(divide(20, 10));
		}
		break;
		default: {
			System.out.println("No match found");
		}
		}
	}
}