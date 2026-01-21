package Day_8_Assignment;
import java.util.*;

public class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, marks);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}else {
			Student s = (Student) obj;
			if(this.id == s.id && this.name == s.name) {
				return true;
			}
			return false;
		}
	}
	public static void main(String[] args) {
		Student s1 = new Student(21, "Suvojit", 97);
		Student s2 = new Student(21, "Trishita", 51);
		Student s3 = s1;
		Student s4 = null;
		Object obj = new Student(31, "Raju", 78);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2.hashCode() == s3.hashCode());
		System.out.println(s1.getClass() == s3.getClass());
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}