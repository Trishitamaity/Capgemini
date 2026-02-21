package Enum;
import java.util.Currency;

public class Currency_Example {
	public static void main(String[] args) {
		Currency currency1 = Currency.getInstance("USD");
		System.out.println("Currency code: " + currency1.getCurrencyCode());
		System.out.println("Currency symbol: " + currency1.getSymbol());
		System.out.println("Currency name: " + currency1.getDisplayName());
		Currency currency2 = Currency.getInstance("INR");
		System.out.println("Currency code: " + currency2.getCurrencyCode());
		System.out.println("Currency symbol: " + currency2.getSymbol());
		System.out.println("Currency name: " + currency2.getDisplayName());
	}
}