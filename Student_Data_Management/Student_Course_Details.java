package Student_Data_Management;

public class Student_Course_Details {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Trishita Maity");
		s.setAge(22);
		s.setRollNumber(51);
		s.setGrade("A++");
		Course c = new Course();
		c.setCourseid(321);
		c.setCourseName("Java");
		s.setCourse(c);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getRollNumber());
		System.out.println(s.getGrade());
		System.out.println(s.getCourse().getCourseName());
		System.out.println(s.getCourse().getCourseid());
	}
}