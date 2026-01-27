package Saturday_Exam_24;

public class Inner_Class {
	static int a = 10;
	static class Student {
		public static void m1() {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Student.m1();
	}
}