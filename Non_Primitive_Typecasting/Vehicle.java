package Non_Primitive_Typecasting;

public class Vehicle {
	public void travel() {
		System.out.println("Parent method");
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.travel();
		v = new Car();
		Car c = (Car) v;
		c.passenger();
	}
}
class Car extends Vehicle{
	public void passenger() {
		System.out.println("No of passenger is less");
	}
}
class Bike extends Vehicle{
	public void speed() {
		System.out.println("Less speed than a car");
	}
}
class Train extends Vehicle{
	public void ticket() {
		System.out.println("Need ticket to travel");
	}
}