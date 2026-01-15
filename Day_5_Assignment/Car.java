package Day_5_Assignment;

public class Car extends Vehicle {
	String brand;
    double price;
    public Car() {
	}
    public Car(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public Car(String colour, String brand, double price) {
		this.colour = colour;
		this.brand = brand;
		this.price = price;
	}
    public void displayCar() {
        display_colour();
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Price: " + price);
    }
    public static void main(String[] args) {
    	Vehicle v1 = new Vehicle("White");
    	v1.display_colour();
    	Car c1 = new Car("Black", "Honda", 800000);
        c1.displayCar();
	}
}