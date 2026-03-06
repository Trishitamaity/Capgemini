package org;

public class MyAPI {
	public int find_length_of_number(long number) {
		int length = 0;
		while(number != 0) {
			length++;
			number = number / 10;
		}
		return length;
	}
	public boolean find_valid_email(String email) {
		if(email.contains("@gmail.com")) {
			return true;
		}else {
			return false;
		}	
	}
	public static void main(String[] args) {
		MyAPI api = new MyAPI();
		System.out.print("Length : ");
		System.out.println(api.find_length_of_number(1234567890));
		System.out.println(api.find_valid_email("trishita22@gmail.com"));
	}
}