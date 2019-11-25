package pearl_of_the_city;

import java.util.ArrayList;

public class SaleBook 
{
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public SaleBook() {}
	
	public String getTransaction(int recNum)
	{
		String print = "";
		for (Transaction t: transactions)
		{
			if (t.getRecNum() == recNum)
			{
				print = t.toString();
			}
		}
		return print;
	}
	
	public void removeTransaction(int recNum)
	{
		for (Transaction t: transactions)
		{
			if (t.getRecNum() == recNum)
			{
				transactions.remove(t);
			}
		}
	}

}
