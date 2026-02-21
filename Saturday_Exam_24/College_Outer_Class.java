package Saturday_Exam_24;

public class College_Outer_Class {
	static interface Staff{
		enum Gender{
			Male, Female;
		}
		enum Role{
			Teacher, Security_Guard;
		}
		void print_salary(double sal);
		void work_days(int days);
		void num_of_staff(int m,int f);
	}		
	static class Student{
		enum Mode_Of_Attending{
			Offline,Online;
		}
		enum Course{
			CSE,IT,ECE;
		}
		void feesPay(int yr,Course c,Mode_Of_Attending m, double fees) {
			System.out.println(yr+"-batch "+c+" students of "+m+"-mode have to pay "+fees+" half yearly\n");
		}
	}
	static class Teacher implements Staff {
		@Override
		public void print_salary(double sal) {
			System.out.println(Staff.Role.Teacher+" gets a salary of "+sal+"\n");
		}
		public void work_days(int days) {
			System.out.println(Staff.Role.Teacher+" has to work "+days+" no. of days a week\n");
		}
		public void num_of_staff(int m,int f) {
			System.out.println("College has "+m+" "+Staff.Gender.Male+" & "+f+" "+Staff.Gender.Female+" "+Staff.Role.Teacher+" staffs\n");
		}
	}
	static class Security_Guard implements Staff {
		@Override
		public void print_salary(double sal) {
			System.out.println(Staff.Role.Security_Guard+" gets a salary of "+sal+"\n");
		}
		public void work_days(int days) {
			System.out.println(Staff.Role.Security_Guard+" has to work "+days+" no. of days a week\n");
		}
		public void num_of_staff(int m,int f) {
			System.out.println("College has "+m+" "+Staff.Gender.Male+" & "+f+" "+Staff.Gender.Female+" "+Staff.Role.Security_Guard+" staffs\n");
		}
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.feesPay(2022, College_Outer_Class.Student.Course.CSE, Student.Mode_Of_Attending.Offline, 75000.00);
		s.feesPay(2023, College_Outer_Class.Student.Course.ECE, Student.Mode_Of_Attending.Offline, 85000.00);
		s.feesPay(2024, College_Outer_Class.Student.Course.IT, Student.Mode_Of_Attending.Online, 95000.00);
		Teacher t=new Teacher();
		t.print_salary(63500.00);
		t.work_days(5);
		t.num_of_staff(20, 15);
		Security_Guard sg=new Security_Guard();
		sg.print_salary(23500.00);
		sg.work_days(6);
		sg.num_of_staff(10, 5);
	}	
}