package Day_4_Assignment;

public class Student_Details {
	private int id;
	private String name;
	private int password;
	public Student_Details() {
	}
	public Student_Details(int id, String name, int password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPass() {
		return password;
	}
	public void setVariable(int id, String name, int password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}		
	public static void main(String[] args) {
		Student_Details s = new Student_Details(123, "Trishita", 762356);
		System.out.println(s.name);
		System.out.println(s.getPass());
	}
}