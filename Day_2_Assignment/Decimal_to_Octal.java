package Day_2_Assignment;

public class Decimal_to_Octal {
	public static void main(String[] args) {
        int n = 83;
        int octal = 0;
        int place = 1;
        while (n > 0) {
            int rem = n % 8;
            octal = rem * place + octal;
            place = place * 10;
            n = n / 8;
        }
        System.out.println(octal);
        int decimal = 0;
        while (octal > 0) {
            int digit = octal % 10;
            decimal = decimal + digit * place;
            place = place * 8;
            octal = octal / 10;
        }
        System.out.println(decimal);
    }
}