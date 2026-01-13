package Day_2_Assignment;

public class Decimal_to_Hexadecimal {
	public static void main(String[] args) {
        int n = 254;
        String hex = "";
        char digit;
        while (n > 0) {
            int rem = n % 16;
            if (rem < 10) {
                digit = (char) (rem + '0');
            } else {
                digit = (char) (rem - 10 + 'A');
            }
            hex = digit + hex;
            n = n / 16;
        }
        System.out.println(hex);
        int decimal = 0;
        int place = 1;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }
            decimal = decimal + value * place;
            place = place * 16;
        }
        System.out.println(decimal);
    }
}