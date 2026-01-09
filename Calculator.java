package Capgemini;

public class Calculator {
	public static void main(String[] args) {
		int a = 10, b = 20;
		switch('*') {
		case '+': {
			int c = a + b;
			System.out.println(c);
		}
		break;
		case '-': {
			int c = a - b;
			System.out.println(c);
		}
		break;
		case '*': {
			int c = a * b;
			System.out.println(c);
		}
		break;
		case '/': {
			int c = a / b;
			System.out.println(c);
		}
		break;
		default: {
			System.out.println("No match found");
		}
		}
	}

}
