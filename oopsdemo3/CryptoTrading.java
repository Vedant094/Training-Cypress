package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 4:40:59 PM
* Project : CoreJava

*/

public class CryptoTrading extends Trading {

	public CryptoTrading(double tradeAmount) {
		super(tradeAmount);
	}

	@Override
	public void tradeDetails() {
		System.out.println("Crypto Trading: Trading digital currencies like Bitcoin, Ethereum.");
        System.out.println("Amount invested = " + tradeAmount);
	}

	@Override
	public double calculateProfitLoss() {
		  // Assume 20% profit
        return tradeAmount * 0.20;
	}
	
}
