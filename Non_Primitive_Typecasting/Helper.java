package Non_Primitive_Typecasting;

public class Helper {
	public static void get_vehicle(Vehicle v) {
		if (v instanceof Car) {
			Car car = (Car) v;
			car.passenger();
		} else if (v instanceof Bike) {
			Bike bike = (Bike) v;
			bike.speed();
		} else if (v instanceof Train) {
			Train train = (Train) v;
			train.ticket();
		}
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		System.out.println(v instanceof Vehicle);
		System.out.println(v instanceof Bike);
		System.out.println(v instanceof Car);
		System.out.println(v instanceof Train);
		Bike b = new Bike();
		get_vehicle(b);
		System.out.println(b instanceof Bike);
		System.out.println(b instanceof Vehicle);
		Car c = new Car();
		get_vehicle(c);
		System.out.println(c instanceof Car);
		System.out.println(c instanceof Vehicle);
		Train t = new Train();
		get_vehicle(t);
		System.out.println(t instanceof Train);
		System.out.println(t instanceof Vehicle);
	}
}