package Exception;

public class Exception_Handling {
	public static void main(String[] args) {
		System.out.println("Hiiii");
		try {
			System.out.println(7/0);
		}catch(ArithmeticException e) {
			System.out.println("Not divisible");
		}
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println("Sleep method called");
		}
		try {
			Class.forName("Array.Even_Odd");
		}catch(ClassNotFoundException e) {
			System.out.println("Class information is wrong");
		}
		System.out.println("Bye");
	}
}