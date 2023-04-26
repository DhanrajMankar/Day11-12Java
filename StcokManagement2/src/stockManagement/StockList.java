package stockManagement;

public class StockList {
	
	private String stockName;
	private int stockPrice;
	private int stockQuantity;
	
	public StockList(String stockName, int stockPrice, int stockQuantity) {
		super();
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.stockQuantity = stockQuantity;
	}
	@Override
	public String toString() {
		return "StockList [stockName=" + stockName + ", stockPrice=" + stockPrice + ", stockQuantity=" + stockQuantity
				+ "]";
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

}
