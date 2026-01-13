package Day_2_Assignment;

public class Leap_Year {
	public static boolean leap_year(int year) {
		if(((year % 100) != 0 && (year % 4) == 0) || ((year % 100) == 0 && (year % 400) == 0)){
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int year = 2024;
		if(leap_year(year) == true){
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
	}
}