package Day_8_Assignment;

public class Object_Class {
	String name;
	int id;
	public Object_Class(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Id:" + id + " Name:" + name;
	}
	public static void main(String[] args) {
		Object_Class o = new Object_Class("Trishita", 51);
		System.out.println(o);
	}
}