package program;
import java.util.ArrayList;
public class Main_Retail {
    public static void main(String[] args) {
	
		ArrayList<RetailItem> itemList = new ArrayList<RetailItem>();
		RetailItem Jacket = new RetailItem("Jacket", 12 , 59.95);
		RetailItem Jeans = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem Shirt = new RetailItem("Shirt", 20 , 24.95);
		itemList.add(Jacket);
		itemList.add(Jeans);
		itemList.add(Shirt);
	}

	

}
