package Capgemini;

public class Class_Assign {
	public static void main(String[] args) {
		String day = "Monday";
		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday": {
			System.out.println("English");
		}
		break;
		case "Thursday":
		case "Saturday": {
			System.out.println("Java");
		}
		break;
		case "Friday": {
			System.out.println("SQL");
		}
		break;
		default: {
			System.out.println("It's sunday, take a break");
		}
		}
	}

}