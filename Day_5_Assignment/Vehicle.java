package Day_5_Assignment;

public class Vehicle {
	String colour;
	public Vehicle() {
	}
	public Vehicle(String colour) {
		this.colour = colour;
	}
	public void display_colour() {
        System.out.println("Color: " + colour);
    }
}