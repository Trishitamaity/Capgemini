package Day_2_Assignment;

public class Decimal_to_Binary {
	public static void main(String[] args) {
        int n = 11;
        int binary = 0;
        int decimal = 0;
        int place = 1;
        while (n > 0) {
            int rem = n % 2;
            binary = rem * place + binary;
            place = place * 10;
            n = n / 2;
        }
        System.out.println(binary);
        while (binary > 0) {
            int digit = binary % 10;
            decimal = decimal + digit * place;
            place = place * 2;
            binary = binary / 10;
        }
        System.out.println(decimal);
    }
}