package pc_1;

import java.util.Scanner;

public class Tread {

	Scanner sc = new Scanner(System.in);
	StockList stockList = new StockList();
	
	public void byeStocks()
	{
		
	System.out.println("Pls enter the name of stock you want to bye");
	int stockNo = sc.nextInt() ;//stockList.getStockName(sc.nextLine());
	int price = stockList.getStockPrice(stockNo);
	
	System.out.println("pls enter the no of shears you want to bye");
	int quantity = sc.nextInt();
	int totalPrice = quantity*price;
	int accountBalance=Account.getBalance();	
	if(accountBalance>totalPrice)
	{
	
			MyPortfolio.myStocks.add(stockList.getStockName(stockNo));
		    MyPortfolio.stocksQuantity.add(quantity);
		    System.out.println("Done");
		    Account.setBalance((Account.getBalance())-(totalPrice));
	}
	else
	{
		System.out.println("Your account balance is NOT sufficient to bye the stocks");
	}
	}
	
	
	public void soldStocks()
	{
		MyPortfolio.showPortfilio();
		
		System.out.println("Enter the no of stock you want to sell");
		int n=sc.nextInt();
		System.out.println("Enter the quantity you want to sold");
		int q=sc.nextInt();
		int price=0;
		
		if(q<=MyPortfolio.stocksQuantity.get(n-1))
		{
			String temp=MyPortfolio.myStocks.get(n-1);
			price=stockList.getStockPrice(temp);
			int total=price*q;
			int balance=total+Account.getBalance();
			Account.setBalance(balance);
			if(q==MyPortfolio.stocksQuantity.get(n-1))
			{
				MyPortfolio.stocksQuantity.remove(n-1);
				MyPortfolio.myStocks.remove(n-1);
			}
		}
		else
		{
			System.out.println("Your prtfolio has NOT suficient NO of shear");
			System.out.println("you only have "+MyPortfolio.stocksQuantity.get(n-1)+" "+"NO of shears");
		}
		
	}
	
}
