package stockManagement;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls Enter the no stock you want to add");
		int no=sc.nextInt();
		
		ArrayList<StockList>stockList = new ArrayList<StockList>();
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Pls Enter the stock Name");
	        String stockName=sc.next();
			
			System.out.println("Pls Enter the stock Price");
			int stockPrice=sc.nextInt();
			
			System.out.println("Pls enter the stock Quantity");
			int stockQuantity=sc.nextInt();
			
			stockList.add(new StockList(stockName,stockPrice,stockQuantity));
		}
		System.out.println();
		
		ListIterator<StockList>iterate = stockList.listIterator();
		
		
		int n=0;
		while(iterate.hasNext())
		{
		n++;
		StockList a=iterate.next();
		String stockName=a.getStockName();
		int stockPrice=a.getStockPrice();
		int stockQuantity=a.getStockQuantity();
		int totalPrice=stockPrice*stockQuantity;
		System.out.println(n+"-"+stockName+" "+stockPrice+" "+stockQuantity+" "+totalPrice+"rs");
		}

   }
}
