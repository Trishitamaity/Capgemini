package Day_4_Assignment;

public class Laptop {
	String brand;
	double price;
	public Laptop() {
	}
	public Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public String comparePrice(Laptop l) {
		return (this.price > l.price) ? "Price bigger is " + this.price : "Price bigger is " + l.price;
	}
	public static void main(String[] args) {
		Laptop l = HelpLaptop.getLaptop("HP", 45000.0);
		Laptop l1 = HelpLaptop.getLaptop("Apple", 100000.0);
		String ans = l.comparePrice(l1);
		System.out.println(ans);
		Laptop l2 = HelpLaptop.VerifyPrice("Lenovo", 400000.0);
	}
}