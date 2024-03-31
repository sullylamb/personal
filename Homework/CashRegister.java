package program;

public class CashRegister {
	RetailItem item;
	int quantity;
	public CashRegister() {
		
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int GetQuantity() {
		return quantity;
	}
	public CashRegister(RetailItem item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	public double getSubtotal() {
		return item.GetPrice() * quantity;
	}
	public double getSalesTax() {
		return item.GetPrice() * .06;
	}
	public double getTotal() {
		return getSalesTax() + getSubtotal();
	}
}
