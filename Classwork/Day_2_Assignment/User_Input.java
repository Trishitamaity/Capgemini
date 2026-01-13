package Day_2_Assignment;
import java.util.Scanner;

public class User_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Your name is: " + name);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Your age is: " + age);
		System.out.println("Enter phone number: ");
		long num = sc.nextLong();
		System.out.println("Your phone number is: " + num);
		System.out.println("Enter e-mail: ");
		sc.nextLine();
		String mail = sc.nextLine();
		System.out.println("Your e-mail is: " + mail);
		System.out.println("Enter weight: ");
		float weight = sc.nextFloat();
		System.out.println("Your weight is: " + weight);
		System.out.println("Enter gender: ");
		char gender = sc.next().charAt(0);
		System.out.println("Your gender is: " + gender);
		System.out.println("Enter marriage status: ");
		boolean status = sc.nextBoolean();
		System.out.println("Your marriage status is: " + status);
		sc.close();
	}
}