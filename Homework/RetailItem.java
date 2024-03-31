package program;

public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String description, int unitsOnHand, double price) {
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
	}
	public void SetDescription(String description) {
		this.description = description;
	}
	public String GetDescription() {
		return description;
	}
	public void SetStock(int items) {
		unitsOnHand = items;
	}
	public int GetStock() {
		return unitsOnHand;
	}
	public void SetPrice(double price) {
		this.price = price;
	}
	public double GetPrice() {
		return price;
	}
}
