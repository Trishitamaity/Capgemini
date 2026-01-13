package Day_2_Assignment;

public class Xylem_Phloem_Number {
	public static String Check_Xylem_Phloem(int num) {
	    num = Math.abs(num);
	    if (num < 10) {
	        return "phloem";
	    }
	    int lastDigit = num % 10;
	    int firstDigit = 0;
	    int middleSum = 0;
	    num = num / 10;
	    while (num > 9) {
	        middleSum += num % 10;
	        num = num / 10;
	    }
	    firstDigit = num;
	    if (firstDigit + lastDigit == middleSum) {
	        return "xylem";
	    } else {
	        return "phloem";
	    }
	}
	public static void main(String[] args) {
		int number = 1245;
		if(Check_Xylem_Phloem(number) == "xylem") {
			System.out.println(number + " is a XylemPhloem number");
		}else {
			System.out.println(number + " is not a XylemPhloem number");
		}
	}
}