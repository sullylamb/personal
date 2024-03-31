package program;

import java.util.ArrayList;
import java.util.Scanner;
public class Main_CashRegister {
	public static void PrintMenu(RetailItem item1,RetailItem item2,RetailItem item3) {
		System.out.println("\tDescription\tUnits on Hand\tPrice");
		System.out.println("Item #1\t" + item1.GetDescription() + "\t\t " + item1.GetStock() + "\t\t" + item1.GetPrice() );
		System.out.println("Item #2\t" + item2.GetDescription() + "\t " + item2.GetStock() + "\t        " + item2.GetPrice() );
		System.out.println("Item #3\t" + item3.GetDescription() + "\t\t " + item3.GetStock() + "\t\t" + item3.GetPrice() );
	}
	

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double sum = 0;
		int quantity = 0;
		String answer = "b";
		int t_quantity = 0;
		double tax = 0;
		ArrayList<CashRegister> itemList = new ArrayList<CashRegister>();
		RetailItem item1 = new RetailItem("Jacket", 12 , 59.95);
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem item3 = new RetailItem("Shirt", 20 , 24.95);
		
		int number;
		while (answer.charAt(0) != 'n') {
		PrintMenu(item1, item2, item3);
		System.out.println("Please select an item number: ");
		number = scnr.nextInt();
		if (number == 1)
		{
		 System.out.println("Please select the quantity: ");
		 quantity = scnr.nextInt();
		 CashRegister item_one = new CashRegister(item1, quantity);
		 itemList.add(item_one);
		 System.out.println("Would you like to buy another item?");
		 answer = scnr.next();
		 
		 
		}
		if (number == 2)
		{
			System.out.println("Please select the quantity: ");
			quantity = scnr.nextInt();
			CashRegister item_two = new CashRegister(item2, quantity);
			itemList.add(item_two);
			System.out.println("Would you like to buy another item?");
			answer = scnr.next();
		}
		if (number == 3)
		{
			System.out.println("Please select the quantity: ");
			quantity = scnr.nextInt();
			CashRegister item_three = new CashRegister(item3, quantity);
			itemList.add(item_three);
			System.out.println("Would you like to buy another item?");
			answer = scnr.next();
		}	
		}
			 
			 
		
		
		for (int i = 0; i < itemList.size(); ++i)
		{
			sum += itemList.get(i).getSubtotal();
			tax += itemList.get(i).getSalesTax();
			t_quantity += itemList.get(i).GetQuantity();
		}
		System.out.printf("Subtotal: $%.2f\n",sum);
		System.out.printf("Sales Tax: $%.2f\n",tax);
		System.out.printf("Total: $%.2f\n",(sum + tax));
		if (t_quantity > 1) {
		System.out.println("You bought " + (t_quantity)+ " items");
		}
		else {
			
		System.out.println("You bought " + (t_quantity)+ " item");
			scnr.close();
		}
	}

}
