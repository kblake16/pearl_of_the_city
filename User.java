package pearl_of_the_city;

import java.util.*;

public class User{
	private String userName, fName , lName, address;
	private char[] password;
	private int pNumber, hNumber; // Maybe phone numbers should be a String to include hyphen (876-432-5786)
	
	public User(String userName, char[] password,String fName,String lName, int pNumber,int hNumber, String address){
		this. userName= userName;
		this. password=password;
		this.fName=fName;
		this.lName=lName;
		this.pNumber=pNumber;
		this.hNumber=hNumber;
		this.address=address;
	}
	
	public String getUserName(){
		return userName;
	}
	public voidd setUserName(String userName){
		this. userName=userName;
	}

	public char[] getPassword(){
		return password;
	}
	
	public void setPassword(char[]password){
		this.password=password;
	}

	public String getfName(){
		return fName;
	}
	public void setfName(String fName){
		this. fName=fName;
	}
	public String getlName(){
		return lName;
	}

	public int getNumber(){
		return pNumber + hNumber;
	}
	public void setPhoneNumber(int pNumber,int hNumber) {
		this.pNumber = pNumber;
		this.hNumber=hNumber;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		}
}