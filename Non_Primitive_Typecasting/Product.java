package Non_Primitive_Typecasting;

public class Product {
	String brand;
	public Product() {
	}
	public Product(String brand) {
		this.brand = brand;
	}
	public void print_product() {
		System.out.println("The brand name is " + brand);
	}
	public static void main(String[] args) {
		Mobile m = new Mobile("Redmi", 18000, "Vodafone");
		Laptop l = new Laptop("HP", 100000, "intel");
		m.print_product();
		l.print_product();
		m.print_mobile();
		l.print_laptop();
	}
}
class Mobile extends Product{
	double price;
	String SIM;
	public Mobile(String brand, double price, String SIM) {
		super(brand);
		this.price = price;
		this.SIM = SIM;
	}
	public void print_mobile() {
		print_product();
		System.out.println("The price is " + price);
		System.out.println("The SIM name is " + SIM);
	}
}
class Laptop extends Product{
	double price;
	String processor;
	public Laptop(String brand, double price, String processor) {
		super(brand);
		this.price = price;
		this.processor = processor;
	}
	public void print_laptop() {
		print_product();
		System.out.println("The price is " + price);
		System.out.println("The processor name is " + processor);
	}
}