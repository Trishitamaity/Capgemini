package Saturday_Exam_24;
import java.util.ArrayList;

public class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Id: " + id + " Name: " + name;
	}
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(10, "Trishita Maity"));
		list.add(new Student(11, "Suvojit Maity"));
		list.add(new Student(12, "Mousumi Maity"));
		Student s = new Student(13, "Srijita Maity");
		list.add(s);
		System.out.println(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).id);
			System.out.println(list.get(i).name);
		}
		for(Student s2 : list) {
			System.out.println(s2);
		}
	}
}