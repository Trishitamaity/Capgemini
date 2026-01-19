package Day_6_Assignment;

public abstract class Bank {
	public abstract void get_interest();
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.get_interest();
		HDFC hdfc = new HDFC();
		hdfc.get_interest();
		Bank b1 = new SBI();
		b1.get_interest();
		Bank b2 = new HDFC();
		b2.get_interest();
	}
}
class SBI extends Bank{
	public void get_interest() {
		System.out.println("SBI interest rate");
	}
}
class HDFC extends Bank{
	public void get_interest() {
		System.out.println("HDFC interest rate");
	}
}