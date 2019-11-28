package InventoryManager;


public class SupplierInfo {
	private String name;
	private Double pNumber;
	private String address;
	private String email;

	private SupplierDataManager manager;
	public SupplierInfo(){
		

	}


	public String getName(){
		return name;
	}	

	public void setName(String name) {
		this.name = name;
		}

	public Double getNumber(){
		return pNumber;
	}

	public void setNumber(Double pNumber) {
		this.pNumber = pNumber;
		}
	
	public String getAddress(String address){
		return this.address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getEmail(){
		return email;
	}	

	public void setEmail(String email) {
		this.email = email;
		}
	public void addUser (String name,Double pNumber,String address, String email) {
		this. name = name;
		this.pNumber = pNumber;
		this.address = address;
		
		manager = new SupplierDataManager();
		manager.saveToFile(name,pNumber,address,email);
	   
	
	}

}
