package com;
import org.MyAPI;
public class Customer_Details {
	private int id;
	private String name;
	private long mobile_no;
	private String email;
	public void valid_mobile_number(long mobile_no) {
		MyAPI api = new MyAPI();
		int length = api.find_length_of_number(mobile_no);
		if(length == 10) {
			System.out.println("Valid mobile number");
			this.mobile_no = mobile_no;
		}else {
			System.out.println("Invalid mobile number");
		}
	}
	public void valid_email(String email) {
		MyAPI api = new MyAPI();
		boolean valid = api.find_valid_email(email);
		if(valid == true) {
			System.out.println("Valid email");
		}else {
			System.out.println("Invalid email");
		}
	}
	public static void main(String[] args) {
		Customer_Details customer = new Customer_Details();
		customer.valid_mobile_number(9876543210l);
		customer.valid_email("trishita22@gmail.com");
	}
}