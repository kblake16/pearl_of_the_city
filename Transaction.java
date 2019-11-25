package pear_of_the_city;

import java.util.ArrayList;

public class Transaction 
{
	private double gct = .165;
	private double subTotal = 0.0, tax = 0.0 , total = 0.0;
	private static int num = 1;
	private int recNum;
	//private Item item;
	private ArrayList<String> items;
	
	public Transaction() 
	{
		recNum = num;
		num++;
		items = new ArrayList<String>();
	}
	
	public int getRecNum()
	{
		return recNum;
	}
	
	//public ArrayList<String[]>
	
	/*public String addItem(Item item, int num)
	{
		
		calculateSubTotal(item.getSellPrice);
		calculateTax();
		calculateTotal();
	}**/
	
	private void calculateSubTotal(double num)
	{
		subTotal += num;
	}
	
	private void calculateTax()
	{
		tax = subTotal * gct;
	}
	
	private void calculateTotal()
	{
		total = subTotal + tax;
	}
	
	public double getSubTotal()
	{
		return subTotal;
	}
	
	public double getTax()
	{
		return tax;
	}
	
	public double getTotal()
	{
		return total;
	}
	
	public String toString()
	{
		String receipt = "";
		
		
		return receipt;
	}

}
