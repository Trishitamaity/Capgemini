package Day_2_Assignment;

public class Bit_Count {
	public static int Decimal_to_Binary(int number) {
        int binary = 0;
        int place = 1;
        while (number > 0) {
            int rem = number % 2;
            binary = rem * place + binary;
            place = place * 10;
            number = number / 2;
        }
        return binary;
	}
	public static void main(String[] args) {
        int n = 31, rem = 0, count = 0;
        int number = Decimal_to_Binary(n);
        while (number > 0) {
        	rem = number % 10;
        	if(rem == 1) {
        		count++;
        	}
        	number = number / 10;
        }
        System.out.println(count);
    }
}