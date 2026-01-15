package Non_Primitive_Typecasting;

public class Driver {
	public static void main(String[] args) {
		Engine e = new Engine();
		e.setCc(450);
		e.setType("Petrol");
		Car1 c = new Car1();
		c.setId(101);
		c.setBrand("Toyota");
		c.setColour("Black");
		c.setEngine(e);
		System.out.println(c.getId());
		System.out.println(c.getBrand());
		System.out.println(c.getColour());
		System.out.println(e.getCc());
		System.out.println(e.getType());
	}
}