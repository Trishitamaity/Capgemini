package Enum;
import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Student1> a = new ArrayList<Student1>();
		a.add(new Student1(10, "Trishita Maity"));
		a.add(new Student1(20, "Suvojit Maity"));
		a.add(new Student1(30, "Srijita Maity"));
		Collections.sort(a, new Student_Sort());
		for (Student1 s : a) {
			System.out.println(s.id + " " + s.name);
		}
		Collections.sort(a, (s1, s2) -> s1.id - s2.id);
		System.out.println(a);
	}
}
class Student1 {
	int id;
	String name;
	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id + " " + name;
	}
}