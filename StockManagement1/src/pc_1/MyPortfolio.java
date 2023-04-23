package pc_1;

import java.util.ArrayList;

public class MyPortfolio {
	
	static ArrayList<String>myStocks = new ArrayList<String>();
	static ArrayList<Integer>stocksQuantity = new ArrayList<Integer>();
	
	// Static method to show the stocks and no of shears 
	public static void showPortfilio()
	{
		for(int i=0;i<myStocks.size();i++)
		{
			System.out.println(i+1+" "+"Stock Name: "+myStocks.get(i)+" "+"NO of Shears"+stocksQuantity.get(i));
		}
		
	}
	
}
