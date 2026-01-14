package Day_4_Assignment;

public class Account {
	private int id;
	private double balance;
	private String password;
	public Account() {
	}
	public Account(int id, double balance, String password) {
		this.id = id;
		this.balance = balance;
		this.password = password;
	}
	public double getBalance(String password) {
		if(this.password == password) {
			return balance;
		}else {
			System.out.println("Password do not match");
			return 0;
		}
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		if(this.balance > 0) {
			this.balance = balance;
		}
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void main(String[] args) {
		Account a1 = new Account(213, 64364, "user@1234");
		double p = a1.getBalance("user@1234");
		System.out.println(p);
	}
}
