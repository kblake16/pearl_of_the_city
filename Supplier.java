package pearl_of_the_city;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
	private String name;
	private int pNumber;
	private String address;
	private List<String> supplies;

	public Supplier(String name,int pNumber,String address){
		this. name=name;
		this. pNumber= pNumber;
		this. address=address;
		this. supplies = new ArrayList<String>();

	}


	public String getName(){
		return name;
	}	

	public void setName(String name) {
		this.name = name;
		}

	public int getNumber(){
		return pNumber;
	}

	public void setNumber(int pNumber) {
		this.pNumber = pNumber;
		}
	
	public String getAddress(){
		return address;
	}
	
	
	public List<String> getSuppliesList(){
		return supplies;
	}

	public void setSupplies(List<String> supplies) {
		this.supplies = supplies;
		}
}