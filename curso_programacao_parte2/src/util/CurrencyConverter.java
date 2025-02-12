package util;

public class CurrencyConverter {

	public static double dollarPrice, quantity;
	
	public static double amountToBePaid() {
		return dollarPrice * quantity * 1.06;
		
	}
	
	
}
