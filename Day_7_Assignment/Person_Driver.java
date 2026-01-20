package Day_7_Assignment;

public class Person_Driver {
	public static void main(String[] args) {
		Vehicle v = Help_Vehicle.getVehicle();
		v.price();
		v.type();
		Person p = new Person();
		p.setV(new Car());
		Vehicle v1 = p.getV();
		v1.price();
		v1.type();
		p.setV(new Bike());
		Vehicle v2 = p.getV();
		v2.price();
		v2.type();
	}
}
class Person {
	private Vehicle v;
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
}