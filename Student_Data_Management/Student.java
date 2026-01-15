package Student_Data_Management;

public class Student extends Person {
	private int roll_Number;
	private String grade;
	private Course course;
	public int getRollNumber() {
		return roll_Number;
	}
	public String getGrade() {
		return grade;
	}
	public Course getCourse() {
		return course;
	}
	public void setRollNumber(int roll_Number) {
		this.roll_Number = roll_Number;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
}