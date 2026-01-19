package Day_6_Assignment;

public abstract class Mobile {
	public abstract void camera();
	public abstract void battery();
	public static void main(String[] args) {
		Redmi3 r3 = new Redmi3();
		r3.camera();
		r3.battery();
		r3.smart_camera();
		Redmi2 r2 = new Redmi3();
		r2.camera();
		r2.battery();
		r2.smart_camera();
		Redmi1 r1 = new Redmi3();
		r1.camera();
		r1.battery();
	}
}
abstract class Redmi1 extends Mobile{
	@Override
	public void camera() {
		System.out.println("Camera is good");
	}
}
abstract class Redmi2 extends Redmi1{
	@Override
	public void battery() {
		System.out.println("Powerful battery");
	}
	public abstract void smart_camera();
}
class Redmi3 extends Redmi2{
	@Override
	public void smart_camera() {
		System.out.println("Best camera quality");
	}
}