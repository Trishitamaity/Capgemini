package Day_3_Assignment;

public class Laptop {
	String brand;
	double price;
	public Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public String comparePrice(Laptop l) {
		return (this.price > l.price) ? "Price bigger is " + this.price : "Price bigger is " + l.price;
	}
	public static void main(String[] args) {
		Laptop l = new Laptop("HP", 24000);
		Laptop l1 = new Laptop("DELL", 32000);
		String ans = l.comparePrice(l1);
		System.out.println(ans);
	}
}