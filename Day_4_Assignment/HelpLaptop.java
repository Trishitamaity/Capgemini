package Day_4_Assignment;

public class HelpLaptop {
	public static Laptop getLaptop() {
		return new Laptop();
	}
	public static Laptop getLaptop(String brand, double price) {
		return new Laptop(brand, price);
	}
	public static Laptop VerifyPrice(String brand, double price) {
		if(price < 500000 && price > 100000) {
			System.out.println("Object created");
			return new Laptop(brand, price);
		}else {
			System.out.println("Price is invalid");
			return null;
		}
	}
}