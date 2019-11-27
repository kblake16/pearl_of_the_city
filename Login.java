package InventoryManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Login 
{

    private String username;
    private String password;
    private ArrayList<String[]> users = new ArrayList<String[]>();
    private String[] user = new String[2];
    
    public Login (){}
    
    public void loginUser() {readFromFileUser();}
    public void loginAdmin() {readFromFileAdmin();
    for (String[] i: users)
    {
    	System.out.println(i[0] + i[1]);
    }
    }
    
    
    public void addUser(String username, String password)
    {
    	this.username = username;
    	this.password = password;
    	
    	user[0] = username;
    	user[1] = password;
    	
    	users.add(user);
    	
    	saveToFileUser(this.username, this.password);
 
    }
    
    public void addAdmin(String username, String password)
    {
    	this.username = username;
    	this.password = password;
    	
    	user[0] = username;
    	user[1] = password;
    	
    	users.add(user);
    	
    	saveToFileAdmin(this.username, this.password);
 
    }
    
    public String getUserName()
    {
    	return username;
    }
    
    public String getPassword()
    {
    	return password;
    }
    
    public boolean isCorrect(String name, char[] pass)
    {
    	boolean isCorrect = false;
    	
    	System.out.println(name + pass);
    	for (String[] i: users)
    	{
    		String word = i[0];
    		if (word.equals(name))
    		{
    			String correctPass = i[1];
    			
    			String epass = String.valueOf(pass);
    			
    			if (correctPass.equals(epass))
    			{
    				isCorrect = true;
    			}
    		}
    		
    	}
    	
    	return isCorrect;
    }
    
    public boolean restPassword(String name,char[] pass, char[] pass2)
    {
    	boolean reset = false;
    	
    	for(String[] i: users)
    	{
    		String word = i[0];
    		
    		if (word.equals(name))
    		{
    			if (pass.equals(pass2))
    			{
    				i[1] = String.valueOf(pass);
    				reset = true;
    			}
    		}
    	}
    	
    	return reset;
    }
    
    private void saveToFileUser(String name, String pass)
    {
    	try
    	{
    		FileWriter fw = new FileWriter("user.txt",true);
    		BufferedWriter br = new BufferedWriter(fw);
    		
    		String enter = name + ";" + pass;
    		
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
    
    private void saveToFileAdmin(String name, String pass)
    {
    	try
    	{
    		FileWriter fw = new FileWriter("admin.txt",true);
    		BufferedWriter br = new BufferedWriter(fw);
    		
    		String enter = name + ";" + pass;
    		
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
    
    
    
    private void readFromFileUser()
    {
    	String line = null;
    	
    	try
    	{
    		FileReader fr = new FileReader("users.txt");
    		BufferedReader reader = new BufferedReader(fr);
    		
    		line = reader.readLine();
    		while(line != null)
    		{
    			String[] splitString = line.split(";");
    			
    			user[0] = splitString[0];
    			user[1] = splitString[1];
    			
    			users.add(user);
    			line = reader.readLine();
    		}
    		reader.close();
    	}
    	catch (IOException e)
    	{
    		System.out.println(e);
    	}
    }
    
    private void readFromFileAdmin()
    {
    	String line = null;
    	
    	try
    	{
    		FileReader fr = new FileReader("admin.txt");
    		BufferedReader reader = new BufferedReader(fr);
    		
    		line = reader.readLine();
    		while(line != null)
    		{
    			String[] splitString = line.split(";");
    			
    			user[0] = splitString[0];
    			user[1] = splitString[1];
    			
    			users.add(user);
    			line = reader.readLine();
    		}
    		reader.close();
    	}
    	catch (IOException e)
    	{
    		System.out.println(e);
    	}
    }

}
