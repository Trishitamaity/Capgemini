package Day_7_Assignment;

public interface Vehicle {
	void price();
	void type();
}
class Bike implements Vehicle {
	@Override
	public void price() {
		System.out.println(2000000);
	}
	@Override
	public void type() {
		System.out.println("petrol");
	}
}
class Car implements Vehicle{
	@Override
	public void price() {
		System.out.println(60000000);
	}
	@Override
	public void type() {
		System.out.println("EV");
	}
}