import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Transaction 
{
	final private double gct = .165;
	private double subTotal = 0.0, tax = 0.0 , total = 0.0, card = 0.0, cash = 0.0, change = 0.0;
	private static int num = 1;
	private int recNum;
	private ArrayList<String[]> items;
	private String[] product;
	private LocalDate date = LocalDate.now();
	private LocalTime time = LocalTime.now();
	
	public Transaction() 
	{
		recNum = num;
		num++;
		items = new ArrayList<String[]>();
	}
	
	public Transaction(int recNum, LocalDate date, LocalTime time, ArrayList<String[]> items, double subTotal, double tax, double total, double card, double cash, double change) 
	{
		this.recNum = recNum;
		this.date = date;
		this.time = time;
		this.items = items;
		this.subTotal = subTotal;
		this.tax = tax;
		this.total = total;
		this.card = card;
		this.cash = cash;
		this.change = change;
	}
	
	public int getRecNum()
	{
		return recNum;
	}
	
	public void addItem(Item item, int num)
	{
		double price = item.getSellPrice() * num;
		
		product = new String[4];
		
		product[0] = item.getEntryNo();
		product[1] = item.getName();
		product[2] = String.valueOf(num);
		product[3] = String.valueOf(price);
		
		items.add(product);
		
		calculateSubTotal(price);
		calculateTax();
		calculateTotal();
	}
	
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
	
	public void setCardPayment(double num)
	{
		card = num;
	}
	
	public double getCardPayment()
	{
		return card;
	}
	
	public void setCashPayment(double num)
	{
		cash = num;
	}
	
	public double getCashPayment()
	{
		return cash;
	}
	
	public void calculateChange()
	{
		change = cash - getTotal();
	}
	
	public double getChange()
	{ 
		return change;
	}
	
	public String getDate()
	{
		return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
	}
	
	public String getTime()
	{
		return time.toString();
	}
	
	public ArrayList<String[]> getItems()
	{
		return items;
	}
	
	public String toString()
	{
		String receipt = "";
		receipt += "Pearl of the City Beauty Store" + "/n";
		
		receipt += "Receipt No.: " + getRecNum() + "/n";
		receipt += "Date: " + "/n";
		receipt += "Time: " + "/n";
		
		receipt += "***********************************************" + "/n";
		
		for (String[] i: items)
		{
			receipt += i[0] + "   " + i[1] + "   " + i[2] + "   " + i[4]+ "/n";
		}
		
		receipt += "***********************************************" + "/n";
		
		receipt += "Subtotal		" + getSubTotal() + "/n";
		receipt += "Tax				" + getTax() + "/n";
		receipt += "TOTAL			" + getTotal() + "/n";
		//receipt += "Card Tend		" + getCardPayment() + "/n";
		//receipt += "Cash			" + getCashPayment() + "/n";
		//receipt += "CHANGE			" + getChange() + "/n";
		
		
		return receipt;
	}

}
