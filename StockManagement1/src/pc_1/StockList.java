package pc_1;

public class StockList {

	String stock[] = {"TCS","Infosys","TataMotors","HUL"};
	int price[]= {30,50,60,70};
	
	public void showStockList()
	{
		for(int i=0;i<stock.length;i++)
		{
			System.out.println(i+1+" "+"Stock Name "+stock[i]+" "+"price"+" "+price[i]);
		}
	}
	
	// Method to get stock price by no
	public int getStockPrice(int stockNo)
	{
		int temp=0;
		switch(stockNo)
		{
		case 1:
			temp=30;
			break;
		case 2:
			temp=50;
			break;
		case 3:
			temp=60;
			break;
		case 4:
			temp=70;
			break;
		}
		
		return temp;
	}
	
	
	// Method to get stock Name From array
	public String getStockName(int stockNo)
	{
		String temp="";
		switch(stockNo)
		{
		case 1:
			temp="TCS";
			break;
		case 2:
			temp="INFOSYS";
			break;
		case 3:
			temp="TataMotors";
			break;
		case 4:
			temp="HUL";
			break;
		}
		
		return temp;
	}
	// Method to get stock price by Stock name
	public int getStockPrice(String stockName)
	{
		int temp=0;
		switch(stockName)
		{
		case "TCS":
			temp=30;
			break;
		case "INFOSYS":
			temp=50;
			break;
		case "TataMotors":
			temp=60;
			break;
		case "HUL":
			temp=70;
			break;
		}
		
		return temp;
	}
	
}
