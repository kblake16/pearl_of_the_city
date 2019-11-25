package pearl_of-the-city;
import java.util.*;
public class InventoryItem extends Item {

//public Price pricing;


public  InventoryItem (String name, String bd, String type, int quan,  String des,double cp,  double sp){
    super( name, bd, type,  quan, des, cp, sp);
}
/**  This function uses  methods from the extended class
				 * @return  displays the name of item to the screen as ("Item Name ") 
			*/
public String getName(){
    String itemName = super.getName();
		   return ( "Item's Name : " + itemName);
}

/**  This function uses  the method get brand  from the parent class.
				 * @return  displays the brand name  to the screen 
			*/

public String getBrand() {
		  String brandName = super.getBrand();
           return ( "Brand's Name :" + brandName);
}
/**  This function uses  the method get price from the parent class.
				 * @return  displays the cost price of item to the screen 
			*/
public double  getPrice (){
     pp = super.getPrice();
    return pp;
}
/**  This function uses  the method get sell price from the parent class.
				 * @return  displays the sell price of item to the screen 
			*/
public double getSellPrice (){
     sp = super.getSellPrice();
     return sp;
}
/**  This function uses  the method get quantity from the parent class.
				 * @return  displays the quantity of item to the screen 
			*/
public int getQuantity(){
    quan = super.getQuantity();
    return quan;
}
/**  This function uses  the method get Description from the parent class.
				 * @return  displays the description of item to the screen 
			*/
public String  getDescription(){
    des = super.getDescription();
    return des;
}
/**  Sets the name  for the item to what the user desires. 
			  * @param name  item's name should be set to what is entered
			  */
public String editName ( String name){
   en = super.editName(name); 
   return en;
}
/**  Sets the  cost price for the contact to what the user desires. 
* @param price  cost price should be set to what is entered
*/
public void changePrice (double price){
      super.changePrice(price);     
 }
/**  Sets the  selling price for the contact to what the user desires. 
* @param price  selling price should be set to what is entered
*/
public void changeSellPrice(double price){
    super.changeSellPrice(price);   
}
/**  Removes the desired quantity for the item  
* @param num quantity should be manipulated to what is entered
*/
public void removeQuantity (int num){
     super.removeQuantity(num);
   
}

/**  edits the description  for the item  
* @param num quantity should be manipulated by what is entered
*/

public void editDescription(Stirng name){
    super.editDescription(name);
    
}
/**  Adds the desired quantity for the item  
* @param num quantity should be manipulated by what is entered
*/
public void addQuantity( int num){
     super.addQuantity(num);
}



/**  Sets the prices for the item to what the user desires. 
			  * @param cp @param sp,  address should be set to what is entered
			  * Creates a new object of the chaper class
			  
	    
 public void setPricing(int cp , int sp ) {
			
Price pricing = new Price (cp, sp);
this.pricing = pricing;
                }
                
/**  Gets  the price  for the item
* @return String  with Cost price info 

public String getPrice () {
return pricing.getCostPrice();
}

/**  Gets  the price  for the item
* @return String  with Cost price info 

public String getPrice () {
return pricing.getCostPrice();
}
*/

public String appDisplay(){
    return " Entry No: "  + super.getEntryNo() + "\n" +  "Name :" + getName() + "\n" +  "Brand: " + getBrand() + "\n" + "Description: " + getDescription() + "Cost Price :" + getCostPrice() + "Selling Price :" + getSellPrice();
}
}
