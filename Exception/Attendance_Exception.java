package Exception;
import java.util.Scanner;

public class Attendance_Exception extends RuntimeException {
	public Attendance_Exception(String message) {
		super(message);
	}
	public static void Check_attendance(int attendance) {
        if(attendance >= 75) {
        	System.err.println("Perfect");
        }else {
        	throw new Attendance_Exception(attendance + " Attendance is very low");
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the attendance");
        int attendance = sc.nextInt();
        try {
        	Check_attendance(attendance);
        }catch(Attendance_Exception e) {
        	System.err.println("Attendance exception is handled");
        }
	}
}