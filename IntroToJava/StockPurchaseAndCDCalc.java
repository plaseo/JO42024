package IntroToJava;

public class StockPurchaseAndCDCalc {

	public static void main(String[] args) {
		// define the variablesd
		int savings = 25000;
		int pricePerShare = 989;
		
		// perform calculations
		int numberOfShares = savings / pricePerShare;
		System.out.println("Buy " + numberOfShares + " shares of stock");
		int remainsForCD = savings -  numberOfShares * pricePerShare;
		System.out.println("Invest $" + remainsForCD + " in CD account");
	}

}
