package Day_4_Assignment;

public class Vehicle {
	String brand;
	String colour;
	double price;
	public Vehicle() {
	}
	public void Print_Vehicle() {
		System.out.println(brand);
		System.out.println(colour);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Bike b = new Bike("BMW", "Black", 1500000);
		b.Print_Vehicle();
		Vehicle v = new Vehicle();
		v.brand = "Honda";
		v.colour = "Red";
		v.price = 45000;
		v.Print_Vehicle();
	}
}
class Bike extends Vehicle{
	public Bike(String brand, String colour, double price){
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}
}