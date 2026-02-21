package DSA_Day_5;
import java.util.Arrays;

public class Student {
	int id;
	String name;
	int[] marks;
	public Student(int id, String name, int[] marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public static void main(String[] args) {
		Student[] students = {
		        new Student(1, "Dharani", new int[]{85, 90, 88}),
		        new Student(2, "Arjun", new int[]{78, 82, 80}),
		        new Student(3, "Bala", new int[]{92, 88, 95}),
		        new Student(4, "Kiran", new int[]{70, 75, 72}),
		        new Student(5, "Meena", new int[]{89, 91, 87}),
		        new Student(6, "Sanjay", new int[]{60, 65, 68}),
		        new Student(7, "Lakshmi", new int[]{93, 94, 90}),
		        new Student(8, "Ravi", new int[]{76, 79, 74}),
		        new Student(9, "Anitha", new int[]{84, 86, 83}),
		        new Student(10, "Vikram", new int[]{88, 89, 90})
		};
        ArrayWrapper<Student> arrayWrapper = new ArrayWrapper<>(students);
        arrayWrapper.sort(s -> s.name).asc();
        for(Student s : students) {
            System.out.println(s.name + " " + Arrays.toString(s.marks));
        }
	}
}
class Compare_1 {
	static boolean compare_string(String s1, String s2) {
		if(s1 == null && s2 == null) {
			return true;
		}else if(s1 == null || s2 == null){
			return false;
		}else if(s1.length() != s2.length()) {
			return false;
		}
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	static boolean compare_int_array(int[] a, int[] b) {
		if(a == null && b == null) {
			return true;
		}else if(a == null || b == null){
			return false;
		}else if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	static boolean compare_student(Student s1, Student s2) {
		if(s1 == s2) {
			return true;
		}else if(s1 == null || s2 == null){
			return false;
		}else if(s1.id != s2.id) {
			return false;
		}else if(!compare_string(s1.name, s2.name)) {
			return false;
		}else if(!compare_int_array(s1.marks, s2.marks)) {
			return false;
		}
		return true;
	}
}