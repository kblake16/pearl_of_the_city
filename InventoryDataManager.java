package InventoryManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class InventoryDataManager 
{
	private Inventory inventory;
	
	 public void saveToFile(String code, String category, String name, double costPrice, double sellPrice, int quantity, String description)
	    {
	    	try
	    	{
	    		FileWriter fw = new FileWriter("InventoryDatabase.txt",true);
	    		BufferedWriter br = new BufferedWriter(fw);
	    		
	    		String enter = code + ";" + category + ";" + name + ";" + String.valueOf(costPrice) + ";" + String.valueOf(sellPrice) + ";" + String.valueOf(quantity) + ";" + description;
	    		
	    		br.newLine();
	    		br.write(enter);
	    		
	    		br.close();
	    		fw.close();
	    	}
	    	catch(IOException e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    
	    
	    
	    public Inventory readFromFile()
	    {
	    	String line = null;
	    	inventory = new Inventory();
	    	
	    	try
	    	{
	    		FileReader fr = new FileReader("InventoryDatabase.txt");
	    		BufferedReader reader = new BufferedReader(fr);
	    		
	    		line = reader.readLine();
	    		
	    		while(line != null)
	    		{
	    			String[] splitString = line.split(";");
	    			
	    			String code = splitString[0];
	    			String category = splitString[1];
	    			String name = splitString[2];
	    			double costPrice = Double.parseDouble(splitString[3]);
	    			double sellPrice = Double.parseDouble(splitString[4]);
	    			int quantity = Integer.parseInt(splitString[5]);
	    			String description = splitString[6];
	    			
	    			inventory.addItem(code,category,name,costPrice,sellPrice,quantity,description);
	    		}
	    		reader.close();
	    	}
	    	catch (IOException e)
	    	{
	    		System.out.println(e);
	    	}
	    	return inventory;
	    }
	    
}
