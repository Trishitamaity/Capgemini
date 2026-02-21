package Enum;
import java.util.Comparator;

public class Student_Sort implements Comparator<Student1> {
	@Override
	public int compare(Student1 s1, Student1 s2) {
		return s1.id - s2.id;
	}
}