package Enum;
import java.text.NumberFormat;
import java.util.Locale;

public class Currency_Format {
	public static void main(String[] args) {
		double amount = 123456.789;
		NumberFormat India_Format = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		System.out.println("India: " + India_Format.format(amount));
		NumberFormat US_Format = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US: " + US_Format.format(amount));
		NumberFormat Japan_Format = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println("Japan: " + Japan_Format.format(amount));
	}
}