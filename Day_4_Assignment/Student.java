package Day_4_Assignment;

public class Student {
    private int rollNo;
    private double marks;
    private String password;
    public Student() {
    }
    public Student(int rollNo, double marks, String password) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.password = password;
    }
    public double getMarks(String password) {
        if (this.password == password) {
            return marks;
        } else {
            System.out.println("Password does not match");
            return 0;
        }
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setMarks(double marks) {
        if (marks >= 0) {
            this.marks = marks;
        }
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static void main(String[] args) {
        Student s1 = new Student(101, 85.5, "stud123");
        double m = s1.getMarks("stud123");
        System.out.println(m);
    }
}