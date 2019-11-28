package InventoryManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class UserDataManager 
{
	private UserInfo user;
	
	 public void saveToFile(String userName, char[] password,String fName,String lName, int pNumber,int hNumber, String address)
	    {
	    	try
	    	{
	    		FileWriter fw = new FileWriter("userdetails.txt",true);
	    		BufferedWriter br = new BufferedWriter(fw);
	    		
	    		String enter = userName + ";" + String.valueOf(password) + ";" + fName + ";" + lName + ";" + String.valueOf(pNumber) + ";" + String.valueOf(hNumber) + ";" + address;
	    		
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
	    
	    
	    
	    public UserInfo readFromFile()
	    {
	    	String line = null;
	    	user = new UserInfo();
	    	
	    	try
	    	{
	    		FileReader fr = new FileReader("userdetails.txt");
	    		BufferedReader reader = new BufferedReader(fr);
	    		
	    		line = reader.readLine();
	    		
	    		while(line != null)
	    		{
	    			String[] splitString = line.split(";");
	    			
	    			String userName = splitString[0];
	    			user.setUserName(userName);
	    			
	    			String password = splitString[1];
	    			user.setPassword(password.toCharArray());
	    			
	    			String fName = splitString[2];
	    			user.setfName(fName);
	    			
	    			String lName = splitString[3];
	    			user.setlName(lName);
	    			
	    			double pNumber = Double.parseDouble(splitString[4]);
	    			double hNumber = Double.parseDouble(splitString[5]);
	    			user.setPhoneNumber(pNumber, hNumber);
	    			
	    			String address = splitString[6];
	    			user.setAddress(address);
	    			
	    			//user.addUser(userName, password, fName, lName, pNumber, hNumber, address);
	    		}
	    		reader.close();
	    	}
	    	catch (IOException e)
	    	{
	    		System.out.println(e);
	    	}
	    	return user;
	    }
	    
}

