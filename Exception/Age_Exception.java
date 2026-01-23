package Exception;
import java.util.Scanner;

public class Age_Exception extends RuntimeException {
	public Age_Exception(String message) {
		super(message);
	}
	public static void Check_age(int age) {
        if(age > 10) {
        	System.err.println("Age is valid");
        }else {
        	throw new Age_Exception(age + " is invalid");
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        try {
        	Check_age(age);
        }catch(Age_Exception e) {
        	System.err.println("Age exception is handled");
        }
	}
}