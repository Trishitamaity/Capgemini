package Exception;

public class Throws {
	public static void m1() throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException, ClassNotFoundException {
		System.out.println("Hii");
			Class.forName("Array.Even_Odd");
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		try {
			m1();
		}catch(ClassNotFoundException e) {
			System.out.println("Exception handled");
		}
	}
}