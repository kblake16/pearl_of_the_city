package InventoryManager;


public class UserInfo{
	//Declaration of variables
	private String userName, fName , lName, address;
	private char[] password;
	private double pNumber, hNumber;
	
	private UserDataManager manager;
	
	public UserInfo(){
		
	}
	
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
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
	public void setlName(String lName){
		this.lName = lName;
	}
	public double getNumber(){
		return pNumber + hNumber;
	}
	public void setPhoneNumber(double pNumber, double hNumber) {
		this.pNumber = pNumber;
		this.hNumber=hNumber;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		}
	public void addUser (String userName, char[] password,String fName,String lName, int pNumber,int hNumber, String address) {
		this. userName= userName;
		this. password=password;
		this.fName=fName;
		this.lName=lName;
		this.pNumber=pNumber;
		this.hNumber=hNumber;
		this.address=address;
		
		manager = new UserDataManager();
		manager.saveToFile(userName, password, fName, lName, pNumber, hNumber, address);
	   
	
	}
	    
}
