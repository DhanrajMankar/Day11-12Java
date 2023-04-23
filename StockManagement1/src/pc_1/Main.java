package pc_1;

public class Main {

	public static void main(String[] args) {
		
		// Object creating
		StockList stockList =new StockList();
		Tread tread =new Tread();
		
		//Setting the account balance
		Account.setBalance(2000);
		
		//Shows the stock list available to bye
		stockList.showStockList();
		
		// calling byeStock method to bye the stocks
		tread.byeStocks();
		
		System.out.println();
		
		
		// Calling showPortfilio method to show user portfolio
		System.out.println("Your portfolio");
		MyPortfolio.showPortfilio();
		System.out.println("Your acount balance is = "+Account.getBalance());
		
		
		//Calling soldStock method to stock in user portfilio
		System.out.println();
		tread.soldStocks();
		System.out.println();
		System.out.println("Your acount balance is = "+Account.getBalance());
	}

}
