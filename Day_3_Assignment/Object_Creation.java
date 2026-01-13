package Day_3_Assignment;

public class Object_Creation {
	int id;
	String name;
	{
		System.out.println("N-S 1");
	}
	{
		System.out.println("N-S 2");
	}
	public void study() {
		System.out.println(id);
		System.out.println(name);
		System.out.println("Now studying Java");
	}
	public static void main(String[] args) {
		Object_Creation s = new Object_Creation();
		s.id = 10;
		s.name = "Trishita Maity";
		System.out.println(s.id);
		System.out.println(s.name);
		s.study();
	}
}