package InventoryManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class SupplierDataManager 
{
	private SupplierInfo supplier;
	
	 public void saveToFile(String name,double pNumber,String address, String email)
	    {
	    	try
	    	{
	    		FileWriter fw = new FileWriter("supplierdetails.txt",true);
	    		BufferedWriter br = new BufferedWriter(fw);
	    		
	    		String enter = name + ";" + String.valueOf(pNumber) + ";" + address + ";" + email;
	    		
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
	    
	    
	    
	    public SupplierInfo readFromFile()
	    {
	    	String line = null;
	    	supplier = new SupplierInfo();
	    	
	    	try
	    	{
	    		FileReader fr = new FileReader("supplierdetails.txt");
	    		BufferedReader reader = new BufferedReader(fr);
	    		
	    		line = reader.readLine();
	    		
	    		while(line != null)
	    		{
	    			String[] splitString = line.split(";");
	    			
	    			String name = splitString[0];
	    			supplier.setName(name);
	    			
	    			Double pNumber = Double.parseDouble(splitString[1]);
	    			supplier.setNumber(pNumber);
	    			
	    			String address = splitString[2];
	    			supplier.setAddress(address);
	    			
	    			String email = splitString[2];
	    			supplier.setAddress(email);
	    			
	    		}
	    		reader.close();
	    	}
	    	catch (IOException e)
	    	{
	    		System.out.println(e);
	    	}
	    	return supplier;
	    }
	    
}

