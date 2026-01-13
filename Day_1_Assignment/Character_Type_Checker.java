package Capgemini;

public class Character_Type_Checker {
	public static void main(String[] args) {
		char c = '@';
		if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			System.out.println("Alphabet");
		}else if(c >= '0' && c <= '9') {
			System.out.println("Digit");
		}else {
			System.out.println("Special Character");
		}
	}
}