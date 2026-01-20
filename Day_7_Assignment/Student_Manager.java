package Day_7_Assignment;

public class Student_Manager {
	public Student[] checkmarks(Student[] s) {
		int count = 0;
	    for (int i = 0; i < s.length; i++) {
	        if (s[i].marks >= 35) {
	            count++;
	        }
	    }
		Student[] s2 = new Student[count];
		int j = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i].marks >= 35) {
				s2[j] = s[i];
				j++;
			}
		}
		return s2;
	}
	public static void main(String[] args) {
		Student[] students = new Student[3];
		Student_Manager s = new Student_Manager();
		students[0] = new Student(18, "Virat", 94);
		students[1] = new Student(45, "Rohit", 96);
		students[2] = new Student(7, "Dhoni", 32);
		Student[] s2 = s.checkmarks(students);
		for(int i = 0; i < s2.length; i++) {
			System.out.println(s2[i].id);
			System.out.println(s2[i].name);
		}
		for(Student s1 : students) {
			System.out.println(s1.id);
			System.out.println(s1.name);
		}
	}
}