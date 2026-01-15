package Day_5_Assignment;

public class Bike extends Vehicle {
	String brand;
    double price;
    public Bike() {
	}
    public Bike(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public Bike(String colour, String brand, double price) {
		this.colour = colour;
		this.brand = brand;
		this.price = price;
	}
    public void displayBike() {
        display_colour();
        System.out.println("Bike Brand: " + brand);
        System.out.println("Bike Price: " + price);
    }
    public static void main(String[] args) {
    	Vehicle v1 = new Vehicle("White");
    	v1.display_colour();
    	Bike b1 = new Bike("Red", "Yamaha", 120000);
        b1.displayBike();
	}
}