import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Kayla Blake
 * @version 1.0
 * @since 2019-11-16
 */

public class SalesDataManager 
{
	private File file;
	private final String fileName = "Sales.txt";
	private BufferedReader reader;
	private BufferedWriter writer;
	private Transaction sale;
	private SaleBook book;
	
	public SalesDataManager() {}
	
	public void saveToFile(Transaction sale)
	{
		this.sale = sale;
		try
		{
			FileWriter fw = new FileWriter(file,true);
			writer = new BufferedWriter(fw);
			
			String enter = this.sale.getRecNum() + ";"
							+ this.sale.getSubTotal();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
}
